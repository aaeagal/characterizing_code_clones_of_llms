import argparse
import logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')
import requests
import json
import os
from transformers import pipeline
import transformers
import torch

# ----------------------------------------------------Global Variables---------------------------------------------------- #
codellama_API_URL = "https://s7z6ejlhf7s7wgiv.us-east-1.aws.endpoints.huggingface.cloud"
codellama_headers = {
	"Accept" : "application/json",
	"Authorization": "Bearer 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",
	"Content-Type": "application/json" 
}
starcoder_API_URL = "https://smzbn5ysaf5sdpie.us-east-1.aws.endpoints.huggingface.cloud"
starcoder_headers = {
	"Accept" : "application/json",
	"Authorization": "Bearer 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",
	"Content-Type": "application/json" 
}
# 
# ----------------------------------------------------Functions---------------------------------------------------- #


def parse_arguments() -> dict:
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

    args = parser.parse_args()

    return args

def get_file_suffix(task: str) -> str:
    if task == "cppToJava":
        return "java"
    elif task == "cppToPython":
        return "py"
    elif task == "javaToCpp":
        return "cpp"
    elif task == "javaToPython":
        return "py"
    elif task == "pythonToCpp":
        return "cpp"
    elif task == "pythonToJava":
        return "java"
    elif task == "python":
        return "py"
    elif task == "java":
        return "java"
    elif task == "cpp":
        return "cpp"
    elif task == "java_regular":
        return "java"
    elif task == "cpp_regular":
        return "cpp"
    elif task == "python_regular":
        return "py"  
    else:
        raise ValueError(f"Unknown file suffix in get_file_suffix: {task}")

def query_codellama(prompt: str, temperature: float) -> str:
    codedata = {
        "inputs": prompt,
        "parameters": {
            "Temperature": temperature,
            "max_length": 4000,
            "max_new_tokens": 7000,         
        }
    }
    
    try:
        response = requests.post(codellama_API_URL, headers=codellama_headers, json=codedata)
        response.raise_for_status()
        print(response.json())
        return response.json()[0]['generated_text']
    except requests.exceptions.HTTPError as e:
        with open("response.json", "w") as file:
            file.write(json.dumps(response.json(), indent=4))
        logging.error(f"Error in query_codellama: {e}")
        return "Error in query_codellama"

def query_starcoder(prompt: str, temperature: float) -> str:
    stardata = {
        "inputs": prompt,
        "parameters": {
            "temperature": temperature,
            "max_length": 4000,
            "max_new_tokens": 7000,         
        }
    }
    
    try:
        response = requests.post(starcoder_API_URL, headers=starcoder_headers, json=stardata)
        response.raise_for_status()
        print(response.json())
        return response.json()[0]['generated_text']
    except requests.exceptions.HTTPError as e:
        with open("response.json", "w") as file:
            file.write(json.dumps(response.json(), indent=4))
        logging.error(f"Error in query_codellama: {e}")
        return "Error in query_codellama"

def query_codellama_pipeline(prompt, temperature):
    pipe = pipeline("text-generation", model="codellama/CodeLlama-70b-Instruct-hf")

    response = pipe(prompt, max_length=4000, temperature=temperature, max_new_tokens=7000)

    return response
    
