import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        
        List<Map.Entry<Character, Integer>> sortedList = new ArrayList<>(countMap.entrySet());
        sortedList.sort((a, b) -> b.getValue() - a.getValue());
        
        int highestFrequency = sortedList.get(0).getValue();
        Map<Character, Integer> highestFreqChars = new HashMap<>();
        
        for (Map.Entry<Character, Integer> entry : sortedList) {
            if (entry.getValue() == highestFrequency) {
                highestFreqChars.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (highestFreqChars.containsKey(c)) {
                if (highestFreqChars.get(c) == 1) {
                    result.append(c);
                }
                highestFreqChars.put(c, highestFreqChars.get(c) - 1);
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}