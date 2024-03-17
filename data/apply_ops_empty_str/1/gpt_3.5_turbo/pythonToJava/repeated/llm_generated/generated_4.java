import java.util.*;
import java.io.*;

class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> d = new HashMap<>();
        for (char c : s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }
        
        List<Map.Entry<Character, Integer>> dList = new ArrayList<>(d.entrySet());
        dList.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        int highest = dList.get(0).getValue();
        Map<Character, Integer> dNew = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        
        for (Map.Entry<Character, Integer> entry : dList) {
            if (entry.getValue() == highest) {
                dNew.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (dNew.containsKey(c)) {
                if (dNew.get(c) == 1) {
                    ans.append(c);
                }
                dNew.put(c, dNew.get(c) - 1);
            }
        }
        
        return ans.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // read only one line
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        // end the program
        System.exit(0);
    }
}