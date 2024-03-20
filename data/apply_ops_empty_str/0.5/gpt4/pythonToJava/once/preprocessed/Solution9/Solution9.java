import java.util.*;
import java.io.*;
class Solution9 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> sortedList = new ArrayList<>(frequencyMap.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int maxFrequency = sortedList.get(0).getValue();
        Map<Character, Integer> maxFrequencyMap = new HashMap<>();
        StringBuilder resultString = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : sortedList) {
            if (entry.getValue() == maxFrequency) {
                maxFrequencyMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (maxFrequencyMap.containsKey(c)) {
                if (maxFrequencyMap.get(c) == 1) {
                    resultString.append(c);
                }
                maxFrequencyMap.put(c, maxFrequencyMap.get(c) - 1);
            }
        }

        return resultString.toString();
    }

    public static void main(String[] args) {
        Solution9 sol = new Solution9();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
