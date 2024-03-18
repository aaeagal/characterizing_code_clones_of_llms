Here is a Java semantic code clone of the given C++ code:

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

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");

            int n = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);

            System.out.println(solution.flowerGame(n, m));
        }

        scanner.close();
    }
}
```

This Java code does the same thing as the C++ code. It defines a class `Solution` with a method `flowerGame` that takes two integers `n` and `m` as input and returns a long. The `flowerGame` method calculates and returns the result of a mathematical expression involving `n` and `m`.

The `main` method creates an instance of `Solution`, then enters a loop that reads lines of input. Each line is split into two parts, which are converted to integers and passed to the `flowerGame` method. The result is then printed. The loop continues until there are no more lines of input.