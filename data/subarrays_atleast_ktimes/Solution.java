import java.util.*;
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // Reads the entire input line
        
        // Split the input into two parts: the array and the integer k
        String[] parts = input.split(" ");
        String arrayPart = parts[0];
        int k = Integer.parseInt(parts[1]);
        
        // Remove the brackets and parse the array part
        String[] numsAsString = arrayPart.substring(1, arrayPart.length() - 1).split(",");
        int[] nums = new int[numsAsString.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(numsAsString[i].trim());
        }
        
        Solution solution = new Solution();
        long result = solution.countSubarrays(nums, k);
        
        // Output the result
        System.out.println(result);
    }
}