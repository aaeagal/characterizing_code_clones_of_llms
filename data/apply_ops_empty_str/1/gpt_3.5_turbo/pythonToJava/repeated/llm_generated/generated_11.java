```java
import java.util.*;

class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> d = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }
        
        List<Map.Entry<Character, Integer>> d_list = new ArrayList<>(d.entrySet());
        d_list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        int highest = d_list.get(0).getValue();
        Map<Character, Integer> ans = new HashMap<>();
        
        for (Map.Entry<Character, Integer> entry : d_list) {
            char key = entry.getKey();
            int val = entry.getValue();
            if (val == highest) {
                ans.put(key, val);
            } else {
                break;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (ans.containsKey(c)) {
                if (ans.get(c) == 1) {
                    sb.append(c);
                }
                ans.put(c, ans.get(c) - 1);
            }
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        
        scanner.close();
    }
}
```