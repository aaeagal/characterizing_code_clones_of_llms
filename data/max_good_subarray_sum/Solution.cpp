#include <vector>
#include <unordered_map>
using namespace std;
class Solution {
public:
    long long maximumSubarraySum(vector<int>& nums, int k) {
        int n=nums.size();
        vector<long long>pre(n);
        pre[0]=nums[0];
        for(int i=1;i<nums.size();i++)
        {
            pre[i]=pre[i-1]+nums[i];
        }
        unordered_map<int,vector<int>>mp;
        long long ans=-1e16;
        mp[nums[0]].push_back(0);
        for(int i=1;i<n;i++)
        {
            for(auto it:mp[nums[i]-k])
            {
                long long sum=pre[i]-(it==0?0:pre[it-1]);
                ans=max(ans,sum);
            }
            for(auto it:mp[nums[i]+k])
            {
                long long sum=pre[i]-(it==0?0:pre[it-1]);
                ans=max(ans,sum);
            }
            mp[nums[i]].push_back(i);
        }
        return ans==-1e16?0:ans;
    }
};