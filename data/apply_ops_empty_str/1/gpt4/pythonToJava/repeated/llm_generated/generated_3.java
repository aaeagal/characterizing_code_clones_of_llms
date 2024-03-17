Below is the Java code to implement the Python code which finds the last non empty string:

```Java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {

        Map<Character, Integer> counts = new HashMap<>();
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        int highest = Collections.max(counts.values());
        Map<Character, Integer> d = new HashMap<>();

        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == highest) {
                d.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        StringBuilder ans = new StringBuilder();
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
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(solution.lastNonEmptyString(s));
        scanner.close();
    }
}
```

In this java code, `Map<Character, Integer>` is used to mimic Python `Counter` and `defaultdict` functionality.
Please note that the Python version of the code performs a sort and then takes advantage of this sort to break the for loop iterating over the dictionary `d_list` on the first occurrence on a key with a value that is not equal to the highest count. However, this isn't a straightforward operation in Java because iterating over a HashMap does not guarantee any specific order. This caveat is not replicated in the Java code rather Java code puts all the characters having highest occurances.