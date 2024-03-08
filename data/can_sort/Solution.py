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
    
def main():
    input_str = input()
    nums = [int(num) for num in input_str.split()]
    solution = Solution()  # Assuming Solution class is defined elsewhere
    result = solution.canSortArray(nums)  # Assuming the Solution class has a method canSortArray
    print(result)

if __name__ == "__main__":
    main()

