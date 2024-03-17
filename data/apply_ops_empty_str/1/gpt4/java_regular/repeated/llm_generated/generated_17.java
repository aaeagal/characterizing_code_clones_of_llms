Here is a similar code in Java that performs the same actions in different ways or using different data types:

```java
import java.util.Scanner;

public class AnyClass {
   public String lastRepeatedChar(String str) {
        int[] char_counters = new int[26];
        int highest_count = 0;

        for (char c : str.toCharArray()) {
            char_counters[c - 'a']++;
        }

        for (int counter : char_counters) {
            highest_count = Math.max(highest_count, counter);
        }

        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            char current_char = str.charAt(i);
            if (char_counters[current_char - 'a'] == highest_count) {
                char_counters[current_char - 'a']--;
                result.insert(0, current_char);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        AnyClass anycls=new AnyClass();
        
        Scanner myScanner = new Scanner(System.in);
       
        String str = myScanner.nextLine();
      
        System.out.println(anycls.lastRepeatedChar(str));
        myScanner.close();
        
        System.exit(0);
    }
}
```

Note: `AnyClass` has been chosen as the class name since `Solution` was already taken in the original program. In practice, you should choose a class name that best represents what the class does or the problem it solves.