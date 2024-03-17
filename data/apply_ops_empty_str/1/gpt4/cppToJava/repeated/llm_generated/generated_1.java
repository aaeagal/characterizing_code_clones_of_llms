Here is the Java semantic code clone of the given C++ code:

```java
import java.util.*;

public class Solution {
    String lastNonEmptyString(String s){
        int n = s.length();
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);
        
        for(int i=0; i<n ; i++){
            freq[s.charAt(i) - 'a']++;
            last[s.charAt(i) - 'a']=i;
        }
        
        int maxi = Arrays.stream(freq).max().getAsInt();
        maxi--;
        
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<26; i++){
            if(freq[i] - maxi > 0){
                char[] arr = new char[freq[i] - maxi];
                Arrays.fill(arr, (char)('a' + i));
                ans.append(new String(arr));
            }
        }
        
        Character[] ansArr = new Character[ans.length()];
        for (int i = 0; i < ans.length(); i++) {
            ansArr[i] = ans.charAt(i);
        }
        
        Arrays.sort(ansArr, Comparator.comparingInt(a -> last[a - 'a']));
        StringBuilder sortedAns = new StringBuilder(ans.length());
        for (Character c : ansArr) {
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

This Java code does the same thing as the C++ one: it reads a string from the standard input, retrieves the string with the maximum frequency of each distinct character placed according to the last occurrence of each character by calling the function `lastNonEmptyString(String s)`, and outputs it to the standard output.