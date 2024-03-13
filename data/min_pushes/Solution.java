import java.util.*;
class Solution {
  public int minimumPushes(String word) {
    int[] count = new int[26];
    for (char c : word.toCharArray()) {
      count[c - 'a']++;
    }

    int push = 0;
    Arrays.sort(count);
    for (int i = 0; i < 26; i++) {
      push += count[25 - i] * (i / 8 + 1);
    }

    return push;
  }
      public static void main(String[] args) {
        Solution sol = new Solution();
        // read string from stdin
        Scanner scanner = new Scanner(System.in);
        // read only one line from stdin
        String s = scanner.nextLine();
        // call the function and print the result
        System.out.println(sol.minimumPushes(s));
        scanner.close();
        // end the program
        System.exit(0);
    }
}