Below is a Java semantic code clone of your provided C++ code:

```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

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
        
        Character[] ansArray = ans.chars().mapToObj(c -> (char)c).toArray(Character[]::new);

        Arrays.sort(ansArray, Comparator.comparingInt(a -> last[a - 'a']));

        StringBuilder sorted = new StringBuilder(ansArray.length);
        for (Character c : ansArray) {
            sorted.append(c.charValue());
        }
        
        return sorted.toString();
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
In the translated Java version, array is used instead of vector. There is no direct equivalent for custom comparators and sorting of strings in Java like it is in C++, So, the string was turned into an array of characters. The array is sorted using a custom comparator built with a lambda function, and finally the array is turned back into a string. The `Comparable` interface is used in this process to create a custom comparator. Since Java doesn't have direct support for UTF-8 literals, Arrays class and Streams API is used instead of directly handling with strings. The Function call `new String(chars)` is used to convert the character array to a string. The `AsInt` function gets the element as an int, failing which it gives an `NoSuchElementException`.