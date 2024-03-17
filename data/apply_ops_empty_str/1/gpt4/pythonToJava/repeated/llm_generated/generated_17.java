Below is the semantic code clone in Java:

```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(countMap.entrySet());
        list.sort(Map.Entry.<Character, Integer>comparingByValue().reversed());
        
        int highest = list.get(0).getValue();
        Map<Character, Integer> highCountChars = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        
        for (Map.Entry<Character, Integer> entry : list) {
            if (entry.getValue() == highest) {
                highCountChars.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }
        
        for (char c : s.toCharArray()) {
            if (highCountChars.containsKey(c)) {
                if (highCountChars.get(c) == 1) {
                    ans.append(c);
                }
                highCountChars.put(c, highCountChars.get(c) - 1);
            }
        }
        return ans.toString();
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        // read only one line
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        // end the program
        System.exit(0);
    }

}
```
This Java code does the same as the Python code provided. It counts the frequency of each character in the string 's', sorts the resulting map by value in descending order, then for every character in 's', if it is the most frequent character and it is the last occurrence of that character, it is appended to the answer. The function returns the result as a string. The main function reads from the standard input, uses the `lastNonEmptyString` function to process the input, and then prints the result to the standard output.