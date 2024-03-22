import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution5 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int highest = list.get(0).getValue();
        map.clear();
        String ans = "";

        for (Map.Entry<Character, Integer> entry : list) {
            if (entry.getValue() == highest) {
                map.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (map.get(c) == 1) {
                    ans += c;
                }
                map.put(c, map.get(c) - 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution5 sol = new Solution5();

        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        
        scanner.close();
        System.exit(0);
    }
}
