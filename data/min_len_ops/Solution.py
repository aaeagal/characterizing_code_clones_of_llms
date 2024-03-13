from typing import List
class Solution:
    def minimumArrayLength(self, nums: List[int]) -> int:
        nums.sort()
        
        cnt = 1
        for num in nums[1:]:
            if num == nums[0]: cnt += 1
            else: 
                if num % nums[0] != 0: return 1
        return (cnt+1)//2

def main():
    input_str = input()
    nums = list(map(int, input_str.strip("[]").split(",")))
    solution = Solution()
    print(solution.minimumArrayLength(nums))

if __name__ == "__main__":
    main()