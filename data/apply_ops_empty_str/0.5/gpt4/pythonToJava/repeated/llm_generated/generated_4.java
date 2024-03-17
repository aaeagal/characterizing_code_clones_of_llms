Here is a Java semantic code clone of the given Python code:

```java
import java.util.*;

class Solution {
    String lastNonEmptyString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        int highest = list.get(0).getValue();
        map = new HashMap<>();
        StringBuilder ans = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : list) {
            if (entry.getValue() == highest) {
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
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```

This Java code does essentially the same thing as the given Python code. It creates a frequency map of the characters in the input string, sorts the map entries in descending order by frequency, then constructs a new map containing only the entries with the highest frequency. It then iterates over the input string again, appending each character to the result string if it's in the new map and decrementing its count in the map. The result string is returned at the end.