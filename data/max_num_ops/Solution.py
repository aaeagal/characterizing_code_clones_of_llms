from functools import cache
from typing import List
class Solution:
    def maxOperations(self, nums: List[int]) -> int:
        n = len(nums)
        if n == 1: return 0
        @cache
        def dfs(target, start, end):
            if end - start <= 0:
                return 0
            p1 = p2 = p3 = 0
            if nums[start] + nums[start+1] == target:
                p1 = 1 + dfs(target, start+2, end)
            if nums[start] + nums[end] == target:
                p2 = 1 + dfs(target, start+1, end-1)
            if nums[end] + nums[end-1] == target:
                p3 = 1 + dfs(target, start, end-2)
            return max(p1, p2, p3)
        return max(dfs(nums[0]+nums[1], 0, n-1), dfs(nums[0]+nums[-1], 0, n-1), dfs(nums[-1]+nums[-2], 0, n-1))