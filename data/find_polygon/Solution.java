import java.util.*;
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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // Reads the entire input line

        // Remove the brackets '[' and ']' from the input string
        input = input.substring(1, input.length() - 1);

        // Split the input string by comma
        String[] numberStrings = input.split(",");

        // Convert the string array to an array of integers
        int[] nums = new int[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++) {
            nums[i] = Integer.parseInt(numberStrings[i].trim()); // trim in case of spaces
        }

        // Create an instance of Solution and call the largestPerimeter method
        Solution solution = new Solution();
        long perimeter = solution.largestPerimeter(nums);

        // Output the result
        System.out.println(perimeter);
    }
}