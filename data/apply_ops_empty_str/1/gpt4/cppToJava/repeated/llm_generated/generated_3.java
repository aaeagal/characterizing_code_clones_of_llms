Below is the Java equivalent of your C++ code:

```Java
import java.util.Scanner;
import java.util.*;

class Solution {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last,-1);

        for(int i=0; i< s.length() ; i++){
            freq[s.charAt(i)-'a']++;
            last[s.charAt(i)-'a']=i;
        }
        int maxi = Arrays.stream(freq).max().getAsInt();
        maxi--;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            if(freq[i]-maxi >0){
                char[] arr = new char[freq[i]-maxi];
                Arrays.fill(arr, (char) ('a' + i));
                ans.append(new String(arr));
            }
        }
        Character[] ansArr = new Character[ans.length()];
        for (int i = 0; i < ans.length(); i++) {
            ansArr[i] = ans.charAt(i);
        }
        Arrays.sort(ansArr, (a, b) -> last[a - 'a'] - last[b - 'a']);
        StringBuilder sortedAns = new StringBuilder(ansArr.length);
        for (Character c : ansArr) {
            sortedAns.append(c.charValue());
        }
        return sortedAns.toString();
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scn = new Scanner(System.in);

        // read the string from stdin
        String inputString = scn.nextLine();

        // call the solution's function and get the result
        String result = solution.lastNonEmptyString(inputString);

        // output the result to stdout
        System.out.println(result);

        scn.close();
    }
}
```

Note: Java does not support lambdas with access to mutable local variables that are not final or effectively final. That's why I had to convert the sort part to use an array of `Character` and a traditional for loop in order to sort it.