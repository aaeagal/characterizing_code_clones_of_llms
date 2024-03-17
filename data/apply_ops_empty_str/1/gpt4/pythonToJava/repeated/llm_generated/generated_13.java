Here is a semantic code clone in Java:

```java
import java.util.*;

class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> charCount = new HashMap<>(); // equivalent to Python's Counter
        Map<Character, Integer> charCountAux = new HashMap<>(); // equivalent to Python's defaultdict
        char[] charArray = s.toCharArray();
        int highest;

        for (Character i: charArray) { // count characters
            charCount.put(i, charCount.getOrDefault(i, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(charCount.entrySet());
        
        // sort by decreasing frequency count
        list.sort((o1, o2) -> (o2.getValue().compareTo(o1.getValue())));
        highest = list.get(0).getValue();
        
        for (Map.Entry<Character, Integer> entry : list) {
            if (entry.getValue() == highest) 
                charCountAux.put(entry.getKey(), entry.getValue());
            else
                break;
        }

        String ans = "";
       
        for (Character i: charArray) {
            if (charCountAux.containsKey(i)) {
                if (charCountAux.get(i) == 1) 
                    ans += i;
                charCountAux.put(i, charCountAux.get(i) - 1);
            }
        }

        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.println("Enter your string");
        String s = scanner.nextLine().trim();
        System.out.println(solution.lastNonEmptyString(s));

        scanner.close(); // close the scanner
    }
}
```

This Java code does the same as the Python one: it counts the frequency of each character in a string and returns a new string containing copies of the character(s) which have the highest frequency in the original string. The order of characters is based on their positions in the original string.