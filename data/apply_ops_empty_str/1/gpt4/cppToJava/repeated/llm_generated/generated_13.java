Below is the semantically equivalent Java version of the provided C++ code:

```Java
import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        Arrays.fill(freq, 0);
        
        int[] last = new int[26];
        Arrays.fill(last, -1);
        
        for(int i = 0; i < s.length() ; i++){
            freq[s.charAt(i) - 'a']++;
            last[s.charAt(i) - 'a']=i;
        }
        
        int maxi = Arrays.stream(freq).max().orElse(-1);
        maxi--;
        
        StringBuilder ans = new StringBuilder();
        
        for(int i = 0; i < 26 ; i++){
            if(freq[i] - maxi > 0){
                char[] repeatChar = new char[freq[i] - maxi];
                Arrays.fill(repeatChar, (char)('a' + i));
                ans.append(repeatChar);
            }
        }

        Character[] ansArr = ans.toString().chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        Arrays.sort(ansArr, (a, b) -> last[a - 'a'] - last[b - 'a']);
        return Stream.of(ansArr).map(String::valueOf).collect(Collectors.joining());
    }

    public static void main(String[] args) throws IOException{
        Solution solution = new Solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine();
        String result = solution.lastNonEmptyString(inputString);
        System.out.println(result);
    }
}
```
This Java code does functionally equivalent operation as the given C++ code. Please note that here equivalent Java equivalent code for auto customComparator is made using lambda function, and it supports only version 8 or above. Code is written using BufferedReader, however Scanner can also be used for input operation.