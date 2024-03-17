Here is a Java equivalent of the given Python code:

```java
import java.util.*;

class Solution {
    public String lastNonEmptyString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int highest = list.get(0).getValue();
        HashMap<Character, Integer> highestMap = new HashMap<>();
        String ans = "";

        for (Map.Entry<Character, Integer> entry : list) {
            if (entry.getValue() == highest) {
                highestMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (highestMap.containsKey(c)) {
                if (highestMap.get(c) == 1) {
                    ans += c;
                }
                highestMap.put(c, highestMap.get(c) - 1);
            }
        }

        return ans;
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
This Java code does the same thing as the Python code. It creates a frequency map of characters in the input string, sorts them in descending order of frequency, and then constructs a string with the characters having the highest frequency. The constructed string is returned as the result.