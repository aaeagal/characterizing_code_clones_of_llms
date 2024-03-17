import java.util.*;

class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> d = new HashMap<>();
        for (char c : s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }
        
        List<Map.Entry<Character, Integer>> dList = new ArrayList<>(d.entrySet());
        dList.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        int highest = dList.get(0).getValue();
        Map<Character, Integer> ansMap = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        
        for (Map.Entry<Character, Integer> entry : dList) {
            char key = entry.getKey();
            int val = entry.getValue();
            if (val == highest) {
                ansMap.put(key, val);
            } else {
                break;
            }
        }
        
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
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}