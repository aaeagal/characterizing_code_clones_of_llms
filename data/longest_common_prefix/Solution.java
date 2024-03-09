import java.util.*;
class Solution {
  public int longestCommonPrefix(int[] arr1, int[] arr2) {
    List<String> one = new ArrayList<>();
    for (int num : arr1) {
      one.add(Integer.toString(num));
    }

    List<String> two = new ArrayList<>();
    for (int num : arr2) {
      two.add(Integer.toString(num));
    }

    return dfs(one, two, 0);
  }

  private int dfs(List<String> one, List<String> two, int depth) {
    Map<Integer, List<String>> m1 = split(one);
    Map<Integer, List<String>> m2 = split(two);

    int max = depth;
    for (int key : m1.keySet()) {
      if (m2.containsKey(key)) {
        max = Math.max(max, dfs(m1.get(key), m2.get(key), depth + 1));
      }
    }

    return max;
  }

  private Map<Integer, List<String>> split(List<String> one) {
    Map<Integer, List<String>> m = new HashMap<>();
    for (String s : one) {
      if (!s.isEmpty()) {
        int d = s.charAt(0) - '0';
        m.putIfAbsent(d, new ArrayList<>());
        m.get(d).add(s.substring(1));
      }
    }

    return m;
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
      int result = solution.longestCommonPrefix(arr1, arr2);

      // Output the result
      System.out.println(result);
  }
}