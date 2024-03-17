Here is a semantic clone of the code in Java.

Please be aware that you must have at least Java 8 installed on your system in order to use Comparator.comparingInt.

```java
import java.util.*;
import java.util.stream.IntStream;

public class Solution {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            last[s.charAt(i) - 'a'] = i;
        }

        int max = Arrays.stream(freq).max().getAsInt() - 1;
        
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] - max > 0) {
                ans.append(String.join("", Collections.nCopies(freq[i] - max, Character.toString((char) ('a' + i)))));
            }
        }

        Character[] ansArray = ans.toString().chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        
        // Sort the ans string using the custom comparator
        Arrays.sort(ansArray, Comparator.comparingInt(a -> last[a - 'a']));

        return Arrays.toString(ansArray).replaceAll("\\[|\\]|,| ", "");
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
Just like the initial C++ code, this Java code reads a single line from the standard input and runs the lastNonEmptyString() method to get a result, and then output the result. The lastNonEmptyString() function behaves the same. In Java code, we are using StringBuilder instead of the string itself for concatenation because it is more efficient in Java. In Java, the standard library does not provide the function that generates a string by repeating a single character, so we use Collections.nCopies() and then join them by an empty string using String.join(). To sort an array or list by a custom comparator, we use Arrays.sort() with Comparator.comparingInt(). Arrays.toString() is used to convert a Character Array to a string because there is no direct way to do so in Java.