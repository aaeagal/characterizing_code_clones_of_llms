Below is a Java alternative of the provided Python script. The Java version makes use of a HashMap data structure (which is similar to Python's Dictionary data structure) to keep track of character frequency. The code also utilizes Priority Queue and Array List to sort the entry set based on frequencies.

```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(map.entrySet());

        Map.Entry<Character, Integer> entry = pq.peek();
        int highest = entry.getValue();
        map = new HashMap<>();
        String ans = "";
        for (Map.Entry<Character, Integer> e : pq) {
            if (e.getValue() == highest) {
                map.put(e.getKey(), e.getValue());
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
        String s = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(s));
    }
}
```

Please note that Java and Python are fundamentally different languages, so the approaches used in each case may vary. The Java version of the code is slightly more expressive and complex due to Java's strong type system and its way of managing data structure.

Before running this Java code, kindly ensure that all relevant Java libraries have been correctly imported into your environment!