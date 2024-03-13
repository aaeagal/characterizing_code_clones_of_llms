from typing import List
import ast
class Solution:
    def largestPerimeter(self, nums: List[int]) -> int:
        nums.sort()
        for i in range(0,len(nums),1):
            #print(nums[len(nums)-1-i],sum(nums[:len(nums)-i-1]))
            if sum(nums[:len(nums)-i-1])>nums[len(nums)-1-i]:
                return sum(nums[:len(nums)-i-1])+nums[len(nums)-1-i]
        return -1

def main():
    input_str = input()
    nums = ast.literal_eval(input_str)
    solution = Solution() 
    result = solution.largestPerimeter(nums) 
    print(result)
    
if __name__ == "__main__":
    main()