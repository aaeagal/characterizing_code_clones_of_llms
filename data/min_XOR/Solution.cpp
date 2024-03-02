#include <vector>
using namespace std;
class Solution {
public:
    int minOperations(vector<int>& nums, int k) {
        int n=nums.size();
        int ans=0;
        for(int i=0;i<32;i++){
            int onecnt=0;
            for(int j=0;j<n;j++){
                if(nums[j]&(1<<i))onecnt++;
            }
            int reqbit=k&(1<<i);
            if(reqbit==0){
                if(onecnt%2)ans++;
                //  if req bit is 0 and 1cnt is odd means we need to change 1 bit
            }
            else{
                if(onecnt%2==0)ans++;
                //  if req bit is 1 and 1cnt is even means we need to change 1 bit
            }
        }
        return ans;
    }
};