import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution14 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int highest = list.get(0).getValue();
        Map<Character, Integer> d = new HashMap<>();
        StringBuilder ans = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : list) {
            if (entry.getValue() == highest) {
                d.put(entry.getKey(), entry.getValue());
            } else {
                break;
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
        Solution14 sol = new Solution14();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
