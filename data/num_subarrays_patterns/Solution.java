import java.util.*;
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
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine(); // Reads the entire line of input

      // Split the input string into two parts
      String[] parts = input.split("] \\[");
      parts[0] = parts[0].substring(1); // Remove leading '[' from the first part
      parts[1] = parts[1].substring(0, parts[1].length() - 1); // Remove trailing ']' from the second part

      // Parse each part into an array of integers
      int[] arr1 = Arrays.stream(parts[0].split(",")).mapToInt(Integer::parseInt).toArray();
      int[] arr2 = Arrays.stream(parts[1].split(",")).mapToInt(Integer::parseInt).toArray();

      Solution solution = new Solution();
      int result = solution.countMatchingSubarrays(arr1, arr2);

      // Output the result
      System.out.println(result);
  }

}