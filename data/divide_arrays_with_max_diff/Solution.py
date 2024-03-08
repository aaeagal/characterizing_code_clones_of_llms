from typing import List
class Solution:
    def divideArray(self, nums: List[int], k: int) -> List[List[int]]:
        nums.sort()
        res = []
        for i in range(0, len(nums), 3):
            array = nums[i:i + 3]
            if array[-1] - array[0] > k:
                return None
            res.append(array)
        return res

def main():
    input_str = input()
    nums_str, k_str = input_str.split('] ')
    nums = list(map(int, nums_str.strip('[').split(',')))
    k = int(k_str)

    solution = Solution()
    result = solution.divideArray(nums, k)

    print(result)

if __name__ == "__main__":
    main()