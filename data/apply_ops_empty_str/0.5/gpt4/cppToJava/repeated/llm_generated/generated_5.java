Here is the Java semantic code clone of the provided C++ code:

```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);

        for(int i=0; i< s.length() ; i++){
            freq[s.charAt(i)-'a']++;
            last[s.charAt(i)-'a']=i;
        }
        int maxi = Collections.max(Arrays.asList(Arrays.stream(freq).boxed().toArray(Integer[]::new)));
        maxi--;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            if(freq[i]-maxi >0){
                char[] repeat = new char[freq[i] - maxi];
                Arrays.fill(repeat, (char)('a' + i));
                ans.append(new String(repeat));
            }
        }

        Character[] ansArr = ans.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
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

        // read only one line from stdin
        String inputString = scanner.nextLine();

        // call the solution's function and get the result
        String result = solution.lastNonEmptyString(inputString);

        // output the result to stdout
        System.out.println(result);
    }
}
```

This Java code does the exact same thing as the C++ code, but with Java syntax and Java's standard library. The `lastNonEmptyString` function first calculates the frequency of each character in the input string and the last occurrence of each character. Then it constructs a string that contains each character repeated the number of times it appears in the input string minus the maximum frequency plus one. Finally, it sorts the characters in this string based on their last occurrence in the input string.