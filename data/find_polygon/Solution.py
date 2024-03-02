from typing import List
class Solution:
    def largestPerimeter(self, nums: List[int]) -> int:
        nums.sort()
        for i in range(0,len(nums),1):
            print(nums[len(nums)-1-i],sum(nums[:len(nums)-i-1]))
            if sum(nums[:len(nums)-i-1])>nums[len(nums)-1-i]:
                return sum(nums[:len(nums)-i-1])+nums[len(nums)-1-i]
        return -1
                