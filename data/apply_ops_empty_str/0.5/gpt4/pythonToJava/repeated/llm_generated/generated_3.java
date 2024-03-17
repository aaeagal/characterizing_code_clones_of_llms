Here is a Java version of your Python code:

```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> d = new HashMap<>();
        for (char c : s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> dList = new ArrayList<>(d.entrySet());
        dList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int highest = dList.get(0).getValue();
        d = new HashMap<>();

        StringBuilder ans = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : dList) {
            if (entry.getValue() == highest) {
                d.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char i : s.toCharArray()) {
            if (d.containsKey(i)) {
                if (d.get(i) == 1) {
                    ans.append(i);
                }
                d.put(i, d.get(i) - 1);
            }
        }

        return ans.toString();
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

This Java code does the same thing as your Python code: it reads a string from the input, counts the frequency of each character, finds the character(s) with the highest frequency, and returns a string composed of these characters in their original order. The main differences are due to the differences between Python and Java, such as the need to use `Map` and `List` in Java instead of `Counter` and `defaultdict` in Python, and the use of `StringBuilder` in Java instead of string concatenation in Python.