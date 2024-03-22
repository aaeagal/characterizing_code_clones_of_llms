import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution10 {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> d = new HashMap<>();
        for (char c : s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }
        
        List<Map.Entry<Character, Integer>> dList = new ArrayList<>(d.entrySet());
        dList.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        int highest = dList.get(0).getValue();
        Map<Character, Integer> dMap = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        
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
                    ans.append(i);
                }
                dMap.put(i, dMap.get(i) - 1);
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        Solution10 sol = new Solution10();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        scanner.close();
        System.exit(0);
    }
}
