class Solution {
public long largestPerimeter(int[] nums) {
final int n = nums.length;
Arrays.sort(nums);
long result = -1;
long prefix = nums[0] + nums[1];
for (int i = 2; i < n; i++) {
if (prefix > nums[i]) {
result = Math.max(result, prefix + nums[i]);
}
prefix += nums[i];
}
return result;
}
}