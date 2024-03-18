Below is a Java version of the given Python code:

```java
import java.util.*;

public class Solution {
    public static int flowerGame(int n, int m) {
        return m * n / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(flowerGame(n, m));
        System.exit(0);
    }
}
```
This Java code performs the exactly same functionality as the given Python code in the prompt. It reads two integers as inputs, and then calls the `flowerGame` method with these two values. The `flowerGame` method just multiplies `n` and `m` and divides by 2, the result is then printed. After printing the result, the program terminates.