class Solution:
    def countMatchingSubarrays(self, nums: List[int], pattern: List[int]) -> int:
        ans=0
        for i in range(len(nums)-len(pattern)):
            j=i+1
            fl=0
            for k in range(len(pattern)):
                # print(k)
                if(pattern[k]==0):
                    if(nums[j]-nums[j-1]!=0):
                        fl=1
                        break
                elif(pattern[k]==1):
                    if(nums[j]-nums[j-1]<=0):
                        fl=2
                        break
                else:
                    if(nums[j]-nums[j-1]>=0):
                        fl=3
                        break
                j+=1
            # print(i,fl)
            if(fl==0):
                ans+=1
        return ans