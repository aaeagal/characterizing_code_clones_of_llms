import pandas
import os
models = ["codellama", "gpt_3.5_turbo", "gpt4", "starcoder"]
temperatures = ["0", "0.5", "1", "1.5", "2"]
def main():
    with open("../30_new_medium_leetcode_samples.csv") as file:
        data = pandas.read_csv(file)

        # put the rows in the column "Prompt_ID" into a list
        prompt_ids = data["Prompt_ID"].tolist()

        # create a directory for each prompt_id
        for prompt_id in prompt_ids:
            os.mkdir(f"../data/{prompt_id}")

            # create a directory for each temperature
            for temp in temperatures:
                os.mkdir(f"../data/{prompt_id}/{temp}")

                # create a directory for each model
                for model in models:
                    os.mkdir(f"../data/{prompt_id}/{temp}/{model}")

        # Get the earliest date from the column "date_of_first_published_solution"
        data["date_of_first_published_solution"] = pandas.to_datetime(data["date_of_first_published_solution"])
        earliest_date = data["date_of_first_published_solution"].min()
        print(earliest_date)
        latest_date = data["date_of_first_published_solution"].max()
        print(latest_date)


if __name__ == "__main__":
    main()