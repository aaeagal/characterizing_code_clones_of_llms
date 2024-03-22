import java.util.*;
import java.io.*;
import java.util.stream.*;


class Solution5 {
    public String lastNonEmptyString(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> d_list = new ArrayList<>(map.entrySet());
        d_list.sort((a, b) -> b.getValue() - a.getValue());

        int highest = d_list.get(0).getValue();
        map.clear();

        for (Map.Entry<Character, Integer> entry : d_list) {
            if (entry.getValue().equals(highest)) {
                map.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        StringBuilder ans = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (map.get(c) == 1) {
                    ans.append(c);
                }
                map.put(c, map.get(c) - 1);
            }
        }
        return ans.toString();
    }
        
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        sc.close();
    }
}
