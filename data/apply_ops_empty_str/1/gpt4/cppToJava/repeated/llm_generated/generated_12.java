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
        Character[] customComparator = new Character[ans.length()];
        for (int i = 0; i < ans.length(); i++) {
            customComparator[i] = ans.charAt(i);
        }

        // Sort the ans string using the custom comparator
        Arrays.sort(customComparator, (a, b) -> {
            return Integer.compare(last[a - 'a'], last[b - 'a']);
        });
        StringBuilder sortedString = new StringBuilder();
        for(char c : customComparator){
            sortedString.append(c);
        }

        return sortedString.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // read from stdin
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        // call the solution's function and get the result
        String result = solution.lastNonEmptyString(inputString);

        // output the result to stdout
        System.out.println(result);
    }
}
```