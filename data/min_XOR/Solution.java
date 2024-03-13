import java.util.*;
class Solution {
  public int minOperations(int[] nums, int k) {
    int mask = 0;
    for (int num : nums) {
      mask ^= num;
    }

    return Integer.bitCount(mask ^ k);
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
        long result = solution.minOperations(nums, k);
        
        // Output the result
        System.out.println(result);
    }
}