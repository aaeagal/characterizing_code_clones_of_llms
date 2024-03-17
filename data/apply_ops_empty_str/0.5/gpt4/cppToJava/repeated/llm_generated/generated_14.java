Below is the Java semantic code clone of the provided C++ code:

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
                Arrays.fill(chars, (char) ('a' + i));
                ans.append(new String(chars));
            }
        }

        Character[] ansArr = new Character[ans.length()];
        for (int i = 0; i < ans.length(); i++) {
            ansArr[i] = ans.charAt(i);
        }

        Arrays.sort(ansArr, Comparator.comparingInt(a -> last[a - 'a']));

        StringBuilder sortedAns = new StringBuilder(ansArr.length);
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

Please note that Java does not support lambda expressions that capture variables from the enclosing scope (like the `customComparator` in the original C++ code). So, instead of using a lambda expression, I used a `Comparator` with a method reference.