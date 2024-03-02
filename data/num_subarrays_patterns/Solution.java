class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        if (nums.length <= pattern.length) return -1;
        int cnt = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int flag = 0;
            
            for (int j = 0; j < pattern.length; j++) {
                if ((nums.length - i) <= pattern.length) {
                    flag = 1;
                    break;
                }
                if (pattern[j] == 1) {
                    if (nums[i+j+1] <= nums[i+j]) {
                        flag = 1;
                        break;
                    }
                }
                if (pattern[j] == 0) {
                    if (nums[i+j+1] != nums[i+j]) {
                        flag = 1;
                        break;
                    }
                }
                if (pattern[j] == -1) {
                    if (nums[i+j+1] >= nums[i+j]) {
                        flag = 1;
                        break;
                    }
                }
            }
            
            if (flag == 0) cnt ++;
        }
        
        return cnt;
    }
}