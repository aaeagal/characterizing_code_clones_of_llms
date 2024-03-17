Below is the Java semantic code clone of the provided Python code:

```java
import java.util.*;

class Solution {
    public String lastNonEmptyString(String s) {

        Map<Character, Integer> d = new HashMap<>();
        for (char c : s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> dList = new ArrayList<>(d.entrySet());
        dList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int highest = dList.get(0).getValue();
        d = new HashMap<>();
        String ans = "";

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
                    ans += i;
                }
                d.put(i, d.get(i) - 1);
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

In this Java code, we created a `Solution` class with a method `lastNonEmptyString()`. This method takes a string as input, counts the frequency of each character, sorts them in descending order of frequency, and then constructs a new string with the characters having the highest frequency. The `main()` method reads a string from the user, calls the `lastNonEmptyString()` method, and then prints the result.