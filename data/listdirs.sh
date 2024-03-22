#!/bin/bash

# Create an empty array to hold directory names
directories=()

# Use find to locate directories in the current directory, then loop through them
while IFS= read -r -d '' dir; do
    # Append each directory to the array
    directories+=("$dir")
done < <(find . -mindepth 1 -maxdepth 1 -type d -print0)

# Print the array, formatted as a Bash array
printf "Directories: ("
for dir in "${directories[@]}"; do
    printf " \"%s\"" "${dir#./}"
done
printf " )\n"