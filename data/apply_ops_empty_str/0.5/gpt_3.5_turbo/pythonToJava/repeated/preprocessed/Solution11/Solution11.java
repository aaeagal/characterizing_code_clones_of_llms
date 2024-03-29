import java.util.*;
import java.io.*;
import java.util.stream.*;


class Solution11 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> d = new HashMap<>();
        for (char c : s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> dList = new ArrayList<>(d.entrySet());
        dList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int highest = dList.get(0).getValue();
        Map<Character, Integer> highestFreqChars = new HashMap<>();
        String ans = "";

        for (Map.Entry<Character, Integer> entry : dList) {
            if (entry.getValue() == highest) {
                highestFreqChars.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (highestFreqChars.containsKey(c)) {
                if (highestFreqChars.get(c) == 1) {
                    ans += c;
                }
                highestFreqChars.put(c, highestFreqChars.get(c) - 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution11 sol = new Solution11();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}