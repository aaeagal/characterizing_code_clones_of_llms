import pandas
import os

models = ["codellama", "gpt_3.5_turbo", "gpt4", "starcoder"]
temperatures = ["0", "0.5", "1", "1.5", "2"]
tasks = ["javaToPython", "javaToCpp", "pythonToJava", "pythonToCpp", "cppToJava", "cppToPython", "cpp", "java", "python", "cpp_regular", "java_regular", "python_regular"]
prompting = ["seperate", "combined"]
preprocessing = ["llm_generated", "preprocessed"]
def main():
    with open("../../30_new_medium_leetcode_samples.csv") as file:
        data = pandas.read_csv(file)

        # put the rows in the column "Prompt_ID" into a list
        prompt_ids = data["Prompt_ID"].tolist()

        # create a directory for each prompt_id
        for prompt_id in prompt_ids:

            # create a directory for each temperature
            for temp in temperatures:

                # create a directory for each model
                for model in models:


                    # create a directory for each task
                    for task in tasks:
                        os.mkdir(f"../../data/{prompt_id}/{temp}/{model}/{task}")

                        # create a directory for each prompting
                        for prompt in prompting:
                            os.mkdir(f"../../data/{prompt_id}/{temp}/{model}/{task}/{prompt}")

                            for preprocess in preprocessing:
                                os.mkdir(f"../../data/{prompt_id}/{temp}/{model}/{task}/{prompt}/{preprocess}")



if __name__ == "__main__":
    main()