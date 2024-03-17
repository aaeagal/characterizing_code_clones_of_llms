Below is the Java semantic code clone for the given C++ code:

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
                char[] repeatChar = new char[freq[i] - maxi];
                Arrays.fill(repeatChar, (char)('a' + i));
                ans.append(new String(repeatChar));
            }
        }
        Character[] ansArr = new Character[ans.length()];
        for(int i=0; i< ans.length(); i++){
            ansArr[i] = ans.charAt(i);
        }
        Arrays.sort(ansArr, (a, b) -> last[a - 'a'] - last[b - 'a']);
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
This Java code provides the same functionality as the provided C++ code. It reads a string from the standard input, computes the last non-empty string using the `lastNonEmptyString` method, and then prints the result to the standard output.