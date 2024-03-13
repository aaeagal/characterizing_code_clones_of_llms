from typing import List
import ast
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

def main():
    input_str = input()
    input_list = input_str.split(' ', 1)  # Split input into two parts based on the first space
    arr1 = ast.literal_eval(input_list[0])  # Convert the first part to a list
    arr2 = ast.literal_eval(input_list[1])  # Convert the second part to a list
    solution = Solution()
    print(solution.countMatchingSubarrays(arr1, arr2))
if __name__ == "__main__":
    main()