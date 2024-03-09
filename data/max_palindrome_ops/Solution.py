from collections import Counter
from typing import List
import ast
class Solution:
    def maxPalindromesAfterOperations(self, words: List[str]) -> int:
        n = len(words)
        v = Counter(''.join(words)).most_common()     
        v = sum([f//2 for a,f in v])        
        sizes = [len(w) for w in words]
        sizes.sort()
        
        ans = 0
        for i in range(n):
            need = sizes[i]//2
            x = min(need,v)
            v-=x 
            need-=x
            if need==0:
                ans+=1
        
        return ans

def main():
    input_str = input()

    input_list = ast.literal_eval(input_str)

    s = Solution()

    behavior = s.maxPalindromesAfterOperations(input_list)

    print(behavior)
    
if __name__ == "__main__":
    main()