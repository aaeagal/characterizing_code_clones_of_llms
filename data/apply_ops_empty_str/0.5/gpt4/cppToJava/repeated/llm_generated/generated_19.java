Here is the Java semantic code clone of the given C++ code:

```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);

        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            last[s.charAt(i) - 'a'] = i;
        }
        int maxi = Arrays.stream(freq).max().getAsInt();
        maxi--;
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < 26; i++) {
            if(freq[i] - maxi > 0) {
                char[] chars = new char[freq[i] - maxi];
                Arrays.fill(chars, (char)('a' + i));
                ans.append(new String(chars));
            }
        }

        Character[] arr = new Character[ans.length()];
        for(int i = 0; i < ans.length(); i++) {
            arr[i] = ans.charAt(i);
        }

        Arrays.sort(arr, Comparator.comparingInt(a -> last[a - 'a']));

        StringBuilder sortedAns = new StringBuilder(arr.length);
        for(Character c: arr) {
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

This Java code does the same thing as the C++ code. It reads a string from the standard input, finds the last non-empty string based on the frequency and last occurrence of each character, and prints out the result.