Here is the equivalent Java code for the provided C++ code.

```java
import java.util.*;

class Solution {
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
        for(int i = 0; i < 26 ; i++){
            if(freq[i] - maxi >0){
                char[] chars = new char[freq[i] - maxi];
                Arrays.fill(chars, (char)('a' + i));
                ans.append(new String(chars));
            }
        }
        Character[] result = ans.toString().chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        
        Comparator<Character> customComparator = (Character a, Character b) -> Integer.compare(last[a - 'a'], last[b - 'a']);
        Arrays.sort(result, customComparator);

        StringBuilder sortedString = new StringBuilder(result.length);
        for (Character c : result) {
            sortedString.append(c.charValue());
        }
        return sortedString.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        String result = solution.lastNonEmptyString(inputString);

        System.out.println(result);
        scanner.close();
    }
}
```
The given C++ code is converted to equivalent Java code. Java does not natively support primitive type arrays in its sorting library, so we convert the string to a Character array before performing the sort operation. Arrays.fill is used in Java as a substitute for the vector initialization in C++. The StringBuilder class is used for string concatenation due to its efficiency over normal string concatenation in Java.