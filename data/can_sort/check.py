import json

# Load the JSON data from the file
with open('input_corpus.json') as file:
    data = json.load(file)

# Initialize a dictionary to hold the counts
list_counts = {}

# Iterate through each key in the dictionary
for key in data.keys():
    # Count the number of list elements in the value
    list_counts[key] = len(data[key])

print(list_counts)