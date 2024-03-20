import java.util.*;
import java.io.*;
class Solution11 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> charFreq = new HashMap<>();
        for (char c : s.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> sortedEntries = new ArrayList<>(charFreq.entrySet());
        sortedEntries.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int maxFreq = sortedEntries.get(0).getValue();
        Map<Character, Integer> maxFreqMap = new HashMap<>();
        StringBuilder resultStr = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : sortedEntries) {
            if (entry.getValue() == maxFreq) {
                maxFreqMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (maxFreqMap.containsKey(c)) {
                if (maxFreqMap.get(c) == 1) {
                    resultStr.append(c);
                }
                maxFreqMap.put(c, maxFreqMap.get(c) - 1);
            }
        }

        return resultStr.toString();
    }

    public static void main(String[] args) {
        Solution11 sol = new Solution11();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
