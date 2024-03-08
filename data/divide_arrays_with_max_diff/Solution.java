import java.util.*;

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
  // Write a main method that takes in this structure of input: [50276, -419622812, 158, 53725, 1561427702, -44473] -206
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split("]\\s");

            // Extracting the array of numbers from the first part and removing any leading or trailing spaces
            String[] numsStr = parts[0].substring(1).split(",\\s*");
            
            // Converting the array of strings to an array of integers
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            // Extracting the integer k from the second part
            int k = Integer.parseInt(parts[1].trim());
            
            // Calling the divideArray method and printing the result
            Solution sol = new Solution();
            int[][] result = sol.divideArray(nums, k);
            for (int i = 0; i < result.length; i++) {
                System.out.println(Arrays.toString(result[i]));
            }

          }
          scanner.close();
    }
}