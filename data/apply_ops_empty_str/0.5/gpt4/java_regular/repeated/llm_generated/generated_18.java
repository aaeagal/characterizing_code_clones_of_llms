Here is a Java code clone of the provided code:

```java
import java.util.Scanner;

class Example {
    public String findLastNonEmptyString(String input) {
        int[] array = new int[26];
        int maximum = 0;
        
        for (int index = 0; index < input.length(); index++) {
            array[input.charAt(index) - 'a']++;
        }
        
        for (int index = 0; index < 26; index++) {
            maximum = Math.max(maximum, array[index]);
        }
        
        String result = "";
        
        for (int index = input.length() - 1; index >= 0; index--) {
            if (array[input.charAt(index) - 'a'] == maximum) {
                array[input.charAt(index) - 'a']--;
                result = input.charAt(index) + result;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Example example = new Example();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(example.findLastNonEmptyString(input));
        scanner.close();
        System.exit(0);
    }
}
```
This code works exactly the same as the original code, but with different variable and method names. The function `findLastNonEmptyString` is equivalent to `lastNonEmptyString`. The variables `array`, `maximum`, `result`, and `input` correspond to `arr`, `max`, `ans`, and `s` respectively. The class `Example` is equivalent to `Solution`.