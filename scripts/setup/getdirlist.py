import os
def main():
    # get the immediate subdirectories of the current directory
    subdirs = [d for d in os.listdir(".") if os.path.isdir(d)]
    string_forbash = "LeetCode=("
    for i in range(len(subdirs)):
        string_forbash += f'"{subdirs[i]}" '
    string_forbash += ")"

    print(string_forbash)

if __name__ == "__main__":
    main()