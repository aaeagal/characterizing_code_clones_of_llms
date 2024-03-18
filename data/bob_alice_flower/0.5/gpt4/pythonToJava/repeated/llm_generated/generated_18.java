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
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(sol.flowerGame(n, m));
        System.exit(0);
    }
}
```

This Java code does the same thing as the Python code: it defines a `flowerGame` method that multiplies two numbers and divides the result by 2. Then it gets two integer inputs from the user, calls the `flowerGame` method with these inputs, and prints the result.