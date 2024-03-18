Below is a Java semantic code clone of the provided C++ code:

```java
import java.util.Scanner;

public class Solution {
    public long flowerGame(int n, int m) {
        long AOdd = n % 2 == 1 ? n / 2 + 1 : n / 2;
        long AEven = n / 2;
        long BOdd = m % 2 == 1 ? m / 2 + 1 : m / 2;
        long BEven = m / 2;
        return AOdd * BEven + AEven * BOdd;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);

        // Continuously read input lines until EOF
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");

            // Read the two integers
            int n = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);

            // Call the solution function and print the result
            System.out.println(solution.flowerGame(n, m));
        }

        scanner.close();
    }
}
```

In this Java version, I created a class `Solution` with a method `flowerGame(int n, int m)`. The `main` method is also included in the `Solution` class which is a common practice in Java. The `main` method reads input lines from standard input until EOF, calls the `flowerGame` method, and prints the result. The `Scanner` class is used for reading input.