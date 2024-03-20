import java.util.*;
import java.io.*;




public class Solution7 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> d = new HashMap<>();
        for (char c : s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }
        
        Map<Character, Integer> dSorted = new HashMap<>();
        d.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .forEachOrdered(x -> dSorted.put(x.getKey(), x.getValue()));
        
        int highest = dSorted.values().stream().findFirst().orElse(0);
        Map<Character, Integer> ansMap = new HashMap<>();
        
        for (Map.Entry<Character, Integer> entry : dSorted.entrySet()) {
            if (entry.getValue() == highest) {
                ansMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }
        
        StringBuilder ans = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (ansMap.containsKey(c)) {
                if (ansMap.get(c) == 1) {
                    ans.append(c);
                }
                ansMap.put(c, ansMap.get(c) - 1);
            }
        }
        
        return ans.toString();
    }
    
    public static void main(String[] args) {
        Solution7 sol = new Solution7();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        scanner.close();
        System.exit(0);
    }
}