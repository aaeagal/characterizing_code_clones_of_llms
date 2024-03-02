from collections import defaultdict
from math import sqrt
class Solution:
    def mostFrequentPrime(self, mat: list[list[int]]) -> int:
        d = [(-1, -1), (-1, 0), (-1, 1), (0, -1), (0, 1), (1, -1), (1, 0), (1, 1)]
        m, n = len(mat), len(mat[0])
        counter = defaultdict(int)

        def cal(i, j, val):
            for dx, dy in d:
                n_i, n_j, n_val = i, j, val
                while n_i >= 0 and n_i < m and n_j >= 0 and n_j < n:
                    n_val = n_val * 10 + mat[n_i][n_j]
                    counter[n_val] += 1
                    n_i, n_j = n_i + dx, n_j + dy
            
        def check(i):
            if i < 10: return False
            for j in range(2, int(sqrt(i)) + 1):
                if i % j == 0:
                    return False
            return True
        
        for i in range(m):
            for j in range(n):
                cal(i, j, 0)
        
        cnt = [(counter[x], x) for x in counter.keys()]
        cnt.sort(reverse=True)

        for _, val in cnt:
            if check(val):
                return val
        
        return -1