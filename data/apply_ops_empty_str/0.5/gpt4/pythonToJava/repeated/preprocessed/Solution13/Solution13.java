import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution13 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> d = new HashMap<>();
        for(char c : s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> dList = new ArrayList<>(d.entrySet());
        dList.sort((x, y) -> y.getValue().compareTo(x.getValue()));

        int highest = dList.get(0).getValue();
        d = new HashMap<>();
        String ans = "";

        for(Map.Entry<Character, Integer> entry : dList) {
            if(entry.getValue() == highest) {
                d.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for(char i : s.toCharArray()) {
            if(d.containsKey(i)) {
                if(d.get(i) == 1) {
                    ans += i;
                }
                d.put(i, d.get(i) - 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution13 sol = new Solution13();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
