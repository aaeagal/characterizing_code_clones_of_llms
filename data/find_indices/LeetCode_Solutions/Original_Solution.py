from collections import deque

class KMP:
    def partial(pattern):
        """ Calculate partial match table: String -> [Int]"""
        ret = [0]
        
        for i in range(1, len(pattern)):
            j = ret[i - 1]
            while j > 0 and pattern[j] != pattern[i]:
                j = ret[j - 1]
            ret.append(j + 1 if pattern[j] == pattern[i] else j)
        return ret

    def search(T, P):
        """ 
        KMP search main algorithm: String -> String -> [Int] 
        Return all the matching position of pattern string P in T
        """
        partial, ret, j = KMP.partial(P), deque([]), 0
        
        for i in range(len(T)):
            while j > 0 and T[i] != P[j]:
                j = partial[j - 1]
            if T[i] == P[j]: j += 1
            if j == len(P): 
                ret.append(i - (j - 1))
                j = partial[j - 1]
            
        return ret

class Solution:
    def beautifulIndices(self, s: str, a: str, b: str, k: int) -> List[int]:

        a, b = KMP.search(s, a), KMP.search(s, b)
        ans = []

        while a and b:
            while b and b[0] < a[0] - k:
                b.popleft()

            if b and abs(a[0] - b[0]) <= k:
                ans.append(a[0])

            a.popleft()

        return ans