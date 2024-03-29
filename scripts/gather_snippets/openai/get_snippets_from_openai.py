import hashlib
import os
import sys
import json
import random
import openai
import re
import requests
import argparse
import logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')

# ----------------------------------------------------Global Variables----------------------------------------------------

# Get API keys(OpenAI)
openai.api_key = os.environ["OPENAI_API_KEY"]

# ----------------------------------------------------Functions----------------------------------------------------------

def parse_arguments() -> dict:
    """
    Parse the command line arguments

    This function parses the command line arguments and returns a dictionary
    of the parsed arguments.

    Returns:
        dict: The parsed arguments
    
    """
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

def query_gpt(prompt: str, model: str, temperature: float) -> str:
    """
    Sends a query to the specified GPT model and retrieves the response.

    This function submits a prompt to the OpenAI API using the specified GPT model.
    It allows setting a temperature for the response generation, influencing the
    creativity and randomness of the output.

    Args:
        prompt (str): The input text prompt to send to the model.
        model (str): The identifier of the GPT model to be used for the response.
        temperature (float): A float value that controls the randomness of the
                             response. Lower values make the model more deterministic.

    Returns:
        str: The content of the response from the GPT model.

    The function sets a fixed maximum token limit of 2048, with top_p set to 1,
    and both frequency_penalty and presence_penalty set to 0, for the generation
    of the response.
    """

    response = openai.ChatCompletion.create(
        model=model,
        messages=[
            {
                "role": "user",
                "content": f'{prompt}\n'
            }
        ],
        temperature=temperature,
        max_tokens=4000,
        top_p=1,
        frequency_penalty=0,
        presence_penalty=0
    )
    
    return response["choices"][0]["message"]["content"]

def get_file_suffix(task: str) -> str:
    """
    Returns the file suffix for the given task.

    This function returns the file suffix for the given task. The file suffix
    is used to determine the file extension of the generated code snippets.

    Args:
        task (str): The task for which to generate the file suffix.

    Returns:
        str: The file suffix for the given task.
    """
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
    

