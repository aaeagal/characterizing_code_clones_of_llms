import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> d = new HashMap<>();
        for (char c : s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }

        StringBuilder ans = new StringBuilder();
        int highest = 0;
        for (int count : d.values()) {
            if (count > highest) {
                highest = count;
            }
        }

        for (char c : s.toCharArray()) {
            if (d.containsKey(c)) {
                if (d.get(c) == 1) {
                    ans.append(c);
                }
                d.put(c, d.get(c) - 1);
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}