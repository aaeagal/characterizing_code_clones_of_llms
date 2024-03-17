```java
import java.util.*;
import java.io.*;

public class Solution {
    
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> d = new HashMap<>();
        for (char c : s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> dList = new ArrayList<>(d.entrySet());
        dList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int highest = dList.get(0).getValue();
        Map<Character, Integer> highestValues = new HashMap<>();
        String ans = "";

        for (Map.Entry<Character, Integer> entry : dList) {
            if (entry.getValue() == highest) {
                highestValues.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (highestValues.containsKey(c)) {
                if (highestValues.get(c) == 1) {
                    ans += c;
                }
                highestValues.put(c, highestValues.get(c) - 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        Solution sol = new Solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```