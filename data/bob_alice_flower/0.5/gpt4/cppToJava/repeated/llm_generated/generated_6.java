Here is the semantic clone of the given C++ code in Java:

```java
import java.util.Scanner;

class Solution {
    public long flowerGame(int n, int m) {
        long AOdd = n % 2 == 1 ? n / 2 + 1 : n / 2;
        long AEven = n / 2;
        long BOdd = m % 2 == 1 ? m / 2 + 1 : m / 2;
        long BEven = m / 2;
        return AOdd * BEven + AEven * BOdd;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n, m;

        // Continuously read input lines until EOF
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            // Read the two integers
            String[] parts = line.split(" ");
            n = Integer.parseInt(parts[0]);
            m = Integer.parseInt(parts[1]);

            // Call the solution function and print the result
            System.out.println(solution.flowerGame(n, m));
        }

        scanner.close();
    }
}
```

This Java code does the same thing as the original C++ code. It reads two integers `n` and `m` from each line of the standard input, calls the `flowerGame` method of the `Solution` class with these two integers, and prints the result. The `flowerGame` method calculates and returns the result of the expression `AOdd * BEven + AEven * BOdd`, where `AOdd`, `AEven`, `BOdd`, and `BEven` are derived from `n` and `m` in the same way as in the original C++ code.