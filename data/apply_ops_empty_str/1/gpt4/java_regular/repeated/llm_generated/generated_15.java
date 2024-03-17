Here's an equivalent program:

```java
import java.util.Scanner;

public class Main {
    public String getLastNonEmptyString(String str) {
        int[] frequency = new int[26];
        int highest = 0;
        
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            highest = Math.max(highest, frequency[i]);
        }
        
        String result = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (frequency[str.charAt(i) - 'a'] == highest) {
                frequency[str.charAt(i) - 'a'] --;
                result = str.charAt(i) + result;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(main.getLastNonEmptyString(input));
        scan.close();
        System.exit(0);
    }
}
```
This code does precisely the same operation, but with different variable names. Instead of 'Solution' it is named 'Main', instead of 'sol', the object is named 'main' and instead of 's', I called the string 'input', 'arr' is named 'frequency' and 'ans' is 'result'. The method 'lastNonEmptyString' is renamed to 'getLastNonEmptyString'.