Below is a Java semantic code clone of the provided Python code:

```java
import java.util.Scanner;

class Solution {
    public int flowerGame(int n, int m) {
        return m * n / 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        // Split the input string into two parts and convert them to integers
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        System.out.println(sol.flowerGame(n, m));
        System.exit(0);
    }
}
```

In the Java version, we use the `Scanner` class to read user input. This is similar to the Python `input()` function. The `Integer.parseInt()` function is used to convert the string inputs to integers, similar to `int()` in Python. The `System.out.println()` function is used to print the result, similar to `print()` in Python. The `System.exit(0)` function is used to terminate the program, similar to `sys.exit(0)` in Python.