import java.util.*;

class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> d = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (d.containsKey(c)) {
                d.put(c, d.get(c) + 1);
            } else {
                d.put(c, 1);
            }
        }
        
        List<Map.Entry<Character, Integer>> dList = new ArrayList<>(d.entrySet());
        dList.sort((a, b) -> b.getValue() - a.getValue());
        
        int highest = dList.get(0).getValue();
        Map<Character, Integer> ans = new HashMap<>();
        
        for (Map.Entry<Character, Integer> entry : dList) {
            if (entry.getValue() == highest) {
                ans.put(entry.getKey(), entry.getValue());
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