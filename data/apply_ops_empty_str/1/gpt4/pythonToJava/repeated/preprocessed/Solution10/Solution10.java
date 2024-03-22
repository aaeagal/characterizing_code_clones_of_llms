import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution10 {

    public static String lastNonEmptyString(String s) {

        Map<Character, Integer> m = new HashMap<>();  

        for (Character c: s.toCharArray()) { 
            m.put(c, m.getOrDefault(c, 0) + 1);
        }
        
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(m.entrySet());
        list.sort(Map.Entry.comparingByValue(Collections.reverseOrder()));        
        int highest = list.get(0).getValue();
        
        m = new HashMap<>();

        String ans = "";

        for (Map.Entry<Character, Integer> entry : list) {
            if (entry.getValue() == highest) {
                m.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }


        for (char c : s.toCharArray()) {
            if (m.containsKey(c)) {
                if (m.get(c) == 1)
                    ans += c;
                m.put(c, m.get(c) - 1);
            }
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(lastNonEmptyString(s));
    }
}
