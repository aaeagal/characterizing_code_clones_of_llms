from itertools import accumulate
from typing import List
class Solution:
    def maximumSubarraySum(self, nums: List[int], k: int) -> int:
        pref=list(accumulate(nums,initial=0))
        d={}
        ans=float('-inf')
        for i,x in enumerate(nums):
            if x not in d:
                d[x]=i
            elif pref[i]<pref[d[x]]:
                d[x]=i
            target=[x-k,x+k]
            for t in target:
                if t in d:
                    ans=max(ans,pref[i+1]-pref[d[t]])
        return ans if ans!=float("-inf") else 0
    
def main():
    input_str = input()
    nums_str, k_str = input_str.split('] ')
    nums_list = [int(x) for x in nums_str.strip('[').split(',')]
    k = int(k_str)

    solution = Solution()
    result = solution.maximumSubarraySum(nums_list, k)
    print(result)

if __name__ == "__main__":
    main()