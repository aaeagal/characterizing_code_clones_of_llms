class Solution {
  public int minOperations(int[] nums, int k) {
    int mask = 0;
    for (int num : nums) {
      mask ^= num;
    }

    return Integer.bitCount(mask ^ k);
  }
}