import java.util.*;
import java.io.*;
class Solution3 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> frequencyList = new ArrayList<>(frequencyMap.entrySet());
        frequencyList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int highestFrequency = frequencyList.get(0).getValue();
        Map<Character, Integer> highestFrequencyMap = new HashMap<>();
        StringBuilder resultString = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : frequencyList) {
            if (entry.getValue() == highestFrequency) {
                highestFrequencyMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (highestFrequencyMap.containsKey(c)) {
                if (highestFrequencyMap.get(c) == 1) {
                    resultString.append(c);
                }
                highestFrequencyMap.put(c, highestFrequencyMap.get(c) - 1);
            }
        }

        return resultString.toString();
    }

    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
