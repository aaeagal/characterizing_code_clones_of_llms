#!/bin/bash

temperatures=(0 0.5 1 1.5 2)
tasks=("javaToPython" "javaToCpp" "pythonToJava" "pythonToCpp" "cppToJava" "cppToPython") # "cpp" "java" "python" "cpp_regular" "java_regular" "python_regular"
#LeetCode=("double_mod_exp" "find_indices" "find_equalindromic" "min_cost_covert_str" "place_people" "min_num_x_and_y" "longest_common_prefix" "house_distance" "max_num_ops" "min_len_ops" "subarrays_atleast_ktimes" "num_subarrays_patterns" "find_grid" "max_num_elements_subsets" "min_time_revert" "divide_arrays_with_max_diff" "min_XOR" "frequent_prime" "find_polygon" "max_num_less_eq_k" "bob_alice_flower" "longest_substring_thrice" "min_moves_queen" "max_palindrome_ops" "can_sort" "max_set_removals" "min_pushes" "max_sq_area" "apply_ops_empty_str" "max_good_subarray_sum")
LeetCode=("apply_ops_empty_str")
model=("gpt_3.5_turbo" "gpt4")
sampling=("once" "repeated")
for temperature in "${temperatures[@]}"; do
    for task in "${tasks[@]}"; do
        for model in "${model[@]}"; do
            for sample in "${sampling[@]}"; do
                python3 get_snippets_from_openai.py --leetcode_description apply_ops_empty_str --task "${task}" --temperature "${temperature}" --sampling "${sample}" --model "${model}"
            done
        done
    done
done