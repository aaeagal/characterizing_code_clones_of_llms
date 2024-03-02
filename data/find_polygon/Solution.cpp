#include <vector>
#include <algorithm>
using namespace std;
class Solution {
public:
    long long largestPerimeter(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        long long sum=0,ans=-1;
        for(int i=0;i<nums.size();i++){
            if(nums[i]<sum) ans=sum+nums[i];
            sum+=nums[i];
        }
        return ans;
    }
};