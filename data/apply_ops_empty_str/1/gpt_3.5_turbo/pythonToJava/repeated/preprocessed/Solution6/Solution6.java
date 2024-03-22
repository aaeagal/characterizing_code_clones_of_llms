import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution6 {
    public String lastNonEmptyString(String s) {
        
        Map<Character, Integer> d = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }
        
        List<Map.Entry<Character, Integer>> dList = new ArrayList<>(d.entrySet());
        Collections.sort(dList, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        
        int highest = dList.get(0).getValue();
        Map<Character, Integer> dFiltered = new HashMap<>();
        String ans = "";
        
        for (Map.Entry<Character, Integer> entry : dList) {
            char key = entry.getKey();
            int val = entry.getValue();
            
            if (val == highest) {
                dFiltered.put(key, val);
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (dFiltered.containsKey(c)) {
                if (dFiltered.get(c) == 1) {
                    ans += c;
                }
                dFiltered.put(c, dFiltered.get(c) - 1);
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution6 sol = new Solution6();
        
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        
        scanner.close();
    }
}