import java.util.*;

class Solution {
  public List<Integer> beautifulIndices(String s, String a, String b, int k) {
    // shift of pattern b
    TreeSet<Integer> shifts = new TreeSet<>(build(s, b));

    List<Integer> result = new ArrayList<>();
    for (int i : build(s, a)) {
      // check existence of j among [i - k, i + k + 1)
      if (!shifts.subSet(i - k, i + k + 1).isEmpty()) {
        result.add(i);
      }
    }

    return result;
  }

  private List<Integer> build(String text, String pattern) {
    List<Integer> shift = new ArrayList<>();

    final int m = text.length();
    final int n = pattern.length();
    for (int i = 0; i <= m - n; i++) {
      boolean match = true;
      for (int j = 0; j < n; j++) {
        if (pattern.charAt(j) != text.charAt(i + j)) {
          match = false;
          break;
        }
      }

      if (match) {
        shift.add(i);
      }
    }

    return shift;
  }
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine(); // Reads the entire input line

      // Splitting the input string by spaces
      String[] parts = input.split(" ");

      // Extracting s, a, b, and k from the input parts
      // s will be the first part, a the second, and b the third, k is the last integer
      String s = parts[0];
      String a = parts[1];
      String b = input.substring(s.length() + a.length() + 2, input.lastIndexOf(" "));
      int k = Integer.parseInt(parts[parts.length - 1]);

      // Creating an instance of Solution and calling the beautifulIndices method
      Solution solution = new Solution();
      List<Integer> beautifulIndices = solution.beautifulIndices(s, a, b, k);

      // Outputting the beautiful indices as an array
      System.out.println(beautifulIndices);
  }
}