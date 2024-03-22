import java.util.*;
import java.io.*;
import java.util.stream.*;


class Solution6 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(countMap.entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        int highest = list.get(0).getValue();
        Map<Character, Integer> highestCountMap = new HashMap<>();
        String ans = "";

        for (Map.Entry<Character, Integer> entry : list) {
            if (entry.getValue() == highest) {
                highestCountMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (highestCountMap.containsKey(c)) {
                if (highestCountMap.get(c) == 1) {
                    ans += c;
                }
                highestCountMap.put(c, highestCountMap.get(c) - 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution6 sol = new Solution6();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
