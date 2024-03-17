In Java, you'll need to use ArrayList instead of vectors and HashMap instead of arrays for the frequency calculation due to Java's limitations. Here is the translated Java code:

```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            last[s.charAt(i) - 'a'] = i;
        }
        int max = Arrays.stream(freq).max().getAsInt();
        max--;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] - max > 0) {
                ans.append(new String(new char[freq[i] - max]).replace('\0', (char)('a' + i)));
            }
        }
        Character[] ansArray = ans.toString().chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        Arrays.sort(ansArray, Comparator.comparingInt(a -> last[a - 'a']));
        StringBuilder sortedAns = new StringBuilder(ans.length());
        for (Character c : ansArray) {
            sortedAns.append(c.charValue());
        }
        return sortedAns.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();

        Solution solution = new Solution();
        String result = solution.lastNonEmptyString(inputString);

        System.out.println(result);
    }
}
```

Note: This Java code uses a Scanner for input, and System.out.println for output, which are roughly equivalent to the C++ cin and cout in the original code. Java also uses StringBuilder instead of string concatenation for improved efficiency.