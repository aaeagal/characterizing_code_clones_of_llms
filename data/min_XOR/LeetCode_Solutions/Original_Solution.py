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