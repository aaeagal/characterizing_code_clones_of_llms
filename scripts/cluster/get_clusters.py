import re
import argparse
import logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')
import os
import json
import shutil

def parse_arguments() -> dict:

    parser = argparse.ArgumentParser(description='Gets ''simion'' clusters of solutions based on their similarity to the original snippet.')

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

    args = parser.parse_args()

    return args

def get_clusters(cpp_behavior: dict, java_behavior: dict, python_behavior: dict, directory: str, total_similarity: dict) -> dict:
    # --- Create a 'results' directory if it doesn't exist --- #
    results_directory = f'{directory}/results'
    if not os.path.exists(results_directory):
        os.makedirs(results_directory)
        logging.info(f'Created directory: {results_directory}')
    else:
    # --- If there's a result directory, remove it and create a new one --- #
        shutil.rmtree(results_directory)
        os.makedirs(results_directory)
        logging.info(f'Directory already exists. Removed and created new directory: {results_directory}')

    
    # --- Get the similarity clusters --- #
    total_similarity = get_similarity_clusters(cpp_behavior, java_behavior, python_behavior, directory, results_directory, total_similarity, 'exact')

    return total_similarity

    
def get_similarity_clusters(cpp_behavior: dict, java_behavior: dict, python_behavior: dict, directory: str, results_directory: str, total_similarity: dict, strictness: str) -> dict:
    # --- Note all the inputs are the same --- #
    inputs = list(cpp_behavior.keys())
    num_of_inputs = len(inputs)

    sol_dir_path = os.path.join(directory, 'preprocessed')

    for solutions in os.listdir(sol_dir_path):   
        similarity_scores = {
            'cpp': 0,
            'java': 0,
            'python': 0
        }
        logging.info(f'Processing solution: {solutions}')
        solution_dir = os.path.join(sol_dir_path, solutions)
        files = os.listdir(solution_dir)
        java_files = [file for file in files if file.endswith('.java')]
        
        # Remove the Main.java file if it exists
        pattern = re.compile(r"Solution\d*.java")
        if "Main.java" in files:
            for file in files:
                if pattern.match(file):
                    files.remove("Main.java")
                    java_files.remove("Main.java")
                    break
            
        
        
        # --- Get the behavior of the solution --- #
        try:
            with open(f'{solution_dir}/behavior.json', 'r') as file:
                behavior = json.load(file)
                # if behavior is NoneType, then skip the solution
                if behavior is None or behavior == {}:
                    logging.info(f'No behavior found for solution: {solutions}')
                    continue
        except:
            logging.info(f'No behavior found for solution: {solutions}')
            continue
            

        for input in inputs:
            cpp_output = cpp_behavior[input]
            java_output = java_behavior[input]
            python_output = python_behavior[input]

            # Normalize the outputs to make comparison easier (Java only)
            if "Exception" in java_output:
                java_output = "Exception"
            if "Exception" in behavior[input]:
                behavior[input] = "Exception"

            if "Could not find or load main class" in java_output:
                java_output = "Could not find or load main class"
            if "Could not find or load main class" in behavior[input]:
                behavior[input] = "Could not find or load main class"
            
            if "Traceback" in python_output:
                python_output = "Exception"
            if "Traceback" in behavior[input]:
                behavior[input] = "Exception"

            

            # Increment similarity score if outputs are the same
            if cpp_output == behavior[input]:
                similarity_scores['cpp'] += 1
            if java_output == behavior[input]:
                similarity_scores['java'] += 1
            if python_output == behavior[input]:
                similarity_scores['python'] += 1

                
        # Compute final similarity scores as a fraction of the number of inputs
        for key in similarity_scores.keys():
            similarity_scores[key] /= num_of_inputs

        
        # --- Write the similarity scores to a file --- #
        #with open(f'{results_directory}/{solutions}_similarity_scores.json', 'w') as file:           
        #    json.dump(similarity_scores, file)
        if 'compiling_error' in behavior.keys():
            similarity_scores['compiling_error'] = behavior['compiling_error']

        if "other_language" in behavior.keys():
            similarity_scores['other_language'] = behavior['other_language']
        total_similarity.update({solutions: similarity_scores})
    
    return total_similarity
        

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
    directory = f"../../data/{leetcode}/{temperature}/{model}/{task}/{sampling}"

    # --- Get the behavior dictionaries in the directory --- #
    with open(f'../../data/{leetcode}/output_corpus_cpp.json', 'r') as cpp_file:
        cpp_behavior = json.load(cpp_file)

    with open(f'../../data/{leetcode}/output_corpus_java.json', 'r') as java_file:
        java_behavior = json.load(java_file)

    with open(f'../../data/{leetcode}/output_corpus_py.json', 'r') as python_file:
        python_behavior = json.load(python_file)
    
    total_similarity = {}
    
    # --- Get Clusters --- #    
    total_similarity = get_clusters(cpp_behavior, java_behavior, python_behavior, directory=directory, total_similarity=total_similarity)

    # --- Write the total similarity to a file --- #
    with open(f'{directory}/results/total_similarity.json', 'w') as file:
        json.dump(total_similarity, file, indent=4)



if __name__ == "__main__":
    main()