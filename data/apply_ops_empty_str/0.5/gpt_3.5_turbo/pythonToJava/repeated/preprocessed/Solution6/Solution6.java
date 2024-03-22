import java.util.*;
import java.io.*;
import java.util.stream.*;



class Solution6 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> d = new HashMap<>();
        for (char c : s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }
        
        List<Map.Entry<Character, Integer>> d_list = new ArrayList<>(d.entrySet());
        d_list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        int highest = d_list.get(0).getValue();
        Map<Character, Integer> dMap = new HashMap<>();
        String ans = "";
        
        for (Map.Entry<Character, Integer> entry : d_list) {
            if (entry.getValue() == highest) {
                dMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }
        
        for (char c : s.toCharArray()) {
            if (dMap.containsKey(c)) {
                if (dMap.get(c) == 1) {
                    ans += c;
                }
                dMap.put(c, dMap.get(c) - 1);
            }
        }
        
        return ans;
    }
}

