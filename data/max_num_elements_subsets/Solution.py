from typing import List
import collections
class Solution:
    def maximumLength(self, nums: List[int]) -> int:
        cnt = collections.Counter(nums)
        res = 1
        if 1 in cnt:
            one = cnt[1]
            if one % 2 == 0:
                res = one - 1
            else:
                res = one
        seen = {1}
        for k in sorted(cnt.keys()):
            if k not in seen:
                if cnt[k] > 1:
                    curMax = 1
                    cur = k
                    while cur * cur in cnt:
                        curMax += 1
                        cur = cur * cur
                        if cnt[cur] == 1:
                            break
                        seen.add(cur)
                    res = max(res, curMax * 2 - 1)
            seen.add(k)
        return res
    
def main():
    input_str = input()
    nums = list(map(int, input_str.strip("[]").split(",")))
    
    solution = Solution()
    result = solution.maximumLength(nums)
    print(result)

if __name__ == "__main__":
    main()