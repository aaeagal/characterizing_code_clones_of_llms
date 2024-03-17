Here is the Java semantic code clone of the given C++ code:

```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);

        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            last[s.charAt(i) - 'a'] = i;
        }
        int maxi = Arrays.stream(freq).max().getAsInt();
        maxi--;
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < 26; i++){
            if(freq[i] - maxi > 0){
                char[] chars = new char[freq[i] - maxi];
                Arrays.fill(chars, (char)('a' + i));
                ans.append(new String(chars));
            }
        }

        Character[] ansArray = new Character[ans.length()];
        for(int i = 0; i < ans.length(); i++){
            ansArray[i] = ans.charAt(i);
        }

        // Sort the ans string using the custom comparator
        Arrays.sort(ansArray, Comparator.comparingInt(a -> last[a - 'a']));
        StringBuilder sortedAns = new StringBuilder(ansArray.length);
        for(Character c : ansArray){
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

This Java code performs the same operations as the given C++ code. It creates frequency and last occurrence arrays for each character in the input string, finds the maximum frequency, constructs a string with characters occurring more than the maximum frequency, sorts the string based on the last occurrence of each character, and finally returns the sorted string.