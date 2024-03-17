Here is the semantic equivalent code in Java:

```java
import java.io.*;
import java.util.*;

public class Solution {
    
    public String lastNonEmptyString(String s) {

        Map<Character, Integer> d = new HashMap<>();
        
        for(char c: s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> dList = new ArrayList<>(d.entrySet());
        
        dList.sort((e1, e2) -> e2.getValue() - e1.getValue());
        int highest = dList.get(0).getValue();
        
        Map<Character, Integer> dFiltered = new HashMap<>();
        String ans = "";
        
        for(Map.Entry<Character, Integer> entry: dList) {
            if(entry.getValue() == highest) {
                dFiltered.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for(char c : s.toCharArray()) {
            if(dFiltered.containsKey(c)) {
                if(dFiltered.get(c) == 1) {
                    ans += c;
                }
                dFiltered.put(c, dFiltered.get(c) - 1);
            }
        }
        
        return ans;
    }

    public static void main(String[] args) throws IOException {
        Solution sol = new Solution();
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        
        System.exit(0);
    }
}
```