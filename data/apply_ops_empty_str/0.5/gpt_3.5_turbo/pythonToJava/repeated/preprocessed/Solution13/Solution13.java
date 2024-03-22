import java.util.*;
import java.io.*;
import java.util.stream.*;




public class Solution13 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> d = new HashMap<>();
        for (char c : s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }

        StringBuilder ans = new StringBuilder();
        int highest = 0;
        for (int val : d.values()) {
            highest = Math.max(highest, val);
        }

        for (Map.Entry<Character, Integer> entry : d.entrySet()) {
            if (entry.getValue() == highest) {
                ans.append(entry.getKey());
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        Solution13 sol = new Solution13();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        scanner.close();
    }
}