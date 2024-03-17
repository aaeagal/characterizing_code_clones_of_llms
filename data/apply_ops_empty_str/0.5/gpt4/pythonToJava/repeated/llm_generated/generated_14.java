Here is the Java code clone of the above Python code:

```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(countMap.entrySet());
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        int highest = list.get(0).getValue();
        Map<Character, Integer> highestMap = new HashMap<>();
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

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        scanner.close();
        System.exit(0);
    }
}
```
This Java code does the same thing as the Python code does. It counts the frequency of each character in the input string, sorts them in descending order of frequency, and then constructs a new string by appending the character with the highest frequency to the answer string. If a character's frequency becomes 1, it is appended to the answer string and its frequency is decreased by 1. The process continues until all characters with the highest frequency have been processed. The final answer string is returned.