import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution3 {
    public String lastNonEmptyString(String s) {

        Map<Character, Integer> counts = new HashMap<>();
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        int highest = Collections.max(counts.values());
        Map<Character, Integer> d = new HashMap<>();

        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == highest) {
                d.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        StringBuilder ans = new StringBuilder();
        for (char i : s.toCharArray()) {
            if (d.containsKey(i)) {
                if (d.get(i) == 1) {
                    ans.append(i);
                }
                d.put(i, d.get(i) - 1);
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(solution.lastNonEmptyString(s));
        scanner.close();
    }
}
