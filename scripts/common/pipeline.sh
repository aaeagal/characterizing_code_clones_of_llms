#!/bin/bash

# store the system time
start=$(date +%s)

LeetCode=("apply_ops_empty_str")
temperatures=(0)
model=("gpt4")
tasks=("cppToJava")
sampling=("once" "repeated")

for temperature in "${temperatures[@]}"; do
    for task in "${tasks[@]}"; do
        for model in "${model[@]}"; do
            for sample in "${sampling[@]}"; do
                cd ../preprocess
                python3 preprocess_java_files.py --leetcode_description "${LeetCode}" --temperature "${temperature}" --sampling "${sample}" --model "${model}" --task "${task}"
                cd ../output
                python3 get_solution_output.py  --leetcode_description "${LeetCode}" --temperature "${temperature}" --sampling "${sample}" --model "${model}" --task "${task}"
                cd ../cluster
                python3 get_clusters.py --leetcode_description "${LeetCode}" --temperature "${temperature}" --sampling "${sample}" --model "${model}" --task "${task}"               
            done
        done
    done
done

# store the system time
end=$(date +%s)


# calculate the time taken
runtime=$((end-start))

# convert seconds to hours, minutes, and seconds
minutes=$((runtime / 60))

# print the time taken
echo "Total time taken: $minutes minutes"
