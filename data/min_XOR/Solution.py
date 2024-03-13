from typing import List
class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        
        xor_all=0
        for num in nums:
            xor_all^=num

        target_xor = xor_all^k
        total_flips = 0

        while target_xor >0:
            if target_xor&1== 1:
                total_flips+= 1
            target_xor >>=1

        return total_flips
    
def main():
    input_str = input()
    nums_str, k_str = input_str.split('] ')
    nums_list = [int(x) for x in nums_str.strip('[').split(',')]
    k = int(k_str)

    solution = Solution()
    result = solution.minOperations(nums_list, k)
    print(result)

if __name__ == "__main__":
    main()