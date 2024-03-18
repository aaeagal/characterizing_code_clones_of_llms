Below is the Java semantic code clone for the given Python code:

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        System.out.println(flowerGame(n, m));
    }

    public static int flowerGame(int n, int m) {
        return m * n / 2;
    }
}
```

In the Java code, the equivalent of the `sys.exit()` function is not needed as the program will finish execution after completing the `main` method.

`Scanner` class is used in Java for taking console inputs in place of Python's `input` function. The `println` method from the `System.out` object in Java is used instead of the `print` function in Python for console outputs.

In the Python code, the `flowerGame` method is a part of a Class `Solution`, while in the Java code the `flowerGame` method is a `static` method in the `Solution` class which doesn't require an instance of the class to call. This is because the global scope of Python scripts correlates more directly to a `public static` Java main method than to any particular class or object initialization.