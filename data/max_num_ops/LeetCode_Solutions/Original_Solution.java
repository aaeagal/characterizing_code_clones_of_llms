class Solution {
    int N = 0;
    Integer[][] memo1, memo2, memo3;
    public int maxOperations(int[] nums) {
        N = nums.length;
        memo1 = new Integer[N][N];
        memo2 = new Integer[N][N];
        memo3 = new Integer[N][N];
        
        int sum1 = nums[0] + nums[1];
        int sum2 = nums[N - 1] + nums[N - 2];
        int sum3 = nums[0] + nums[N - 1];
        return Math.max(Math.max(helper(nums, 0, N - 1, sum2, memo2), helper(nums, 0, N - 1, sum1, memo1)), helper(nums, 0, N - 1, sum3, memo3));
    }
    
    int helper(int[] nums, int l, int r, int sum, Integer[][] memo) {
        if(l > r - 1) return 0;
        if(memo[l][r] != null) return memo[l][r];
        int res1 = 0, res2 = 0, res3 = 0;
        if(nums[l] + nums[l + 1] == sum) {
            res1 = 1 + helper(nums, l + 2, r, sum, memo);
        }
        if(nums[r] + nums[r - 1] == sum) {
            res2 = 1 + helper(nums, l, r - 2, sum, memo);
        }
        if(nums[l] + nums[r] == sum) {
            res3 = 1 + helper(nums, l + 1, r - 1, sum, memo);
        }
        return memo[l][r] = Math.max(Math.max(res1, res2), res3);
    }

}