Below is the Java semantic code clone of the given C++ code:

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

        Character[] ansChars = new Character[ans.length()];
        for (int i = 0; i < ans.length(); i++) {
            ansChars[i] = ans.charAt(i);
        }

        Arrays.sort(ansChars, Comparator.comparingInt(a -> last[a - 'a']));

        StringBuilder sortedAns = new StringBuilder(ans.length());
        for (Character c : ansChars) {
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

This Java code does the same thing as the C++ code:

1. It reads a string from standard input. 
2. It calculates the frequency of each alphabetical character and the last occurrence of each character in the string.
3. It creates a new string using the characters that have frequency more than the maximum frequency minus one. 
4. Then it sorts the new string according to the last occurrence of each character in the original string.
5. Finally, it prints the sorted string.