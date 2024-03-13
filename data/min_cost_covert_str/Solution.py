import sys
import ast
import json
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

def main():
    # Read the input string from standard input
    input_string = input().strip()
    
    # Splitting the input string into its components
    parts = input_string.split(' ')
    source = parts[0]
    target = parts[1]
    original = ast.literal_eval(parts[2])
    changed = ast.literal_eval(parts[3])
    cost = ast.literal_eval(parts[4])

    # Create an object of the Solution class
    sol = Solution()

    # Call the minimumCost method of the Solution class
    result = sol.minimumCost(source, target, original, changed, cost)

    # Print the result to standard output
    print(result)

if __name__ == "__main__":
    main()