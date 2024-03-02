from collections import defaultdict
from typing import List
class Solution:
    def countSubarrays(self, nums: List[int], k: int) -> int:
        maxnum = max(nums)
        n = len(nums)
        g = defaultdict(int)
        
        right = 0
        left = 0
        target = k
        total = 0
        ans = 0
        count =  ( 1 + n ) * n // 2
        
            
        
        while right < n:
            g[nums[right]] += 1
            
            while g[maxnum] >= target and left <= right:
                g[nums[left]] -= 1
                left += 1
            
            ans += (right - left + 1)
            right += 1
        
        return count - ans
        