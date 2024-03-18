Here is a Java semantic code clone of the provided Python code:

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

Please note the following:

- Python uses the `//` operator for integer division, while Java uses the `/` operator.
- In Java, the `main` function is not standalone but instead belongs to a class (in this case, `Main`).
- Java uses `System.out.println` instead of `print` for console output and `System.exit(0)` instead of `sys.exit(0)` to terminate the program.
- In Java, we use `Scanner` for input, unlike Python's `input()`.
- Unlike Python, Java requires explicit type declarations.