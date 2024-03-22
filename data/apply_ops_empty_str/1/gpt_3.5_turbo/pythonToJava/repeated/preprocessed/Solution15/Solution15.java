import java.util.*;
import java.io.*;
import java.util.stream.*;
class Solution15 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> d = new HashMap<>();
        for (char c : s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }

        // Sorting the map
        String ans = "";
        int highest = 0;
        for (int val : d.values()) {
            highest = Math.max(highest, val);
        }

        for (Map.Entry<Character, Integer> entry : d.entrySet()) {
            if (entry.getValue() == highest) {
                ans += entry.getKey();
            } else {
                break;
            }
        }

        Map<Character, Integer> dCopy = new HashMap<>(d);
        for (char c : s.toCharArray()) {
            if (dCopy.containsKey(c)) {
                if (dCopy.get(c) == 1) {
                    ans += c;
                }
                dCopy.put(c, dCopy.get(c) - 1);
            }
        }

        return ans;
    }
}