class Solution:
    def minimumTimeToInitialState(self, word: str, k: int) -> int:
        count = 0
        for i in range(0,len(word),k):
            a = word[i:]
            if a==word[:len(a)] and count!=0:
                break
            count+=1
        return (count)
    
def main():
    input_str = input()

    input_list = input_str.split()

    word = input_list[0]

    k = int(input_list[1])

    s = Solution()

    print(s.minimumTimeToInitialState(word, k))

if __name__ == "__main__":
    main()

