import argparse
import logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')
import requests
import json
import os
from openai import OpenAI

# --------------------------------------------------Global Variables------------------------------------------------------ #
huggingface_token = os.environ["HUGGINGFACE_TOKEN"]
client = OpenAI(
	base_url="https://c15yfse7gpktep2p.us-east-1.aws.endpoints.huggingface.cloud/v1/", 
	api_key=f"{huggingface_token}" 
)
# ----------------------------------------------------Functions----------------------------------------------------------- #

def parse_arguments() -> dict:
    parser = argparse.ArgumentParser(description='Queries the LLMs for a given prompt and returns code snippets.')

    parser.add_argument(
        '--leetcode_description', type=str, help='Prompt to send to the model', required=True
    )
    parser.add_argument(
        '--temperature', type=float, help='Temperature for the response generation', required=True
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

def get_file_suffix_and_language(task: str) -> str:
    if task == "cppToJava":
        file_suffix="java"
        lang="Java"
    elif task == "cppToPython":
        file_suffix="py"
        lang="Python"
    elif task == "javaToCpp":
        file_suffix="cpp"
        lang="C++"
    elif task == "javaToPython":
        file_suffix="py"
        lang="Python"
    elif task == "pythonToCpp":
        file_suffix="cpp"
        lang="C++"
    elif task == "pythonToJava":
        file_suffix="java"
        lang="Java"
    elif task == "python":
        file_suffix="py"
        lang="Python"
    elif task == "java":
        file_suffix="java"
        lang="Java"
    elif task == "cpp":
        file_suffix="cpp"
        lang="C++"
    elif task == "java_regular":
        file_suffix="java"
        lang="Java"
    elif task == "cpp_regular":
        file_suffix="cpp"
        lang="C++"
    elif task == "python_regular":
        file_suffix="py"
        lang="Python"
    else:
        raise ValueError(f"Unknown file suffix in get_file_suffix: {task}")
    
    return file_suffix, lang

def query_codellama(prompt: str, temperature: float) -> str:
    response_str = ""
    stop_sequence = "<step>"
    messages = [
                    {
                    "role": "system",
                    "content": "You are an expert coding assistant that provides code clones to users in markdown blocks.",
                    },
                    {
                        "role": "user",
                        "content": prompt
                    }
                ]
    try:
        logging.info(f"Querying codellama")
        response = client.chat.completions.create(
            messages=messages,
            model="tgi",   
            temperature=temperature,
            max_tokens=4000,
            stream=True
        )
        for message in response:
            content = message.choices[0].delta.content
            # Check if the stop sequence is in the content
            if stop_sequence in content:
                # If yes, split the content at the first occurrence of the stop sequence and take the part before it
                content_before_stop, _ = content.split(stop_sequence, 1)
                print(content_before_stop, end="")
                response_str += content_before_stop
                break  # Stop the loop after processing the content up to the first stop sequence
            else:
                # If the stop sequence is not in the content, process it normally
                print(content, end="")
                response_str += content

        return response_str                  
    except requests.exceptions.HTTPError as e:
        logging.error(f"Error in query_codellama: {e}")
        return "Error in query_codellama"

def query_starcoder(prompt: str, temperature: float) -> str:
    stardata = {
        "inputs": prompt,
        "parameters": {
            "temperature": temperature,
            "max_length": 6500,      
        }
    }
    
    try:
        response = requests.post(starcoder_API_URL="bot", headers="dot", json=stardata)
        response.raise_for_status()
        print(response.json())
        return response.json()[0]['generated_text']
    except requests.exceptions.HTTPError as e:
        with open("error_response.json", "w") as file:
            file.write(json.dumps(response.json(), indent=4))
        logging.error(f"Error in query_codellama: {e}")
        return "Error in query_codellama"
    
def main():
    args = parse_arguments()
    task = args.task
    model = args.model
    leetcode = args.leetcode_description
    temperature = args.temperature
    sampling = args.sampling

    logging.info(f"Starting to gather hugging face snippets the leetcode problem: {leetcode} using the model: {model} with temperature: {temperature} and task: {task} and sampling: {sampling}")

    # -- Get file suffix -- #
    file_suffix, lang  = get_file_suffix_and_language(task)
    # -- Query the model -- #
    total_samples_per_prompt = 0

    while total_samples_per_prompt < 20:
        total_samples_per_prompt += 1

        with open(f'../../../data/{leetcode}/Solution.{file_suffix}', 'r') as solution_file:
            code = solution_file.read()
        
        # --- Query the model for combined clones --- #
        if sampling == "once":
            prompt = f"Generate 20 separate {lang} semantic code clones of the code below: \n{code}"
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
            prompt = f"Generate a {lang} semantic code clone of the code below: \n{code}"
            
            if model == "codellama":
                response = query_codellama(prompt, temperature)
            elif model == "starcoder":
                response = query_starcoder(prompt, temperature)
            else:
                raise ValueError(f"Unknown model in main: {model}")
            
            with open(f'../../../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated_{total_samples_per_prompt}.{file_suffix}', 'w') as file:
                file.write(response)
                logging.info(f"Generated Java semantic code clone {total_samples_per_prompt} using {leetcode} Solution.cpp")
                continue



if __name__ == "__main__":
    main()