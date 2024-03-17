Here is a Java version of the Python code you provided:

```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Collections.reverseOrder()));

        int highest = list.get(0).getValue();
        Map<Character, Integer> newMap = new HashMap<>();
        String ans = "";

        for (Map.Entry<Character, Integer> entry : list) {
            if (entry.getValue() == highest) {
                newMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (newMap.containsKey(c)) {
                if (newMap.get(c) == 1) {
                    ans += c;
                }
                newMap.put(c, newMap.get(c) - 1);
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
This Java code does the same thing as the Python code. It counts the frequency of each character in the string, sorts the characters by their frequency in descending order, and then adds the characters with the highest frequency to the result string. The characters are removed from the map as they are added to the result string.