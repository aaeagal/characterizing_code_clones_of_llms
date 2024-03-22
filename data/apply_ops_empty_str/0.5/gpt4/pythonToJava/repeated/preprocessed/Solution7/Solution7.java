import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution7 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> d = new HashMap<>();
        for (char c : s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> dList = new ArrayList<>(d.entrySet());
        dList.sort((x, y) -> y.getValue() - x.getValue());

        int highest = dList.get(0).getValue();
        Map<Character, Integer> newD = new HashMap<>();
        String ans = "";

        for (Map.Entry<Character, Integer> entry : dList) {
            if (entry.getValue() == highest) {
                newD.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char i : s.toCharArray()) {
            if (newD.containsKey(i)) {
                if (newD.get(i) == 1) {
                    ans += i;
                }
                newD.put(i, newD.get(i) - 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution7 sol = new Solution7();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
