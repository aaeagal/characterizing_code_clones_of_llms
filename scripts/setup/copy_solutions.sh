#!/bin/bash

# Navigate to the data directory where the script is located
cd "$(dirname "$0")"

# Iterate through each subfolder in the current directory
for dir in */ ; do
    # Check if the directory is actually a directory
    if [ -d "$dir" ]; then
        # Navigate into the directory
        cd "$dir"
        
        # Create the LeetCode_Solutions folder if it doesn't exist
        mkdir -p LeetCode_Solutions
        
        # Find all Original_Solution files and perform actions
        find . -maxdepth 1 -type f -name "Original_Solution.*" | while read file; do
            # Copy each Original_Solution file to LeetCode_Solutions folder, retaining the Original_ prefix
            cp "$file" "LeetCode_Solutions/${file#./}"
            
            # Remove the Original_ prefix from the files in the subfolder
            mv "$file" "${file#./Original_}"
        done
        
        # Go back to the parent directory
        cd ..
    fi
done