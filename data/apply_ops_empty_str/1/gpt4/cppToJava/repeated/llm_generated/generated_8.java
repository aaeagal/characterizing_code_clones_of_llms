Below is the Java code equivalent of the provided C++ code. Notice that the built-in data structures used in Java and C++ are similar and consequently used in much the same way.

```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        int[] fre = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);
        
        for (int i = 0; i < s.length(); i++) {
            fre[s.charAt(i) - 'a']++;
            last[s.charAt(i) - 'a'] = i;
        }
        int max = Arrays.stream(fre).max().getAsInt();
        max--;
        
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (fre[i] - max > 0) {
                char[] appendArray = new char[fre[i] - max];
                Arrays.fill(appendArray, (char)('a' + i));
                ans.append(new String(appendArray));
            }
        } 
        
        Character[] ansArray = ans.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        Arrays.sort(ansArray, new Comparator<Character>() {
            @Override
            public int compare(Character a, Character b) {
                return Integer.compare(last[a - 'a'], last[b - 'a']);
            }
        });
        
        StringBuilder sortedAns = new StringBuilder(ansArray.length);
        for (Character c : ansArray) {
            sortedAns.append(c.charValue());
        }
        return sortedAns.toString();
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String result = solution.lastNonEmptyString(inputString);
        System.out.println(result);
        scanner.close();
    }
}
```
This Java code works the same way as the given C++ code. It's a program that gets the frequencies of characters in a string, and for each frequency that is greater than the maximum frequency (minus 1), it appends the corresponding character to the output string. These characters are then sorted based on their last index in the original string.