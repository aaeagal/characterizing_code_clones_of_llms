#!/bin/bash

# store the system time
start=$(date +%s)

temperatures=(1)
#tasks=("javaToPython" "javaToCpp" "pythonToJava" "pythonToCpp" "cppToJava" "cppToPython") # "cpp" "java" "python" "cpp_regular" "java_regular" "python_regular"
tasks=("cppToJava")

LeetCode=("apply_ops_empty_str")
model=("codellama")
sampling=("repeated")
for temperature in "${temperatures[@]}"; do
    for task in "${tasks[@]}"; do
        for model in "${model[@]}"; do
            for sample in "${sampling[@]}"; do
                python3 get_snippets_from_huggingface.py --leetcode_description "${LeetCode}" --task "${task}" --temperature "${temperature}" --sampling "${sample}" --model "${model}"
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