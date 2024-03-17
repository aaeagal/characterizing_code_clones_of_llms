Here's a Java version of the Python code you posted:

```java
import java.util.*;

class Solution {
    String lastNonEmptyString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        int highest = list.get(0).getValue();
        HashMap<Character, Integer> highestMap = new HashMap<>();
        StringBuilder ans = new StringBuilder();

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
                    ans.append(c);
                }
                highestMap.put(c, highestMap.get(c) - 1);
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
This Java code does the same thing as your Python code. It counts the frequency of each character in the input string, finds the character(s) with the highest frequency, and then constructs a new string that contains only those characters, in the same order as they appear in the input string.