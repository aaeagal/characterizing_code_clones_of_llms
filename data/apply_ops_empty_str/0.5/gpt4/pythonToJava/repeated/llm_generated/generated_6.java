In Java, the equivalent code would be:

```java
import java.util.*;

class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(countMap.entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        int highest = list.get(0).getValue();
        Map<Character, Integer> highestCountMap = new HashMap<>();
        String ans = "";

        for (Map.Entry<Character, Integer> entry : list) {
            if (entry.getValue() == highest) {
                highestCountMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (highestCountMap.containsKey(c)) {
                if (highestCountMap.get(c) == 1) {
                    ans += c;
                }
                highestCountMap.put(c, highestCountMap.get(c) - 1);
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
```

This Java code does the same thing as the Python code. It counts the occurrence of each character in the string, finds the character(s) with the highest count, and then constructs a new string with those characters, in the same order as they appear in the original string. The new string contains each of the highest-count characters exactly once.