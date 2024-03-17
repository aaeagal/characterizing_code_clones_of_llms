import argparse
import logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')
import os
import javalang

def parse_arguments() -> dict:
    # Create the parser
    parser = argparse.ArgumentParser(description='Queries the LLMs for a given prompt and returns code snippets.')

    parser.add_argument(
        '--leetcode_description', type=str, help='Prompt to send to the model', required=True
    )
    parser.add_argument(
        '--temperature', help='Temperature for the response generation', required=True
    )
    parser.add_argument(
        '--task', type=str, help='Task to perform (python2java, java2python, python, etc)', required=True  
    )
    parser.add_argument(
        '--sampling', type=str, help='Sampling method (twenty queries vs one query)', required=True
    )
    parser.add_argument(
        '--model', type=str, help='Model to use for the response generation', required=True
    )
    # Parse the arguments
    args = parser.parse_args()

    return args

def preprocess_combined_java_files(filepath: str) -> None:
    combined_file_path = os.path.join(filepath, "llm_generated/generated.java")
    with open(combined_file_path, "r") as file:
        combined_content = file.read()

    # Parse the combined Java content to get the abstract syntax tree (AST)
    tree = javalang.parse.parse(combined_content)

def main():
    # -- Get the command line arguments -- #
    args = parse_arguments()
    task = args.task
    model = args.model
    leetcode = args.leetcode_description
    temperature = args.temperature
    sampling = args.sampling

    # -- Fix temperature bug -- #
    if temperature == "0" or temperature == "1" or temperature == "2":
        temperature = int(temperature)
    else:
        temperature = float(temperature)

    # -- Create the filepath -- #
    filepath = f"../../data/{leetcode}/{temperature}/{model}/{task}/{sampling}"
    
    # -- Preprocess Java Files -- #
    if sampling == "once":
        preprocess_combined_java_files(filepath)
    elif sampling == "repeated":
        preprocess_separate_java_files(filepath)
    
    

    

if __name__ == '__main__':
    main()