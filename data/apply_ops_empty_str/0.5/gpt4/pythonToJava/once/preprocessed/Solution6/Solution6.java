import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Solution6 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> charCounter = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCounter.put(c, charCounter.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> sortedEntries = new ArrayList<>(charCounter.entrySet());
        sortedEntries.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int maxCount = sortedEntries.get(0).getValue();
        Map<Character, Integer> maxCountMap = new HashMap<>();
        StringBuilder resultString = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : sortedEntries) {
            if (entry.getValue() == maxCount) {
                maxCountMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (maxCountMap.containsKey(c)) {
                if (maxCountMap.get(c) == 1) {
                    resultString.append(c);
                }
                maxCountMap.put(c, maxCountMap.get(c) - 1);
            }
        }

        return resultString.toString();
    }

    public static void main(String[] args) {
        Solution6 sol = new Solution6();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
