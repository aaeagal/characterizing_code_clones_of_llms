Here is a Java semantic code clone of the provided C++ code:

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
        int maxi = Arrays.stream(freq).max().getAsInt();
        maxi--;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            if(freq[i]-maxi >0){
                char[] chars = new char[freq[i] - maxi];
                Arrays.fill(chars, (char)('a' + i));
                ans.append(new String(chars));
            }
        }

        Character[] ansArray = new Character[ans.length()];
        for (int i = 0; i < ans.length(); i++) {
            ansArray[i] = ans.charAt(i);
        }

        Arrays.sort(ansArray, (a, b) -> last[a - 'a'] - last[b - 'a']);

        StringBuilder sortedAns = new StringBuilder(ansArray.length);
        for (Character c : ansArray) {
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

This Java code does the same thing as the C++ code. It reads a string from the standard input, processes it with the `lastNonEmptyString` method, and then prints the result to the standard output. The `lastNonEmptyString` method itself also works the same way as in the C++ code, it calculates the frequency and the last occurrence of each character in the input string, and then constructs a new string based on these information. The new string is then sorted based on the last occurrence of each character before being returned.