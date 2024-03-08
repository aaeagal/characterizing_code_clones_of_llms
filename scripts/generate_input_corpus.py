import javalang
from hypothesis import given, strategies as st, settings, HealthCheck
from hypothesis.strategies import composite
import json
import argparse

# Define your strategies mapping for Java types
strategies = {
    'boolean': st.booleans(),
    'long': st.integers(min_value=-2**63, max_value=2**63-1),
    'String[]': st.lists(st.text()),
    'char[]': st.lists(st.characters()),
    'char': st.characters(),
    'HashMap<String, Integer>': st.dictionaries(st.text(), st.integers()),
    'List<String>': st.lists(st.text()),
    'Integer[][]': st.lists(st.lists(st.integers())),
    'int[][]': st.lists(st.lists(st.integers(min_value=-2**31, max_value=2**31-1))),
    'int[]': st.lists(st.integers(min_value=-2**31, max_value=2**31-1)),
    'int': st.integers(min_value=-2**31, max_value=2**31-1),
    'float': st.floats(),
    'double': st.floats(),
    'String': st.text(),
    'List': st.lists(st.integers())
}
@composite
def dynamic_composite(draw, param_type):
    if param_type in strategies:
        strategy = strategies[param_type]
        return draw(strategy)
    else:
        raise ValueError(f"Unknown param_type: {param_type}")

def parse_arguments():
    parser = argparse.ArgumentParser(description='Generates an input corpus for Java methods.')
    parser.add_argument('--filepath', type=str, required=True, help='The path to the Java file')
    parser.add_argument('--num_of_inputs', type=int, default=512, help='Number of inputs to generate for each method')
    return parser.parse_args()

def parse_java_file(filepath):
    with open(filepath, 'r') as file:
        content = file.read()
    tree = javalang.parse.parse(content)
    methods = {}

    for _, node in tree.filter(javalang.tree.MethodDeclaration):
        param_types = []
        # do not consider main method
        if node.name == 'main':
            continue
        for param in node.parameters:
            # Determine parameter type and handle arrays and generics
            if isinstance(param.type, javalang.tree.ReferenceType):
                base_type = param.type.name
                # Handle generic types
                if param.type.arguments:
                    generic_types = []
                    for arg in param.type.arguments:
                        if isinstance(arg.type, javalang.tree.ReferenceType):
                            # This handles nested generic types as well
                            generic_type = arg.type.name
                            if arg.type.dimensions:
                                generic_type += '[]' * len(arg.type.dimensions)
                            generic_types.append(generic_type)
                        elif isinstance(arg.type, javalang.tree.BasicType):
                            generic_types.append(arg.type.name)
                        # Add more type handling if necessary
                    generic_str = ", ".join(generic_types)
                    param_type = f"{base_type}<{generic_str}>"
                # For arrays, append "[]" for each dimension
                elif param.type.dimensions:
                    array_suffix = '[]' * len(param.type.dimensions)
                    param_type = base_type + array_suffix
                else:
                    param_type = base_type
            elif isinstance(param.type, javalang.tree.BasicType):
                # Basic types handling
                param_type = param.type.name
                if param.type.dimensions:
                    array_suffix = '[]' * len(param.type.dimensions)
                    param_type += array_suffix
            else:
                param_type = "Unknown"  # Placeholder for unrecognized types

            param_types.append(param_type)
        methods[node.name] = param_types

    return methods

def strategy_for_type(param_type):
    # This function now correctly references dynamic_composite without passing the strategy directly.
    # Instead, it passes the type identifier, which dynamic_composite uses to find and draw from the correct strategy.
    return dynamic_composite(param_type)


def make_immutable(input_item):
    """
    Recursively converts mutable types (lists and dicts) to immutable types (tuples) to make input items hashable.
    """
    if isinstance(input_item, list):
        return tuple(make_immutable(sub_item) for sub_item in input_item)
    elif isinstance(input_item, dict):
        # Convert the dictionary to a tuple of tuples (key-value pairs), also ensuring keys and values are immutable
        return tuple((make_immutable(key), make_immutable(value)) for key, value in sorted(input_item.items()))
    return input_item

def convert_to_list(item):
    """
    Recursively converts tuples to lists, including nested structures.
    """
    if isinstance(item, tuple):
        return [convert_to_list(sub_item) for sub_item in item]
    return item

def generate_input_corpus(methods, num_of_inputs):
    input_corpus = {}
    for method_name, param_types in methods.items():
        method_strategy = [strategy_for_type(param_type) for param_type in param_types]

        # Combine strategies for all parameters of the method
        combined_strategy = st.tuples(*method_strategy)

        collected_inputs = set()

        # Keep trying to generate inputs until we have the desired number
        while len(collected_inputs) < num_of_inputs:
            print(f'On {len(collected_inputs)} out of {num_of_inputs}')
            @given(combined_strategy)
            @settings(max_examples=num_of_inputs - len(collected_inputs), suppress_health_check=[HealthCheck.too_slow])
            def test_func(inputs):
                # Convert all input items (including nested structures) to immutable types
                immutable_inputs = tuple(make_immutable(input_item) for input_item in inputs)
                collected_inputs.add(immutable_inputs)

            # Trigger the test function to collect inputs
            test_func()

        # Convert collected inputs back to their original form (lists for JSON serialization or other uses)
        input_corpus[method_name] = [convert_to_list(input_item) for input_item in collected_inputs]

    return input_corpus


def main():
    args = parse_arguments()
    methods = parse_java_file(args.filepath)
    print(methods)
    input_corpus = generate_input_corpus(methods, args.num_of_inputs)
    output_path = '/'.join(args.filepath.split('/')[:-1]) + '/input_corpus.json'
    
    with open(output_path, 'w') as file:
        json.dump(input_corpus, file, indent=4)
    
    print(f"Input corpus generated at {output_path}")

if __name__ == "__main__":
    main()
