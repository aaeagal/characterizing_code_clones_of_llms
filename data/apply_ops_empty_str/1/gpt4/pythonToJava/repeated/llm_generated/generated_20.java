In Java, the given Python code can be translated as follows:

```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> counter = new HashMap<>();
        
        for(char ch : s.toCharArray()){
            counter.put(ch, counter.getOrDefault(ch, 0) + 1);
        }
        
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(counter.entrySet());
        Collections.sort(list, (a, b) -> b.getValue().compareTo(a.getValue()));

        int highest = list.get(0).getValue();
        Map<Character, Integer> d = new HashMap<>();
        StringBuilder ans = new StringBuilder();

        for(Map.Entry<Character, Integer> entry : list){
            if(entry.getValue() == highest)
                d.put(entry.getKey(), entry.getValue());
            else
                break;
        }
        
        for(char i : s.toCharArray()){
            if(d.containsKey(i)){
                if(d.get(i) == 1)
                    ans.append(i);
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
        System.exit(0);
    }
}
```

There exist differences in the approach taken by both Python and Java in using certain data structures. In Python there's Counter and defaultdict which doesn't have a straightforward equivalent in Java. Thus, additional steps are needed in Java to mimic their behavior. Also, Java has distinct Classes for different types of input. e.g., Scanner for input, StringBuilder for string concatenation, etc. which is different from Python.