import argparse
import os
import subprocess
import json
import logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')

def parse_arguments():
    parser = argparse.ArgumentParser(description='Generates an output corpus for methods.')
    parser.add_argument('--directory', type=str, required=True, help='The path to prompt folder')
    args = parser.parse_args()
    return args

def get_file_list(path: str) -> list[str]:
    file_list = []
    
    # --- Get the files in only this directory --- #
    for file in os.listdir(path):
        if file.endswith('.py') or file.endswith('.java') or file.endswith('cpp'):
            file_list.append(f'{path}/{file}')
    
    return file_list

def get_output(file: str, input_corpus: dict, file_name: str) -> dict:
    behavior = {}
    file_path = '/'.join(file.split('/')[:-1])
    executable_name = file.split('/')[-1].split('.')[0]
    prompt = file_path.split('/')[-1]
    
    # --- Compile the file --- #
    if file.endswith('.java'):
        subprocess.run(['javac', file])
    elif file.endswith('.cpp'):
        compile_process = subprocess.run(['g++', '-std=c++20', '-o', executable_name, file], capture_output=True, text=True)
    
        if compile_process.returncode != 0:
            logging.error(f'{file}: {compile_process.stderr}')
            return None
    
    logging.info(f'Compiled {file_name}')
    
    # --- Run the file to get output --- #
    if prompt in file_path:
        counter = 0
        for key, value in input_corpus.items():
            for input_list in value:
                counter += 1
                input_str = " ".join(map(str, input_list))
                logging.info(f"Counter: {counter} with {input_str}")
                try:
                    if file.endswith('.py'):
                        output = subprocess.run(['python3', file], input=input_str, capture_output=True, text=True, timeout=300)
                    elif file.endswith('.java'):
                        output = subprocess.run(["java", "-cp", file_path, executable_name], input=input_str, capture_output=True, text=True, timeout=300)                    
                    elif file.endswith('.cpp'):
                        output = subprocess.run([f'./{executable_name}'], input=input_str, capture_output=True, text=True, timeout=300)
    # --- Store the output in the behavior dictionary --- #
                    if output.returncode != 0:
                        behavior.update({input_str: output.stderr})
                    else:
                        behavior.update({input_str: output.stdout})
                    if counter == 10:
                        logging.info(f'Finished 10 inputs for {file_name}')
                        return behavior
                except subprocess.TimeoutExpired:
                    logging.error(f'Timeout')
                    return behavior
    logging.info(f'Calculated behavior for {file_name}')
    return behavior

def get_sample_input(file: str, input_corpus: dict, filename: str) -> None:
    file_path = '/'.join(file.split('/')[:-1])
    executable_name = file.split('/')[-1].split('.')[0]
    prompt = file_path.split('/')[-1]

    if prompt in file_path:
        counter = 0
        for key, value in input_corpus.items():
            for input_list in value:
                counter += 1
                input_str = " ".join(map(str, input_list))
                logging.info(f"Counter: {counter} with {input_str}")

                if counter >= 10:
                    logging.info(f'Finished 10 inputs for {filename}')
                    return

        return
def main():
    # --- Get arguments --- # 
    args = parse_arguments()
    directory = args.directory

    # --- Get file list --- #
    file_list = get_file_list(directory)

    # --- Get the input corpus --- #
    path = os.path.dirname(file_list[0])
    with open(f'{path}/input_corpus.json', 'r') as input_json:
        input_corpus = json.load(input_json)
    
    # --- Get the output corpus --- #
    for file in file_list:
        path_components = file.split('/')
        prompt = path_components[-2]
        file_name = f'{prompt}/{path_components[-1]}'
        file_extension = file.split('.')[-1]

        logging.info(f'Getting output for {file_name} with the extension {file_extension}')

    # --- Write the output corpus to a file --- #
        #get_sample_input(file, input_corpus, file_name)
        behavior = get_output(file, input_corpus, file_name)
        with open(f'{path}/output_corpus_{file_extension}.json', 'w') as output_json:
            json.dump(behavior, output_json, indent=4)

    # --- Clean up lingering cpp executables --- #
        if file.endswith('.cpp'):
            executable_name = file.split('/')[-1].split('.')[0]
            os.remove(executable_name)

            


if __name__ == "__main__":
    main()
