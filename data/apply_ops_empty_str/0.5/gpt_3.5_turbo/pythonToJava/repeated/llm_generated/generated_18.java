import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> d = new HashMap<>();
        for (char c : s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> dList = new ArrayList<>(d.entrySet());
        dList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int highest = dList.get(0).getValue();
        Map<Character, Integer> dMap = new HashMap<>();
        String ans = "";

        for (Map.Entry<Character, Integer> entry : dList) {
            char key = entry.getKey();
            int val = entry.getValue();
            if (val == highest) {
                dMap.put(key, val);
            } else {
                break;
            }
        }

        for (char i : s.toCharArray()) {
            if (dMap.containsKey(i)) {
                if (dMap.get(i) == 1) {
                    ans += i;
                }
                dMap.put(i, dMap.get(i) - 1);
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