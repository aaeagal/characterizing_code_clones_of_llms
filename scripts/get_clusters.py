import argparse
import json
import logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')
import os


def parse_arguments():
    parser = argparse.ArgumentParser(description='Generates an output corpus for methods.')
    parser.add_argument('--directory', type=str, required=True, help='The path to prompt folder')
    args = parser.parse_args()
    return args

def get_clusters(cpp_behavior: dict, java_behavior: dict, python_behavior: dict, directory: str):
    # --- Create a 'results' directory if it doesn't exist --- #
    results_directory = f'{directory}/results'
    if not os.path.exists(results_directory):
        os.makedirs(results_directory)
    
    # --- Get the similarity clusters --- #
    similarity_clusters = get_similarity_clusters(cpp_behavior, java_behavior, python_behavior, 'exact')

    # --- Write the similarity clusters to a file --- #
    with open(f'{results_directory}/similarity_clusters.json', 'w') as file:
        json.dump(similarity_clusters, file, indent=4)
    
def get_similarity_clusters(cpp_behavior: dict, java_behavior: dict, python_behavior: dict, similarity_measure: str) -> dict:
    inputs = list(cpp_behavior.keys())
    num_of_inputs = len(inputs)
    similarity_scores = {
        'cpp_java': 0,
        'cpp_python': 0,
        'java_python': 0
    }

    for input in inputs:
        cpp_output = cpp_behavior[input]
        java_output = java_behavior[input]
        python_output = python_behavior[input]

        # Increment similarity score if outputs are the same
        if cpp_output == java_output:
            similarity_scores['cpp_java'] += 1
        if cpp_output == python_output:
            similarity_scores['cpp_python'] += 1
        if java_output == python_output:
            similarity_scores['java_python'] += 1

    # Compute final similarity scores as a fraction of the number of inputs
    for key in similarity_scores.keys():
        similarity_scores[key] /= num_of_inputs

    return similarity_scores


def main():
    # --- Parse the arguments --- #
    args = parse_arguments()
    directory = args.directory

    # --- Get the behavior dictionaries in the directory --- #
    with open(f'{directory}/output_corpus_cpp.json', 'r') as cpp_file:
        cpp_behavior = json.load(cpp_file)

    with open(f'{directory}/output_corpus_java.json', 'r') as java_file:
        java_behavior = json.load(java_file)

    with open(f'{directory}/output_corpus_py.json', 'r') as python_file:
        python_behavior = json.load(python_file)
    
    # --- Get Clusters --- #    
    get_clusters(cpp_behavior, java_behavior, python_behavior, directory)



if __name__ == "__main__":
    main()