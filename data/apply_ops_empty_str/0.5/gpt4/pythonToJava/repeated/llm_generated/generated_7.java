Here is a Java semantic clone of the Python code:

```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> d = new HashMap<>();
        for (char c : s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> dList = new ArrayList<>(d.entrySet());
        dList.sort((x, y) -> y.getValue() - x.getValue());

        int highest = dList.get(0).getValue();
        Map<Character, Integer> newD = new HashMap<>();
        String ans = "";

        for (Map.Entry<Character, Integer> entry : dList) {
            if (entry.getValue() == highest) {
                newD.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char i : s.toCharArray()) {
            if (newD.containsKey(i)) {
                if (newD.get(i) == 1) {
                    ans += i;
                }
                newD.put(i, newD.get(i) - 1);
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

This Java code does the exact same thing as the Python code. It counts the occurrences of each character in the input string, sorts them in descending order of their counts, and then constructs a new string containing only the characters with the highest count. It uses `HashMap` to store the character counts, and `ArrayList` to sort them.