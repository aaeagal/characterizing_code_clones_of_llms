Below is the Java semantic code clone of the provided Python code:

```java
import java.util.*;

class Solution {
    String lastNonEmptyString(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        int highest = list.get(0).getValue();
        map = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        
        for (Map.Entry<Character, Integer> entry : list) {
            if ((int)entry.getValue() == highest) {
                map.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (map.get(c) == 1) {
                    ans.append(c);
                }
                map.put(c, map.get(c) - 1);
            }
        }

        return ans.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // read only one line
        Scanner in = new Scanner(System.in);
        String s = in.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        // end the program
        System.exit(0);
    }
}
```

This Java program achieves the same functionality as the Python program you provided. The method `lastNonEmptyString` in the `Solution` class emulates the behavior of `lastNonEmptyString` method in the Python code. It counts the occurrences of each character in a string, keeps those characters that have the most occurrences, and returns a string that concatenates all the remaining characters from the most common to the least common.