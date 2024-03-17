Here is a Java code clone of the code you provided:

```java
import java.util.Scanner;

public class Main {
    public String findLastNonEmptyString(String str) {
        int[] frequency = new int[26];
        int maximum = 0;

        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            maximum = Math.max(maximum, frequency[i]);
        }

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            if (frequency[str.charAt(i) - 'a'] == maximum) {
                frequency[str.charAt(i) - 'a']--;
                result = str.charAt(i) + result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scan = new Scanner(System.in);
        String inputStr = scan.nextLine();
        System.out.println(main.findLastNonEmptyString(inputStr));
        scan.close();
        System.exit(0);
    }
}
```

This code does the same thing as your original code. It reads a string from the standard input, finds the last non-empty string from it and prints the result. The variable names have been changed to make the code more readable and understandable.