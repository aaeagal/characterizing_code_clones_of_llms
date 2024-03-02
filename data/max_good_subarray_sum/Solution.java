import java.util.*;
class Solution {
    
    long prefixSum[];
    
    public long maximumSubarraySum(int[] nums, int k) {
        prefixSum = new long[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
        
        long max = Long.MIN_VALUE;
        HashMap<Integer, Integer> idxByNum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (idxByNum.containsKey(k + nums[i])) {
                int idx = idxByNum.get(k + nums[i]);
                max = Math.max(max, sum(idx, i));
            }
            if (idxByNum.containsKey(nums[i] - k)) {
                int idx = idxByNum.get(nums[i] - k);
                max = Math.max(max, sum(idx, i));
            }
            
            if (idxByNum.containsKey(nums[i])) {
                int prev = idxByNum.get(nums[i]);
                if (sum(prev + 1, i) < 0) {
                    idxByNum.put(nums[i], i);
                }
            } else {
                idxByNum.put(nums[i], i);
            }
        }
        return max == Long.MIN_VALUE ? 0 : max;
    }
    
    public long sum(int fromInclusive, int endInclusive) {
        return prefixSum[endInclusive] - (fromInclusive > 0 ? prefixSum[fromInclusive - 1] : 0);
    }
}