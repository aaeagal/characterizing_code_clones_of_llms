Below is a Java semantic code clone of the provided C++ code:

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

        Arrays.sort(ansArray, Comparator.comparingInt(a -> last[a - 'a']));

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

This Java code does the same thing as the C++ code. It reads a string from the standard input, calls the `lastNonEmptyString` method of the `Solution` class and prints the result to the standard output. The `lastNonEmptyString` method creates frequency and last occurrence arrays for the characters in the string, constructs a new string based on the frequency and last occurrence of the characters, sorts the new string based on the last occurrence of the characters and returns the sorted string.