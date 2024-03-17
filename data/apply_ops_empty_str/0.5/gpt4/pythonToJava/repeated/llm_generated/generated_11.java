Below is the Java semantic code clone of the provided Python code:

```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        int highest = list.get(0).getValue();
        map.clear();
        String ans = "";

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
                    ans += c;
                }
                map.put(c, map.get(c) - 1);
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

This Java code essentially does the same thing as the Python code. It first counts the frequency of each character in the string. Then it sorts the characters based on their frequencies in descending order. Then it creates a new map that only contains the characters with the highest frequency. It then iterates over the string again and if a character is in the new map, it appends it to the answer string and decrements its count in the map. The answer string is then returned. The main method reads a string from the standard input, calls the `lastNonEmptyString` method on it, and prints the result.