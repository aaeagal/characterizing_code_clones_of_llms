from collections import defaultdict
from typing import List
import ast
class Solution:
    def longestCommonPrefix(self, arr11: List[int], arr21: List[int]) -> int:
        d = defaultdict(int)
        p = defaultdict(int)
        arr1 = list(set(arr11))
        arr2 = list(set(arr21))
        count = 0
        for i in arr1:
            if d[i]==0:
                d[i]+=1
                a = str(i)
                if len(a)>1:
                    t = len(a)-1
                    while t>0:
                        if d[int(a[:t])]>0:
                            break
                        else:
                            d[int(a[:t])]+=1
                            t-=1
        for i in arr2:
            if p[i]==0:
                p[i]+=1
                a = str(i)
                if d[i]>0:
                    count = max(count,len(a))
                elif len(a)>1:
                    t = len(a)-1
                    while t>0:
                        if d[int(a[:t])]>0:
                            count = max(count,len(a[:t]))
                            break
                        else:
                            p[int(a[:t])]+=1
                            t-=1
        return count
def main():
    input_str = input()
    input_list = input_str.split(' ', 1)  # Split input into two parts based on the first space
    arr1 = ast.literal_eval(input_list[0])  # Convert the first part to a list
    arr2 = ast.literal_eval(input_list[1])  # Convert the second part to a list
    solution = Solution()
    print(solution.longestCommonPrefix(arr1, arr2))
if __name__ == "__main__":
    main()