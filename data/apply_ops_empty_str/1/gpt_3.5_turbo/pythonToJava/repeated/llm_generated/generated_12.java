import java.util.*;

class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> d = new HashMap<>();
        for(char c : s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> d_list = new ArrayList<>(d.entrySet());
        d_list.sort(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()));

        int highest = d_list.get(0).getValue();
        Map<Character, Integer> d = new HashMap<>();
        String ans = "";

        for (Map.Entry<Character, Integer> entry : d_list) {
            char key = entry.getKey();
            int val = entry.getValue();
            if (val == highest) {
                d.put(key, val);
            } else {
                break;
            }
        }

        for (char i : s.toCharArray()) {
            if (d.containsKey(i)) {
                if (d.get(i) == 1) {
                    ans += i;
                }
                d.put(i, d.get(i) - 1);
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}