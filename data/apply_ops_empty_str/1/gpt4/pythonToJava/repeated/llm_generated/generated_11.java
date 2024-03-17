Below is a Java implementation of the Python code above:

```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {

        TreeMap<Character, Integer> treeCount = new TreeMap<>();
        for (char ch : s.toCharArray()) {
            treeCount.put(ch, treeCount.getOrDefault(ch, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> sortedCount = new ArrayList<>(treeCount.entrySet());
        sortedCount.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        int highest = sortedCount.get(0).getValue();
        Map<Character, Integer> maxCount = new HashMap<>();

        for (Map.Entry<Character, Integer> entry : sortedCount) {
            if (entry.getValue() == highest) {
                maxCount.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        StringBuilder result = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (maxCount.containsKey(ch)) {
                if (maxCount.get(ch) == 1) {
                    result.append(ch);
                }
                maxCount.put(ch, maxCount.get(ch) - 1);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Solution s = new Solution();
        Scanner scanner = new Scanner(System.in);

        String inputValue = scanner.nextLine().trim();
        System.out.println(s.lastNonEmptyString(inputValue));
    }
}
```
This Java code mirrors the Python code. It uses `TreeMap` and `HashMap` to implement `Counter` and `defaultdict` as used in the Python code, and then `ArrayList` to sort the map entries based on their values in descending order as done with `sorted` in Python. The rest of the operations are quite similar for both codes.