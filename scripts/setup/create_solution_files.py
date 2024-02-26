import pandas

def main():
    with open("../../30_new_medium_leetcode_samples.csv") as file:
        data = pandas.read_csv(file)

    prompt_ids = data["Prompt_ID"].tolist()

    for prompt_id in prompt_ids:
        # get the java class from "Original_Java_Snippet" column
        java_class = data[data["Prompt_ID"] == prompt_id]["Original_Java_Snippet"].values[0]
        # write the java class to a file
        with open(f"../../data/{prompt_id}/Original_Solution.java", "w") as file:
            file.write(java_class)
        
        # get the python class from "Original_Python_Snippet" column
        python_class = data[data["Prompt_ID"] == prompt_id]["Original_Python_Snippet"].values[0]
        # write the python class to a file
        with open(f"../../data/{prompt_id}/Original_Solution.py", "w") as file:
            file.write(python_class)

        # get the C++ class from "Original_C++_Snippet" column
        cpp_class = data[data["Prompt_ID"] == prompt_id]["Original_C++_Snippet"].values[0]

        # write the C++ class to a file
        with open(f"../../data/{prompt_id}/Original_Solution.cpp", "w") as file:
            file.write(cpp_class)

        
if __name__ == "__main__":
    main()