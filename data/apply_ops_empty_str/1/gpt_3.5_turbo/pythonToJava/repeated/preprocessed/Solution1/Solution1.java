import java.util.*;
import java.io.*;



class Solution1 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> d = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            d.put(c, d.getOrDefault(c, 0) + 1);
        }
        
        List<Map.Entry<Character, Integer>> d_list = new ArrayList<>(d.entrySet());
        Collections.sort(d_list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        
        int highest = d_list.get(0).getValue();
        Map<Character, Integer> d = new HashMap<>();
        String ans = "";
        
        for(Map.Entry<Character, Integer> entry : d_list) {
            char key = entry.getKey();
            int val = entry.getValue();
            if(val == highest) {
                d.put(key, val);
            } else {
                break;
            }
        }
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(d.containsKey(c)) {
                if(d.get(c) == 1) {
                    ans += c;
                }
                d.put(c, d.get(c) - 1);
            }
        }
        
        return ans;
    }
}

