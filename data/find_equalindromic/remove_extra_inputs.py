import json
def main():
    with open('input_corpus.json', 'r') as f:
        input_corpus = json.load(f)

    # remove the power key from the input corpus
    del input_corpus["isPal"]
    del input_corpus["calculateCost"]

    with open('input_corpus.json', 'w') as f:
        json.dump(input_corpus, f, indent=4)

if __name__ == "__main__":
    main()