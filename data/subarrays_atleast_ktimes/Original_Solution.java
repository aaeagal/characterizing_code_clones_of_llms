class Solution {
  public long countSubarrays(int[] nums, int k) {
    final int n = nums.length;
    int max = 0;
    for (int num : nums) {
      max = Math.max(max, num);
    }

    long count = 0;
    // frequency ==> index
    Map<Integer, Integer> seen = new HashMap<>();
    for (int i = 0, current = 0; i < n; i++) {
      if (nums[i] == max) {
        current++;
        seen.put(current, i);
      }
      if (current >= k) {
        // number of subarray end with nums[i]
        count += seen.get(current - k + 1) + 1;
      }
    }

    return count;
  }
}