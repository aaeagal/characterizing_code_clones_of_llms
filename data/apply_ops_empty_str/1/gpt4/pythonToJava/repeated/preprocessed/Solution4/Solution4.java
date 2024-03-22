import java.util.*;
import java.io.*;
import java.util.stream.*;
class Solution4 {
    public String lastNonEmptyString(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, (i1, i2) -> i2.getValue().compareTo(i1.getValue()));
        
        int highest = list.get(0).getValue();
        map = new HashMap<>();
        String ans = "";
        
        for(Map.Entry<Character, Integer> entry : list) {
            if(entry.getValue() == highest) {
                map.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }
        
        for(char c : s.toCharArray()) {
            if(map.containsKey(c)) {
                if(map.get(c) == 1) {
                    ans += c;
                }
                map.put(c, map.get(c) - 1);
            }
        }
        
        return ans;
    }
}