def main():
    
    args = parse_arguments()
    task = args.task
    model = args.model
    leetcode = args.leetcode_description
    temperature = args.temperature
    sampling = args.sampling

    logging.info(f"Starting to generate the requested hugging face snippets the leetcode problem: {leetcode} using the model: {model} with temperature: {temperature} and task: {task} and sampling: {sampling}")
    # -- Fix temperature bug -- #
    if temperature == "0" or temperature == "1" or temperature == "2":
        temperature = int(temperature)
    else:
        temperature = float(temperature)

    # -- Get file suffix -- #
    file_suffix = get_file_suffix(task)

    # -- Query the model -- #
    total_samples_per_prompt = 0

    while total_samples_per_prompt < 20:
        total_samples_per_prompt += 1

        if task == "cppToJava":
            with open(f'../../../data/{leetcode}/Solution.cpp', 'r') as solution_file:
                code = solution_file.read()
            
            # --- Query the model for combined clones --- #
            if sampling == "once":
                prompt = f"Generate 20 separate Java semantic code clones of the code below: \n{code}"
                if model == "codellama":
                    response = query_codellama(prompt, temperature)
                elif model == "starcoder":
                    response = query_starcoder(prompt, temperature)
                else:
                    raise ValueError(f"Unknown model in main: {model}")
                
                with open(f'../../../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated 20 Java semantic code clones using {leetcode} Solution.cpp")
                    break

            # --- Query the model for seperate clones --- #
            elif sampling == "repeated":
                prompt = f"Generate a Java semantic code clone of the code below: \n{code}"
                
                if model == "codellama":
                    response = query_codellama_pipeline( prompt, temperature)
                elif model == "starcoder":
                    response = query_starcoder(prompt, temperature)
                else:
                    raise ValueError(f"Unknown model in main: {model}")
                
                with open(f'../../../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated_{total_samples_per_prompt}.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated Java semantic code clone {total_samples_per_prompt} using {leetcode} Solution.cpp")
                    continue

        elif task == "cppToPython":
            # --- Read Solution.cpp file --- #
            with open(f'../../../data/{leetcode}/Solution.cpp', 'r') as solution_file:
                code = solution_file.read()
            
            # --- Query the model for combined clones --- #
            if sampling == "once":
                prompt = f"Generate 20 separate Python semantic code clones of the code below: \n{code}"
                if model == "codellama":
                    response = query_codellama(prompt, temperature)
                elif model == "starcoder":
                    response = query_starcoder(prompt, temperature)
                else:
                    raise ValueError(f"Unknown model in main: {model}")
                
                with open(f'../../../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated 20 Python semantic code clones using {leetcode} Solution.cpp")
                    break

            # --- Query the model for seperate clones --- #
            elif sampling == "repeated":
                prompt = f"Generate a Python semantic code clone of the code below: \n{code}"
                if model == "codellama":
                    response = query_codellama(prompt, temperature)
                elif model == "starcoder":
                    response = query_starcoder(prompt, temperature)
                else:
                    raise ValueError(f"Unknown model in main: {model}")
                
                with open(f'../../../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated_{total_samples_per_prompt}.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated Python semantic code clone {total_samples_per_prompt} using {leetcode} Solution.cpp")
                    continue
        elif task == "javaToCpp":
            # --- Read Solution.java file --- #
            with open(f'../../../data/{leetcode}/Solution.java', 'r') as solution_file:
                code = solution_file.read()
            
            # --- Query the model for combined clones --- #
            if sampling == "once":
                prompt = f"Generate 20 separate C++ semantic code clones of the code below: \n{code}"
                if model == "codellama":
                    response = query_codellama(prompt, temperature)
                elif model == "starcoder":
                    response = query_starcoder(prompt, temperature)
                else:
                    raise ValueError(f"Unknown model in main: {model}")
                
                with open(f'../../../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated 20 C++ semantic code clones using {leetcode} Solution.java")
                    break

            # --- Query the model for seperate clones --- #
            elif sampling == "repeated":
                prompt = f"Generate a C++ semantic code clone of the code below: \n{code}"
                if model == "codellama":
                    response = query_codellama(prompt, temperature)
                elif model == "starcoder":
                    response = query_starcoder(prompt, temperature)
                else:
                    raise ValueError(f"Unknown model in main: {model}")
                
                with open(f'../../../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated_{total_samples_per_prompt}.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated C++ semantic code clone {total_samples_per_prompt} using {leetcode} Solution.java")
                    continue
        elif task == "javaToPython":
            # --- Read Solution.java file --- #
            with open(f'../../../data/{leetcode}/Solution.java', 'r') as solution_file:
                code = solution_file.read()
            
            # --- Query the model for combined clones --- #
            if sampling == "once":
                prompt = f"Generate 20 Python semantic code clones of the provided code below: \n{code}"
                if model == "codellama":
                    response = query_codellama(prompt, temperature)
                elif model == "starcoder":
                    response = query_starcoder(prompt, temperature)
                else:
                    raise ValueError(f"Unknown model in main: {model}")
                
                with open(f'../../../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated 20 Python semantic code clones using {leetcode} Solution.java")
                    break

            # --- Query the model for seperate clones --- #
            elif sampling == "repeated":
                prompt = f"Generate a Python semantic code clone of the code below: \n{code}"
                if model == "codellama":
                    response = query_codellama(prompt, temperature)
                elif model == "starcoder":
                    response = query_starcoder(prompt, temperature)
                else:
                    raise ValueError(f"Unknown model in main: {model}")
                
                with open(f'../../../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated_{total_samples_per_prompt}.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated Python semantic code clone {total_samples_per_prompt} using {leetcode} Solution.java")
                    continue
        elif task == "pythonToCpp":
            # --- Read Solution.py file --- #
            with open(f'../../../data/{leetcode}/Solution.py', 'r') as solution_file:
                code = solution_file.read()
            
            # --- Query the model for combined clones --- #
            if sampling == "once":
                prompt = f"Generate 20 separate C++ semantic code clones of the code below: \n{code}"
                if model == "codellama":
                    response = query_codellama(prompt, temperature)
                elif model == "starcoder":
                    response = query_starcoder(prompt, temperature)
                else:
                    raise ValueError(f"Unknown model in main: {model}")
                
                with open(f'../../../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated 20 C++ semantic code clones using {leetcode} Solution.py")
                    break

            # --- Query the model for seperate clones --- #
            elif sampling == "repeated":
                prompt = f"Generate a C++ semantic code clone of the code below: \n{code}"
                if model == "codellama":
                    response = query_codellama(prompt, temperature)
                elif model == "starcoder":
                    response = query_starcoder(prompt, temperature)
                else:
                    raise ValueError(f"Unknown model in main: {model}")
                
                with open(f'../../../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated_{total_samples_per_prompt}.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated C++ semantic code clone {total_samples_per_prompt} using {leetcode} Solution.py")
                    continue
        elif task == "pythonToJava":
            # --- Read Solution.py file --- #
            with open(f'../../../data/{leetcode}/Solution.py', 'r') as solution_file:
                code = solution_file.read()
            
            # --- Query the model for combined clones --- #
            if sampling == "once":
                prompt = f"Generate 20 separate Java semantic code clones of the code below: \n{code}"
                if model == "codellama":
                    response = query_codellama(prompt, temperature)
                elif model == "starcoder":
                    response = query_starcoder(prompt, temperature)
                else:
                    raise ValueError(f"Unknown model in main: {model}")
                
                with open(f'../../../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated 20 Java semantic clones using {leetcode} Solution.py")
                    break

            # --- Query the model for seperate clones --- #
            elif sampling == "repeated":
                prompt = f"Generate a Java semantic code clone of the code below: \n{code}"
                if model == "codellama":
                    response = query_codellama(prompt, temperature)
                elif model == "starcoder":
                    response = query_starcoder(prompt, temperature)
                else:
                    raise ValueError(f"Unknown model in main: {model}")
                
                with open(f'../../../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated_{total_samples_per_prompt}.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f'Generated Java semantic code clone {total_samples_per_prompt} using {leetcode} Solution.py')
                    continue
        elif task == "python":
            # --- Read Solution.py file --- #
            with open(f'../../../data/{leetcode}/Solution.py', 'r') as solution_file:
                code = solution_file.read()
            
            # --- Query the model for combined clones --- #
            if sampling == "once":
                prompt = f"Generate 20 separate syntactically different semantic Python code clones of the code below: \n{code}"
                if model == "codellama":
                    response = query_codellama(prompt, temperature)
                elif model == "starcoder":
                    response = query_starcoder(prompt, temperature)
                else:
                    raise ValueError(f"Unknown model in main: {model}")
                
                with open(f'../../../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated 20 Python syntactically different semantic code clones using {leetcode} Solution.py")
                    break

            # --- Query the model for seperate clones --- #
            elif sampling == "repeated":
                prompt = f"Generate a syntactically different semantic Python code clone of the code below: \n{code}"
                if model == "codellama":
                    response = query_codellama(prompt, temperature)
                elif model == "starcoder":
                    response = query_starcoder(prompt, temperature)
                else:
                    raise ValueError(f"Unknown model in main: {model}")
                
                with open(f'../../../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated_{total_samples_per_prompt}.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated Python syntactically different semantic code clone {total_samples_per_prompt} using {leetcode} Solution.py")
                    continue
        
        elif task == "java":
            # --- Read Solution.java file --- #
            with open(f'../../../data/{leetcode}/Solution.java', 'r') as solution_file:
                code = solution_file.read()
            
            # --- Query the model for combined clones --- #
            if sampling == "once":
                prompt = f"Generate 20 separate syntactically different semantic Java code clones of the code below: \n{code}"

                if model == "codellama":
                    response = query_codellama(prompt, temperature)
                elif model == "starcoder":
                    response = query_starcoder(prompt, temperature)
                else:
                    raise ValueError(f"Unknown model in main: {model}")
                
                
                with open(f'../../../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated 20 Java syntactically different semantic code clones using {leetcode} Solution.java")
                    break

            # --- Query the model for seperate clones --- #
            elif sampling == "repeated":
                prompt = f"Generate a syntactically different semantic Java code clone of the code below: \n{code}"

                if model == "codellama":
                    response = query_codellama(prompt, temperature)
                elif model == "starcoder":
                    response = query_starcoder(prompt, temperature)
                else:
                    raise ValueError(f"Unknown model in main: {model}")
                           
                with open(f'../../../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated_{total_samples_per_prompt}.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated Java syntactically different semantic code clone {total_samples_per_prompt} using {leetcode} Solution.java")
                    continue
        elif task == "cpp":
            # --- Read Solution.cpp file --- #
            with open(f'../../../data/{leetcode}/Solution.cpp', 'r') as solution_file:
                code = solution_file.read()
            
            # --- Query the model for combined clones --- #
            if sampling == "once":
                prompt = f"Generate 20 separate syntactically different semantic C++ code clones of the code below: \n{code}"
                if model == "codellama":
                    response = query_codellama(prompt, temperature)
                elif model == "starcoder":
                    response = query_starcoder(prompt, temperature)
                else:
                    raise ValueError(f"Unknown model in main: {model}")
                
                
                with open(f'../../../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated 20 C++ syntactically different semantic code clones using {leetcode} Solution.cpp")
                    break

            # --- Query the model for seperate clones --- #
            elif sampling == "repeated":
                prompt = f"Generate a syntactically different semantic C++ code clone of the code below: \n{code}"
                if model == "codellama":
                    response = query_codellama(prompt, temperature)
                elif model == "starcoder":
                    response = query_starcoder(prompt, temperature)
                else:
                    raise ValueError(f"Unknown model in main: {model}")
                
                with open(f'../../../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated_{total_samples_per_prompt}.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated C++ syntactically different semantic code clone {total_samples_per_prompt} using {leetcode} Solution.cpp")
                    continue
        elif task == "java_regular":
            # --- Read Solution.java file --- #
            with open(f'../../../data/{leetcode}/Solution.java', 'r') as solution_file:
                code = solution_file.read()
            
            # --- Query the model for combined clones --- #
            if sampling == "once":
                prompt = f"Generate 20 separate Java semantic code clones of the code below: \n{code}"
                if model == "codellama":
                    response = query_codellama(prompt, temperature)
                elif model == "starcoder":
                    response = query_starcoder(prompt, temperature)
                else:
                    raise ValueError(f"Unknown model in main: {model}")  
                
                with open(f'../../../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated 20 Java code clones using {leetcode} Solution.java")
                    break

            # --- Query the model for seperate clones --- #
            elif sampling == "repeated":
                prompt = f"Generate a Java code clone of the code below: \n{code}"
                if model == "codellama":
                    response = query_codellama(prompt, temperature)
                elif model == "starcoder":
                    response = query_starcoder(prompt, temperature)
                else:
                    raise ValueError(f"Unknown model in main: {model}")
                               
                with open(f'../../../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated_{total_samples_per_prompt}.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated Java syntactically different clone {total_samples_per_prompt} using {leetcode} Solution.java")
                    continue
        elif task == "cpp_regular":
            # --- Read Solution.cpp file --- #
            with open(f'../../../data/{leetcode}/Solution.cpp', 'r') as solution_file:
                code = solution_file.read()
            
            # --- Query the model for combined clones --- #
            if sampling == "once":
                prompt = f"Generate 20 separate C++ semantic code clones of the code below: \n{code}"
                if model == "codellama":
                    response = query_codellama(prompt, temperature)
                elif model == "starcoder":
                    response = query_starcoder(prompt, temperature)
                else:
                    raise ValueError(f"Unknown model in main: {model}")
                
                
                with open(f'../../../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated 20 C++ code clones using {leetcode} Solution.cpp")
                    break

            # --- Query the model for seperate clones --- #
            elif sampling == "repeated":
                prompt = f"Generate a C++ code clone of the code below: \n{code}"
                if model == "codellama":
                    response = query_codellama(prompt, temperature)
                elif model == "starcoder":
                    response = query_starcoder(prompt, temperature)
                else:
                    raise ValueError(f"Unknown model in main: {model}")
                
                
                with open(f'../../../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated_{total_samples_per_prompt}.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated C++ clone {total_samples_per_prompt} using {leetcode} Solution.cpp")
                    continue
        elif task == "python_regular":
            # --- Read Solution.py file --- #
            with open(f'../../../data/{leetcode}/Solution.py', 'r') as solution_file:
                code = solution_file.read()
            
            # --- Query the model for combined clones --- #
            if sampling == "once":
                prompt = f"Generate 20 separate Python semantic code clones of the code below: \n{code}"
                if model == "codellama":
                    response = query_codellama(prompt, temperature)
                elif model == "starcoder":
                    response = query_starcoder(prompt, temperature)
                else:
                    raise ValueError(f"Unknown model in main: {model}")
                
                
                with open(f'../../../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated 20 Python code clones using {leetcode} Solution.py")
                    break

            # --- Query the model for seperate clones --- #
            elif sampling == "repeated":
                prompt = f"Generate a Python code clone of the code below: \n{code}"
                if model == "codellama":
                    response = query_codellama(prompt, temperature)
                elif model == "starcoder":
                    response = query_starcoder(prompt, temperature)
                else:
                    raise ValueError(f"Unknown model in main: {model}")
                
                
                with open(f'../../../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated_{total_samples_per_prompt}.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated Python clone {total_samples_per_prompt} using {leetcode} Solution.py")
                    continue
        else:
            raise ValueError(f"Unknown task in main: {task}")


if __name__ == "__main__":
    main()