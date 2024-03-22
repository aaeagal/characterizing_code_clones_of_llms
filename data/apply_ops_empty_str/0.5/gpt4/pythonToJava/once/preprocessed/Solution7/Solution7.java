import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Solution7 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> sortedList = new ArrayList<>(charMap.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int maxCount = sortedList.get(0).getValue();
        Map<Character, Integer> maxCountMap = new HashMap<>();
        StringBuilder resultStr = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : sortedList) {
            if (entry.getValue() == maxCount) {
                maxCountMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (maxCountMap.containsKey(c)) {
                if (maxCountMap.get(c) == 1) {
                    resultStr.append(c);
                }
                maxCountMap.put(c, maxCountMap.get(c) - 1);
            }
        }

        return resultStr.toString();
    }

    public static void main(String[] args) {
        Solution7 sol = new Solution7();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
