class Solution(object):
    def maximumLength(self, s):
        """
        :type s: str
        :rtype: int
        """
        s = s + '-'
        maps = collections.defaultdict(list)
        count = 1
        for i in range(1, len(s)):
            if s[i] == s[i - 1]:
                count += 1
            else:
                maps[s[i - 1]].append(count)
                count = 1
        res = -1
        for key in maps.keys():
            val = self.compute(maps[key])
            res = max(res, val)
        return res
    
    def compute(self, arr):
        left, right = 0, max(arr)
        while left < right:
            mid = (left + right + 1) / 2
            count = 0
            for ele in arr:
                if ele >= mid:
                    count += (ele - mid + 1)
            if count >= 3:
                left = mid
            else:
                right = mid - 1
        return left if left >= 1 else -1