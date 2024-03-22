import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution1 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int highest = list.get(0).getValue();
        Map<Character, Integer> d = new HashMap<>();
        String ans = "";

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
                    ans += c;
                }
                d.put(c, d.get(c) - 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
