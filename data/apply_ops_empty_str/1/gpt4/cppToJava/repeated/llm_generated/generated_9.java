Below is the Java semantic equivalent code for the C++ code you've provided:

```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);

        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
            last[s.charAt(i)-'a']=i;
        }
        int max = Arrays.stream(freq).max().getAsInt();
        max--;
        
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] - max > 0) {
                char[] charArray = new char[freq[i] - max];
                Arrays.fill(charArray, (char)('a' + i));
                ans.append(new String(charArray));
            }
        }

        Character[] ansArr = new Character[ans.length()];
        for (int i = 0; i < ans.length(); i++) {
            ansArr[i] = ans.charAt(i);
        }
        Arrays.sort(ansArr, Comparator.comparingInt(a -> last[a - 'a']));
        StringBuilder sortedAns = new StringBuilder(ans.length());
        for (Character c : ansArr) {
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
Note: In Java, the `char` data type is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive). Therefore, it can cater to the ASCII range with ease, similar to C++ code.