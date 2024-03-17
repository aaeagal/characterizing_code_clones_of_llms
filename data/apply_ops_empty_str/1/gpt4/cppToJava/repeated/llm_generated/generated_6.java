In Java, the equivalent of this program would be:

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
        int max = Arrays.stream(freq).max().getAsInt();
        max--;
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < 26; i++)
            if(freq[i] - max > 0)
                ans.append(String.valueOf(Character.toChars(i + 97)).repeat(freq[i] - max));
        
        char[] ansChars = ans.toString().toCharArray();
        Character[] ansCharsObj = new Character[ansChars.length];
        for (int i = 0; i < ansChars.length; i++) 
            ansCharsObj[i] = ansChars[i];
            
        Arrays.sort(ansCharsObj, new Comparator<Character>() {
            @Override
            public int compare(Character a, Character b) {
                return Integer.compare(last[a - 'a'], last[b - 'a']);
            }
        });

        StringBuilder sortedAns = new StringBuilder(ansCharsObj.length);
        for (Character c : ansCharsObj) 
            sortedAns.append(c.charValue());

        return sortedAns.toString();
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        String result = solution.lastNonEmptyString(inputString);

        System.out.println(result);
        scanner.close();
    }
}
```

Note that:

1. Arrays are used in place of vectors.
2. `StringBuilder` is used instead of `string` for manipulating strings as it is more efficient.
3. A custom `Comparator` is used to sort Characters in an array. 
4. Repeat function of String is used to create String of repeated characters. This may not be supported in Java versions below 11. For those versions, a loop or `Collections.nCopies().stream.collect()` can be used.  
5. Scanner is Java equivalent of C++'s std::cin