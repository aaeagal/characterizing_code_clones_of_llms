from collections import Counter
from typing import List
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
