class Solution {
public:
    int minimumArrayLength(vector<int>& nums) {
        int mx = INT_MIN, mn = INT_MAX, res = 0;
        for(auto& a: nums) 
            mx = max(mx, a), mn = min(mn, a);
        for(auto& a: nums)
            if(a == mn) res++;
            else if(a % mn != 0) return 1;
        return (res+1)/2;
    }
};