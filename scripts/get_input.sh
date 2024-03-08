cd ../data

# Iterate through all the subdirectories
for dir in $(ls -d */); do
    # Remove the trailing slash
    dir=${dir%/}
    # Get the full filepath of the Solution.java file in the subdirectory
    filepath="${dir}/Solution.java"
    
    # Check if the Solution.java file exists in the subdirectory
    if [ -f "$filepath" ]; then
        # Run the input script on the Solution.java file
        cd ../scripts
        python3 generate_input_corpus.py --filepath "/home/aeagal/characterizing_code_clones_of_llms/data/${filepath}"
        cd - > /dev/null
    fi
# End for loop
done
