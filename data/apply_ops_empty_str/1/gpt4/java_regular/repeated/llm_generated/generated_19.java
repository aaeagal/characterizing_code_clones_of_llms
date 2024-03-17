Here's a clone of the provided Java code. It essentially does exactly what the original code does but with different variable names and function name:

```java
import java.util.Scanner;

class Example {
    public String findLastNonEmptyStr(String inputString) {
        int freq[] = new int[26];
        int highest = 0;
        
        for (int count = 0; count < inputString.length(); count++) {
            freq[inputString.charAt(count) - 'a']++;
        }
        
        for (int count = 0; count < 26; count++) {
            highest = Math.max(highest, freq[count]);
        }
        
        String result = "";
        
        for (int count = inputString.length() - 1; count >= 0; count--) {
            if (freq[inputString.charAt(count) - 'a'] == highest) {
                freq[inputString.charAt(count) - 'a']--;
                result = inputString.charAt(count) + result;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Example ex = new Example();
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();
        System.out.println(ex.findLastNonEmptyStr(inputStr));
        in.close();
        System.exit(0);
    }
}
``` 

Notice that the function name "lastNonEmptyString" changed to "findLastNonEmptyStr". Also, variables have been renamed to be more descriptive. For example, "s" was changed to "inputString", "arr" to "freq", "max" to "highest", "ans" to "result". I hope this is what you're asking for!