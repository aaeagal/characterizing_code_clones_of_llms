import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Solution4 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> sortedEntries = new ArrayList<>(charCount.entrySet());
        sortedEntries.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int maxCount = sortedEntries.get(0).getValue();
        Map<Character, Integer> maxCountMap = new HashMap<>();
        StringBuilder finalString = new StringBuilder();

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
                    finalString.append(c);
                }
                maxCountMap.put(c, maxCountMap.get(c) - 1);
            }
        }

        return finalString.toString();
    }

    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
