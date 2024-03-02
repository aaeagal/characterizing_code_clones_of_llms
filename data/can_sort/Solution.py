from typing import List

class Solution:
    def canSortArray(self, nums: List[int]) -> bool:
        def can_swap(a, b):
            return a.bit_count() == b.bit_count()
        n = len(nums)
        for i in range(n*n):
            for j in range(n-1):
                if nums[j] > nums[j+1] and can_swap(nums[j], nums[j+1]):
                    nums[j], nums[j+1] = nums[j+1], nums[j]
        return nums == sorted(nums)