def main():
    # -- Get the command line arguments -- #
    args = parse_arguments()
    task = args.task
    model = args.model
    leetcode = args.leetcode_description
    temperature = args.temperature
    sampling = args.sampling

    # -- Set the model for OpenAI -- #
    if model == "gpt_3.5_turbo":
        model_for_open_ai = "gpt-3.5-turbo"
    else:
        model_for_open_ai = "gpt-4"

    # -- Fix temperature bug -- #
    if temperature == "0" or temperature == "1" or temperature == "2":
        temperature = int(temperature)
    else:
        temperature = float(temperature)
    
    # -- Get the file suffix -- #
    file_suffix = get_file_suffix(task)

    # -- Query the model -- #
    total_samples_per_prompt = 0

    while total_samples_per_prompt < 20:
        total_samples_per_prompt += 1

        if task == "cppToJava":
            # --- Read Solution.cpp file --- #
            with open(f'../data/{leetcode}/Solution.cpp', 'r') as solution_file:
                code = solution_file.read()
            
            # --- Query the model for combined clones --- #
            if sampling == "once":
                prompt = f"Generate 20 separate Java semantic code clones of the code below: \n{code}"
                response = query_gpt(prompt, model_for_open_ai, temperature)
                
                with open(f'../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated 20 Java semantic code clones using {leetcode} Solution.cpp")
                    break

            # --- Query the model for seperate clones --- #
            elif sampling == "repeated":
                prompt = f"Generate a Java semantic code clone of the code below: \n{code}"
                response = query_gpt(prompt, model_for_open_ai, temperature)
                
                with open(f'../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated_{total_samples_per_prompt}.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated Java semantic code clone {total_samples_per_prompt} using {leetcode} Solution.cpp")
                    continue
                
        elif task == "cppToPython":
            # --- Read Solution.cpp file --- #
            with open(f'../data/{leetcode}/Solution.cpp', 'r') as solution_file:
                code = solution_file.read()
            
            # --- Query the model for combined clones --- #
            if sampling == "once":
                prompt = f"Generate 20 separate Python semantic code clones of the code below: \n{code}"
                response = query_gpt(prompt, model_for_open_ai, temperature)
                
                with open(f'../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated 20 Python semantic code clones using {leetcode} Solution.cpp")
                    break

            # --- Query the model for seperate clones --- #
            elif sampling == "repeated":
                prompt = f"Generate a Python semantic code clone of the code below: \n{code}"
                response = query_gpt(prompt, model_for_open_ai, temperature)
                
                with open(f'../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated_{total_samples_per_prompt}.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated Python semantic code clone {total_samples_per_prompt} using {leetcode} Solution.cpp")
                    continue
        elif task == "javaToCpp":
            # --- Read Solution.java file --- #
            with open(f'../data/{leetcode}/Solution.java', 'r') as solution_file:
                code = solution_file.read()
            
            # --- Query the model for combined clones --- #
            if sampling == "once":
                prompt = f"Generate 20 separate C++ semantic code clones of the code below: \n{code}"
                response = query_gpt(prompt, model_for_open_ai, temperature)
                
                with open(f'../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated 20 C++ semantic code clones using {leetcode} Solution.java")
                    break

            # --- Query the model for seperate clones --- #
            elif sampling == "repeated":
                prompt = f"Generate a C++ semantic code clone of the code below: \n{code}"
                response = query_gpt(prompt, model_for_open_ai, temperature)
                
                with open(f'../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated_{total_samples_per_prompt}.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated C++ semantic code clone {total_samples_per_prompt} using {leetcode} Solution.java")
                    continue
        elif task == "javaToPython":
            # --- Read Solution.java file --- #
            with open(f'../data/{leetcode}/Solution.java', 'r') as solution_file:
                code = solution_file.read()
            
            # --- Query the model for combined clones --- #
            if sampling == "once":
                prompt = f"Generate 20 Python semantic code clones of the provided code below: \n{code}"
                response = query_gpt(prompt, model_for_open_ai, temperature)
                
                with open(f'../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated 20 Python semantic code clones using {leetcode} Solution.java")
                    break

            # --- Query the model for seperate clones --- #
            elif sampling == "repeated":
                prompt = f"Generate a Python semantic code clone of the code below: \n{code}"
                response = query_gpt(prompt, model_for_open_ai, temperature)
                
                with open(f'../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated_{total_samples_per_prompt}.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated Python semantic code clone {total_samples_per_prompt} using {leetcode} Solution.java")
                    continue
        elif task == "pythonToCpp":
            # --- Read Solution.py file --- #
            with open(f'../data/{leetcode}/Solution.py', 'r') as solution_file:
                code = solution_file.read()
            
            # --- Query the model for combined clones --- #
            if sampling == "once":
                prompt = f"Generate 20 separate C++ semantic code clones of the code below: \n{code}"
                response = query_gpt(prompt, model_for_open_ai, temperature)
                
                with open(f'../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated 20 C++ semantic code clones using {leetcode} Solution.py")
                    break

            # --- Query the model for seperate clones --- #
            elif sampling == "repeated":
                prompt = f"Generate a C++ semantic code clone of the code below: \n{code}"
                response = query_gpt(prompt, model_for_open_ai, temperature)
                
                with open(f'../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated_{total_samples_per_prompt}.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated C++ semantic code clone {total_samples_per_prompt} using {leetcode} Solution.py")
                    continue
        elif task == "pythonToJava":
            # --- Read Solution.py file --- #
            with open(f'../data/{leetcode}/Solution.py', 'r') as solution_file:
                code = solution_file.read()
            
            # --- Query the model for combined clones --- #
            if sampling == "once":
                prompt = f"Generate 20 separate Java semantic code clones of the code below: \n{code}"
                response = query_gpt(prompt, model_for_open_ai, temperature)
                
                with open(f'../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated 20 Java semantic clones using {leetcode} Solution.py")
                    break

            # --- Query the model for seperate clones --- #
            elif sampling == "repeated":
                prompt = f"Generate a Java semantic code clone of the code below: \n{code}"
                response = query_gpt(prompt, model_for_open_ai, temperature)
                
                with open(f'../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated_{total_samples_per_prompt}.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated Java semantic code clone {total_samples_per_prompt} using {leetcode} Solution.py")
                    continue
        elif task == "python":
            # --- Read Solution.py file --- #
            with open(f'../data/{leetcode}/Solution.py', 'r') as solution_file:
                code = solution_file.read()
            
            # --- Query the model for combined clones --- #
            if sampling == "once":
                prompt = f"Generate 20 separate syntactically different semantic Python code clones of the code below: \n{code}"
                response = query_gpt(prompt, model_for_open_ai, temperature)
                
                with open(f'../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated 20 Python syntactically different semantic code clones using {leetcode} Solution.py")
                    break

            # --- Query the model for seperate clones --- #
            elif sampling == "repeated":
                prompt = f"Generate a syntactically different semantic Python code clone of the code below: \n{code}"
                response = query_gpt(prompt, model_for_open_ai, temperature)
                
                with open(f'../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated_{total_samples_per_prompt}.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated Python syntactically different semantic code clone {total_samples_per_prompt} using {leetcode} Solution.py")
                    continue
        elif task == "java":
            # --- Read Solution.java file --- #
            with open(f'../data/{leetcode}/Solution.java', 'r') as solution_file:
                code = solution_file.read()
            
            # --- Query the model for combined clones --- #
            if sampling == "once":
                prompt = f"Generate 20 separate syntactically different semantic Java code clones of the code below: \n{code}"
                response = query_gpt(prompt, model_for_open_ai, temperature)
                
                with open(f'../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated 20 Java syntactically different semantic code clones using {leetcode} Solution.java")
                    break

            # --- Query the model for seperate clones --- #
            elif sampling == "repeated":
                prompt = f"Generate a syntactically different semantic Java code clone of the code below: \n{code}"
                response = query_gpt(prompt, model_for_open_ai, temperature)
                
                with open(f'../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated_{total_samples_per_prompt}.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated Java syntactically different semantic code clone {total_samples_per_prompt} using {leetcode} Solution.java")
                    continue
        elif task == "cpp":
            # --- Read Solution.cpp file --- #
            with open(f'../data/{leetcode}/Solution.cpp', 'r') as solution_file:
                code = solution_file.read()
            
            # --- Query the model for combined clones --- #
            if sampling == "once":
                prompt = f"Generate 20 separate syntactically different semantic C++ code clones of the code below: \n{code}"
                response = query_gpt(prompt, model_for_open_ai, temperature)
                
                with open(f'../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated 20 C++ syntactically different semantic code clones using {leetcode} Solution.cpp")
                    break

            # --- Query the model for seperate clones --- #
            elif sampling == "repeated":
                prompt = f"Generate a syntactically different semantic C++ code clone of the code below: \n{code}"
                response = query_gpt(prompt, model_for_open_ai, temperature)
                
                with open(f'../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated_{total_samples_per_prompt}.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated C++ syntactically different semantic code clone {total_samples_per_prompt} using {leetcode} Solution.cpp")
                    continue
        elif task == "java_regular":
            # --- Read Solution.java file --- #
            with open(f'../data/{leetcode}/Solution.java', 'r') as solution_file:
                code = solution_file.read()
            
            # --- Query the model for combined clones --- #
            if sampling == "once":
                prompt = f"Generate 20 separate Java semantic code clones of the code below: \n{code}"
                response = query_gpt(prompt, model_for_open_ai, temperature)
                
                with open(f'../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated 20 Java code clones using {leetcode} Solution.java")
                    break

            # --- Query the model for seperate clones --- #
            elif sampling == "repeated":
                prompt = f"Generate a Java code clone of the code below: \n{code}"
                response = query_gpt(prompt, model_for_open_ai, temperature)
                
                with open(f'../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated_{total_samples_per_prompt}.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated Java syntactically different clone {total_samples_per_prompt} using {leetcode} Solution.java")
                    continue
        elif task == "cpp_regular":
            # --- Read Solution.cpp file --- #
            with open(f'../data/{leetcode}/Solution.cpp', 'r') as solution_file:
                code = solution_file.read()
            
            # --- Query the model for combined clones --- #
            if sampling == "once":
                prompt = f"Generate 20 separate C++ semantic code clones of the code below: \n{code}"
                response = query_gpt(prompt, model_for_open_ai, temperature)
                
                with open(f'../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated 20 C++ code clones using {leetcode} Solution.cpp")
                    break

            # --- Query the model for seperate clones --- #
            elif sampling == "repeated":
                prompt = f"Generate a C++ code clone of the code below: \n{code}"
                response = query_gpt(prompt, model_for_open_ai, temperature)
                
                with open(f'../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated_{total_samples_per_prompt}.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated C++ clone {total_samples_per_prompt} using {leetcode} Solution.cpp")
                    continue
        elif task == "python_regular":
            # --- Read Solution.py file --- #
            with open(f'../data/{leetcode}/Solution.py', 'r') as solution_file:
                code = solution_file.read()
            
            # --- Query the model for combined clones --- #
            if sampling == "once":
                prompt = f"Generate 20 separate Python semantic code clones of the code below: \n{code}"
                response = query_gpt(prompt, model_for_open_ai, temperature)
                
                with open(f'../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated 20 Python code clones using {leetcode} Solution.py")
                    break

            # --- Query the model for seperate clones --- #
            elif sampling == "repeated":
                prompt = f"Generate a Python code clone of the code below: \n{code}"
                response = query_gpt(prompt, model_for_open_ai, temperature)
                
                with open(f'../data/{leetcode}/{temperature}/{model}/{task}/{sampling}/llm_generated/generated_{total_samples_per_prompt}.{file_suffix}', 'w') as file:
                    file.write(response)
                    logging.info(f"Generated Python clone {total_samples_per_prompt} using {leetcode} Solution.py")
                    continue
        else:
            raise ValueError(f"Unknown task in main: {task}")



        

if __name__ == "__main__":
    main()