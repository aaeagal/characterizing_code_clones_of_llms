class Solution {
public:
    bool canSortArray(vector<int>& nums) {
        int n = nums.size();
        
        vector<int> c = nums;
        sort(begin(c),end(c));
        
        int prev=0 , i=0;
        int a = __builtin_popcount(nums[0]);
        while(i < n) {
            int b = __builtin_popcount(nums[i]);
            
            while(i<n && a==__builtin_popcount(nums[i])) {
                i++;
            }
            sort(nums.begin()+prev,nums.begin()+i);
            prev = i;
            if(i < n)   a = __builtin_popcount(nums[i]);
        }
        return c==nums;
    }
};