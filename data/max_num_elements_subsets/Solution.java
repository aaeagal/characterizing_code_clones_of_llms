import java.util.*;
class Solution {
  public int maximumLength(int[] nums) {
    int max = 0;
    // [number, count]
    TreeMap<Integer, Integer> count = new TreeMap<>();
    for (int num : nums) {
      max = Math.max(max, num);
      count.merge(num, 1, Integer::sum);
    }

    int result = 1;
    // iterator returns the entries in ascending key order
    for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
      int key = entry.getKey();
      int value = entry.getValue();

      // the first must larger or equal than 2
      if (value < 2) {
        continue;
      }

      // fast fail
      if ((long) key * key > max) {
        break;
      }

      // [1,1,1,...,1,1] always follows the pattern
      if (key == 1) {
        // pay attention to odd number of 1
        if (value % 2 == 0) {
          result = Math.max(result, value - 1);
        } else {
          result = Math.max(result, value);
        }
        continue;
      }

      // check all pattern number
      for (int i = 0; true; i++) {
        key *= key;
        int m = count.getOrDefault(key, 0);
        // stop on m < 2
        if (m == 1) {
          result = Math.max(result, (i + 1) * 2 + 1);
          break;
        }

        if (m == 0) {
          result = Math.max(result, (i + 1) * 2 - 1);
          break;
        }
      }
    }

    return result;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine(); // Reads the entire input line

    // Removing the brackets and parsing the array part
    String[] numsAsString = input.substring(1, input.length() - 1).split(",");
    int[] nums = new int[numsAsString.length];
    for (int i = 0; i < nums.length; i++) {
        nums[i] = Integer.parseInt(numsAsString[i].trim());
    }

    Solution solution = new Solution();
    int result = solution.maximumLength(nums);

    // Output the result
    System.out.println(result);
}
}