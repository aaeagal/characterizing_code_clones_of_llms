Here is the equivalent Java code:

```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);
        
        for(int i=0; i< s.length() ; i++){
            freq[s.charAt(i)-'a']++;
            last[s.charAt(i)-'a'] = i;
        }
        int maxi = Arrays.stream(freq).max().getAsInt();
        maxi--;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            if(freq[i]-maxi >0){
                char[] tmp = new char[freq[i] - maxi];
                Arrays.fill(tmp, (char) ('a' + i));
                ans.append(new String(tmp));
            }
        }

        Character[] arr = new Character[ans.length()];
        for(int i = 0; i< ans.length(); i++) 
            arr[i] = ans.charAt(i);
        
        Arrays.sort(arr, new Comparator<Character>() { 
            @Override
            public int compare(Character a, Character b) {
                return Integer.compare(last[a - 'a'], last[b - 'a']);
            }
        });

        StringBuilder sorted = new StringBuilder(arr.length);
        for(Character c: arr)
            sorted.append(c.charValue());

        return sorted.toString();
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

Please note that the behavior of the code can slightly vary between C++ and Java due to their handling of character values and string manipulation. The provided Java code assumes ASCII character input. Also, in Arrays.sort() Converting a StringBuilder to a Character array is necessary because there is no native method in Java to sort a StringBuilder directly.