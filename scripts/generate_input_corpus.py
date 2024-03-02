import javalang
from hypothesis import strategies as st
from hypothesis.strategies import builds
import json
import argparse

# ----------------------------------------------------Global Variables----------------------------------------------------
#Crete the input strategies for the different types for Java

strategies = {
    'int': st.integers(),
    'float': st.floats(),
    'double': st.floats(),
    'String': st.text(),
    'List': st.lists(st.integers())
}

def parse_arguments() -> dict:
    """
    Parse the command line arguments

    This function parses the command line arguments and returns a dictionary
    of the parsed arguments.

    Returns:
        dict: The parsed arguments
    
    """
    # Create the parser
    parser = argparse.ArgumentParser(description='Generates an input corpus for the code snippets.')

    parser.add_argument(
        '--filepath', type=str, help='Filepath to the code snippets', required=True
    )
    parser.add_argument(
        '--num_of_inputs', type=int, help='Number of inputs to generate', required=False, default=10
    )

    # Parse the arguments
    args = parser.parse_args()

    return args

def parse_java_file(filepath: str) -> dict:
    """
    Parses a Java file and returns the code snippets

    This function reads a Java file and returns the code snippets.

    Args:
        filepath (str): The filepath to the Java file.

    Returns:
        dict: Key -> method name, Value -> param_types 
    """
    
    with open(filepath, 'r') as file:
        data = file.read()
        tree = javalang.parse.parse(data)
        methods = {}
        for path, node in tree.filter(javalang.tree.MethodDeclaration):
            methods[node.name] = [param.type.name for param in node.parameters]
        return methods

def generate_input_corpus(param_types: list, num_of_inputs: int) -> list:
    """
    Generates the input corpus for the code snippets.

    Args:
        param_types (list): The parameter types of a method
        num_of_inputs (int): The number of inputs to generate

    Returns:
        list: List of input params
    """
    # Define the input strategy based on param_types
    input_strategies = [strategies.get(param_type, st.nothing()) for param_type in param_types]

    combined_strategy = st.tuples(*input_strategies)

    inputs = set()
    while len(inputs) < num_of_inputs:
        # Directly generate an example from the combined strategy
        example = combined_strategy.example()
        inputs.add(example)
    
    return list(inputs)

def main():
    # -- Parse the command line arguments -- #
    args = parse_arguments()
    filepath = args.filepath
    
    # -- Parse the Java file for methods and arg types -- #
    methods = parse_java_file(filepath)

    # -- Generate the input corpus -- #
    input_corpus = {}
    for method, param_types in methods.items():
        inputs = generate_input_corpus(param_types, args.num_of_inputs)
        input_corpus[method] = inputs
        
    # -- Write the input corpus to a file -- #
    # Get the file path without the java file name for output
    file_path = '/'.join(filepath.split('/')[:-1])
    with open(f'{file_path}/input_corpus.json', 'w') as file:
        json.dump(input_corpus, file, indent=4)

if __name__ == "__main__":
    main()