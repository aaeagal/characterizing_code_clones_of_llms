Here is a Java version of the given Python code:

```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> d = new HashMap<>();
        for(char c : s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> dList = new ArrayList<>(d.entrySet());
        dList.sort((x, y) -> y.getValue().compareTo(x.getValue()));

        int highest = dList.get(0).getValue();
        d = new HashMap<>();
        String ans = "";

        for(Map.Entry<Character, Integer> entry : dList) {
            if(entry.getValue() == highest) {
                d.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for(char i : s.toCharArray()) {
            if(d.containsKey(i)) {
                if(d.get(i) == 1) {
                    ans += i;
                }
                d.put(i, d.get(i) - 1);
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

This Java code does essentially the same thing as the Python code. It counts the occurrences of each character in the input string, then it sorts the characters by their counts in descending order. It then iterates over the sorted list, adding each character to a new map until it encounters a character with a lower count. Finally, it constructs the result string by iterating over the input string and appending each character that is present in the new map, decrementing its count each time. When the count reaches 1, it appends the character to the result string and continues to the next character.