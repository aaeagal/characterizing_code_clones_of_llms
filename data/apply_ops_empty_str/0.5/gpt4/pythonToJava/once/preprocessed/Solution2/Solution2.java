import java.util.*;
import java.io.*;
class Solution2 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> sortedList = new ArrayList<>(countMap.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int highestCount = sortedList.get(0).getValue();
        Map<Character, Integer> highestCountMap = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : sortedList) {
            if (entry.getValue() == highestCount) {
                highestCountMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (highestCountMap.containsKey(c)) {
                if (highestCountMap.get(c) == 1) {
                    result.append(c);
                }
                highestCountMap.put(c, highestCountMap.get(c) - 1);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
