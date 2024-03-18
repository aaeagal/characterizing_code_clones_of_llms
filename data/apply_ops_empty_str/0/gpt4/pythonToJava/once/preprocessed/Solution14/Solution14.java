import java.util.*;
import java.io.*;
class Solution1414 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        int highest = list.get(0).getValue();
        map = new HashMap<>();
        StringBuilder ans = new StringBuilder();
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
                    ans.append(c);
                }
                map.put(c, map.get(c) - 1);
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Solution1414 sol = new Solution1414();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
    }
}





public 