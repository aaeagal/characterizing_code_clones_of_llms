Here is the Java equivalent of your Python code:

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
In this Java version, we use `java.util.Scanner` to read the integer inputs. We use `System.out.println` to print the result and `System.exit(0)` to terminate the program. Also, note that in Java, methods are static in order to be able to be called directly from the `main` method.