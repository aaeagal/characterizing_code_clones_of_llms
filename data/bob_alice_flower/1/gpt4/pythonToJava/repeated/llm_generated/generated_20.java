The Java equivalent of this Python code would be,

```java
import java.util.Scanner;

public class Solution {
    public static int flowerGame(int n, int m) {
        return m * n / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(flowerGame(n, m));
        scanner.close();
        System.exit(0);
    }
}
```
In the Java version, the "main" function is integrated into the "Solution" class. This class has a static method "flowerGame". It also contains the "main" method which accepts the inputs and invokes the "flowerGame" method. The Scanner class, native to Java, is used for reading the input.