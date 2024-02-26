class Solution:
    def maximumSetSize(self, nums1: List[int], nums2: List[int]) -> int:
        n = len(nums1)
        S1, S2 = set(nums1), set(nums2)
        s1, s2 = set(nums1), set(nums2)
        if len(S1) > n//2:
            for num in s1:
                if num in S2:
                    S1.remove(num)
                    if len(S1) == n//2: break
            while len(S1) > n//2:
                for num in s1:
                    if num in S1:
                        S1.remove(num)
                        if len(S1) == n//2: break
        if len(S2) > n//2:
            for num in s2:
                if num in S1:
                    S2.remove(num)
                    if len(S2) == n//2: break
            while len(S2) > n//2:
                for num in s2:
                    if num in S2:
                        S2.remove(num)
                        if len(S2) == n//2: break
                    
        return len(S1 | S2)
        