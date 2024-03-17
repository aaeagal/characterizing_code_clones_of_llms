import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public String lastNonEmptyString(String s) {
        Map<Character, Integer> counter = new HashMap<>();
        for (char c : s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        // Sorting the counter by value in descending order
        counter.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(e -> counter.put(e.getKey(), e.getValue()));

        int highest = counter.values().iterator().next();
        Map<Character, Integer> d = new HashMap<>();
        String ans = "";

        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            if (entry.getValue() == highest) {
                d.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (d.containsKey(c)) {
                if (d.get(c) == 1) {
                    ans += c;
                }
                d.put(c, d.get(c) - 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}