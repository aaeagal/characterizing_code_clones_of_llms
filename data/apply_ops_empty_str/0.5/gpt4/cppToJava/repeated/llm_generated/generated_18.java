Here is the Java semantic code clone of the provided C++ code:

```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);

        for(int i=0; i< s.length() ; i++){
            freq[s.charAt(i) - 'a']++;
            last[s.charAt(i) - 'a'] = i;
        }
        int maxi = Arrays.stream(freq).max().getAsInt();
        maxi--;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            if(freq[i] - maxi >0){
                char[] chars = new char[freq[i] - maxi];
                Arrays.fill(chars, (char) ('a' + i));
                ans.append(new String(chars));
            }
        }
        Character[] ansChars = ans.toString().chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        Arrays.sort(ansChars, Comparator.comparingInt(a -> last[a - 'a']));
        StringBuilder sortedAns = new StringBuilder(ansChars.length);
        for (Character c : ansChars) {
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
    }
}
```

This Java code does the same thing as the C++ code. It reads a string from the standard input, processes it with the `lastNonEmptyString` method, and prints the result to the standard output. The `lastNonEmptyString` method itself creates two arrays to hold the frequency and last occurrence of each character in the input string, then constructs a new string containing each character repeated a number of times equal to its frequency minus the maximum frequency, and finally sorts this new string according to the last occurrence of each character.