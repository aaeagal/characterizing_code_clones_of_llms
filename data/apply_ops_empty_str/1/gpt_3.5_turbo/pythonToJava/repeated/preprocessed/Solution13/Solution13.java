import java.util.*;
import java.io.*;




class Solution13 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> d = new HashMap<>();
        for(char c : s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }
        
        List<Map.Entry<Character, Integer>> d_list = new ArrayList<>(d.entrySet());
        Collections.sort(d_list, (a, b) -> b.getValue().compareTo(a.getValue()));
        
        int highest = d_list.get(0).getValue();
        Map<Character, Integer> dNew = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        
        for(Map.Entry<Character, Integer> entry : d_list) {
            char key = entry.getKey();
            int val = entry.getValue();
            if(val == highest) {
                dNew.put(key, val);
            } else {
                break;
            }
        }
        
        for(char i : s.toCharArray()) {
            if(dNew.containsKey(i)) {
                if(dNew.get(i) == 1) {
                    ans.append(i);
                }
                dNew.put(i, dNew.get(i) - 1);
            }
        }
        
        return ans.toString();
    }
}

