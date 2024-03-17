The Java version of the given C++ code:

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
        int maxi = Arrays.stream(freq).max().getAsInt();
        maxi--;
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < 26; i++){
            if(freq[i] - maxi > 0){
                char[] temp = new char[freq[i] - maxi];
                Arrays.fill(temp, (char)('a' + i));
                ans.append(new String(temp));
            }
        }
        Character[] ansArr = ans.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        Arrays.sort(ansArr, (a, b) -> Integer.compare(last[a - 'a'], last[b - 'a']));
        StringBuilder sortedAns = new StringBuilder(ansArr.length);
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
This Java code does the same thing as the C++ code. It creates frequency and last occurrence arrays, generates a string with the remaining characters after subtracting the maximum frequency minus one from each character's frequency, then sorts the string based on the last occurrence of each character in the input string.