class Solution(object):
    def minimumCost(self, source, target, original, changed, cost):
        """
        :type source: str
        :type target: str
        :type original: List[str]
        :type changed: List[str]
        :type cost: List[int]
        :rtype: int
        """
    
        A = [[float('inf') for i in range(26)] for j in range(26)]
        
        for i in range(len(original)):
            a, b = original[i], changed[i]
            a, b = ord(a) - ord('a'), ord(b) - ord('a')
            A[a][b] = min(A[a][b], cost[i])
        for k in range(26):
            for i in range(26):
                for j in range(26):
                    if A[i][j] > A[i][k] + A[k][j]:
                        A[i][j] = A[i][k] + A[k][j]
        res = 0
        for i in range(len(source)):
            if source[i] != target[i]:
                a, b = source[i], target[i]
                a, b = ord(a) - ord('a'), ord(b) - ord('a')
                if A[a][b] == float('inf'): return -1
                res += A[a][b]
                
        return res