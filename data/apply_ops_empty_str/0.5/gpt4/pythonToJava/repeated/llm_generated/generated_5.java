Below is a Java version of the provided Python code:

```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

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
        Scanner scanner = new Scanner(System.in);
        Solution sol = new Solution();

        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        
        scanner.close();
        System.exit(0);
    }
}
```

Explanation:

1. The `lastNonEmptyString` function first counts the occurrence of each character in the input string `s` and stores them in a map.
2. It then sorts the entries of the map in descending order based on their values (occurrences).
3. The function then finds the highest occurrence and keeps only the characters with the highest occurrence in the map.
4. It then constructs the result string by traversing the input string and appending characters that are still in the map to the result string. It also decreases the count of the character in the map each time it is appended to the result string.
5. The function finally returns the result string.
6. The `main` function reads a line from the standard input, trims it, and then prints the result of the `lastNonEmptyString` function called with the read line. It then closes the scanner and exits the program.