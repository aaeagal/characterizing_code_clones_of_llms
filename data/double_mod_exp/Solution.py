from typing import List
import ast
class Solution:
    def getGoodIndices(self, variables: List[List[int]], target: int) -> List[int]:
        res = []
        for i, (a, b, c, m) in enumerate(variables):
            if pow((pow(a, b) % 10), c) % m == target:
                res.append(i)
        return res
    
def main():
    # Read the input string
    input_str = input()
    
    # Split the input to separate the arrays part from the target value
    arrays_part, target_str = input_str.rsplit('] ', 1)
    arrays_part += ']'
    
    # Use ast.literal_eval to safely evaluate the string as a Python expression
    arrays = ast.literal_eval(arrays_part)
    target = int(target_str)
    
    # Create an instance of Solution and call the method
    solution = Solution()
    result = solution.getGoodIndices(arrays, target)
    
    # Print the result
    print(result)

if __name__ == "__main__":
    main()