Below is the Java semantic code clone of given C++ code:

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
        
        int maxFreq = Arrays.stream(freq).max().getAsInt();
        maxFreq--;

        StringBuilder ans = new StringBuilder();
        for(int i=0; i<26; i++){
            if(freq[i]-maxFreq > 0){
                for (int j = 0; j < freq[i] - maxFreq; ++j) {
                    ans.append((char)('a' + i));
                }
            }
        }

        Comparator<Character> customComparator = (a, b) -> last[a - 'a'] < last[b - 'a'] ? -1 : 1;
        Character[] ansArray = ans.chars().mapToObj(e->(char)e).toArray(Character[]::new);
        
        // Sort the ans string using the custom comparator
        Arrays.sort(ansArray, customComparator);
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

        scanner.close();
    }
}
```
Please note that Java does not have direct inbuilt support for sorting a `StringBuilder` or `String`. Therefore, we convert it to a Character array, perform the sorting, and then convert it back to a String.