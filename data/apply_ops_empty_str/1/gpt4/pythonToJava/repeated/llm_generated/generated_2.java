Below is the Java semantic code clone of the given Python code:

```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {

        Map<Character, Integer> counter = new HashMap<>();
        for (char c : s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        
        List<Map.Entry<Character, Integer>> counterList = new ArrayList<>(counter.entrySet());
        counterList.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        int highest = counterList.get(0).getValue();
        Map<Character, Integer> equalsHighest = new HashMap<>();
        String ans = "";
        
        for (Map.Entry<Character, Integer> entry : counterList) {
            if (entry.getValue() == highest) {
                equalsHighest.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }
        
        for (char c : s.toCharArray()) {
            if (equalsHighest.containsKey(c)) {
                if (equalsHighest.get(c) == 1) {
                    ans += c;
                }
                equalsHighest.put(c, equalsHighest.get(c) - 1);
            }
        }
            
        return ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
    }
}
```

This java version accomplishes the same task as the original python code. It creates a frequency counter for the input string, sorts the counter in descending order of frequency, and then finds the character(s) with the maximum frequency. It then traverses the input string again and includes the highly frequent characters in the output string only once.