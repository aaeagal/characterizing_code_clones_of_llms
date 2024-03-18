Here is the Java version of the above C++ code:

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
            String[] numbers = line.split(" ");

            // Read the two integers
            int n = Integer.parseInt(numbers[0]);
            int m = Integer.parseInt(numbers[1]);

            // Call the solution function and print the result
            System.out.println(solution.flowerGame(n, m));
        }

        scanner.close();
    }
}
```

In this Java version, we use `Scanner` to read from standard input, and `System.out.println` to write to standard output. The `flowerGame` function is very similar to the C++ version, but with Java syntax.