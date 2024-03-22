import java.util.*;
import java.io.*;
import java.util.stream.*;


class Solution7 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> d = new HashMap<>();
        
        for(char c : s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }
        
        List<Map.Entry<Character, Integer>> d_list = new ArrayList<>(d.entrySet());
        Collections.sort(d_list, (a, b) -> b.getValue().compareTo(a.getValue()));
        
        int highest = d_list.get(0).getValue();
        Map<Character, Integer> newD = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        
        for (Map.Entry<Character, Integer> entry : d_list) {
            if (entry.getValue() == highest) {
                newD.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }
        
        for (char i : s.toCharArray()) {
            if(newD.containsKey(i)) {
                if (newD.get(i) == 1) {
                    ans.append(i);
                }
                newD.put(i, newD.get(i) - 1);
            }
        }
        
        return ans.toString();
    }
  
    public static void main(String[] args) {
        Solution7 sol = new Solution7();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
