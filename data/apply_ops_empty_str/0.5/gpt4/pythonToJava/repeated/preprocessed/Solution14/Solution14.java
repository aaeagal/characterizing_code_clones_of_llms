import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution14 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(countMap.entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        int highest = list.get(0).getValue();
        Map<Character, Integer> highestMap = new HashMap<>();
        String ans = "";

        for (Map.Entry<Character, Integer> entry : list) {
            if (entry.getValue() == highest) {
                highestMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (highestMap.containsKey(c)) {
                if (highestMap.get(c) == 1) {
                    ans += c;
                }
                highestMap.put(c, highestMap.get(c) - 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution14 sol = new Solution14();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        scanner.close();
        System.exit(0);
    }
}
