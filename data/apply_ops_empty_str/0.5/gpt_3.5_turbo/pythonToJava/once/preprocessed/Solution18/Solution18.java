import java.util.*;
import java.io.*;
class Solution18 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> d = new HashMap<>();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }
        // rest of the code remains the same
    }
}








