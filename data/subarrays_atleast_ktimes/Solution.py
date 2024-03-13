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

def main():
    input_str = input()
    nums_str, k_str = input_str.split('] ')
    nums_list = [int(x) for x in nums_str.strip('[').split(',')]
    k = int(k_str)

    solution = Solution()
    result = solution.countSubarrays(nums_list, k)
    print(result)

if __name__ == "__main__":
    main()