import java.util.*;
import java.io.*;
import java.util.stream.*;






public class Solution20 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> d = new HashMap<>();
        for (char c : s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }
        
        // Sorting the map by value in descending order
        d.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEachOrdered(e -> {
                    d.put(e.getKey(), e.getValue());
                });

        int highest = d.entrySet().iterator().next().getValue();
        Map<Character, Integer> result = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        
        for (Map.Entry<Character, Integer> entry : d.entrySet()) {
            char key = entry.getKey();
            int val = entry.getValue();
            
            if (val == highest) {
                result.put(key, val);
            } else {
                break;
            }
        }

        for (char i : s.toCharArray()) {
            if (result.containsKey(i)) {
                if (result.get(i) == 1) {
                    ans.append(i);
                }
                result.put(i, result.get(i) - 1);
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        Solution20 sol = new Solution20();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        scanner.close();
        System.exit(0);
    }
}
