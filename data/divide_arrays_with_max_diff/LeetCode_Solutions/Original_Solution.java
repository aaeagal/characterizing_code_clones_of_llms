class Solution {
  public int[][] divideArray(int[] nums, int k) {
    final int n = nums.length;
    Arrays.sort(nums);
    int[][] result = new int[n / 3][3];
    for (int i = 0; i < n; i++) {
      result[i / 3][i % 3] = nums[i];
      if (i % 3 == 2) {
        if (result[i / 3][2] - result[i / 3][0] > k) {
          return new int[][] {};
        }
      }
    }

    return result;
  }
}