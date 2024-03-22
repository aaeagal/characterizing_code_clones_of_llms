import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution18 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> counter = new HashMap<>();
        for (char c : s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(counter.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        
        int highest = list.get(0).getValue();
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        
        for (Map.Entry<Character, Integer> entry : list) {
            if (entry.getValue() == highest) {
                map.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }
        
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (map.get(c) == 1) {
                    ans.append(c);
                }
                map.put(c, map.get(c) - 1);
            }
        }
        
        return ans.toString();
    }
    
    public static void main(String[] args) {
        Solution18 sol = new Solution18();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        scanner.close();
        System.exit(0);
    }
}
