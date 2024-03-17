Here is the Java semantic code clone of the provided C++ code:

```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            last[s.charAt(i) - 'a'] = i;
        }

        int maxi = Arrays.stream(freq).max().getAsInt();
        maxi--;

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] - maxi > 0) {
                char[] chars = new char[freq[i] - maxi];
                Arrays.fill(chars, (char) ('a' + i));
                ans.append(new String(chars));
            }
        }
        
        Character[] ansChars = ans.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
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

        // read only one line from stdin
        String inputString = scanner.nextLine();

        // call the solution's function and get the result
        String result = solution.lastNonEmptyString(inputString);

        // output the result to stdout
        System.out.println(result);
    }
}
```

The Java version of the code performs the same operations as the C++ version. It first calculates the frequency and last occurrence of each character in the input string. Then it constructs a string that contains each character repeated as many times as its frequency exceeds the maximum frequency minus one. Finally, it sorts the characters in this string according to their last occurrence in the input string. The main difference is in the syntax and the way certain operations are performed in Java as compared to C++.