import java.util.*;
import java.io.*;
class Solution19 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> d = new HashMap<>();
        for (char c : s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }
        
        StringBuilder ans = new StringBuilder();
        int highest = 0;
        for (int val : d.values()) {
            highest = Math.max(highest, val);
        }
        
        for (Map.Entry<Character, Integer> entry : d.entrySet()) {
            char key = entry.getKey();
            int val = entry.getValue();
            if (val == highest) {
                d.put(key, val);
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (d.containsKey(c)) {
                if (d.get(c) == 1) {
                    ans.append(c);
                }
                d.put(c, d.get(c) - 1);
            }
        }

        return ans.toString();
    }
}