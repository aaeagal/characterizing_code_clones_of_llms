Here is the equivalent Java code:

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

            // Read the two integers
            String[] numbers = line.split(" ");
            int n = Integer.parseInt(numbers[0]);
            int m = Integer.parseInt(numbers[1]);

            // Call the solution function and print the result
            System.out.println(solution.flowerGame(n, m));
        }

        scanner.close();
    }
}
```

This Java code does the same thing as the C++ code. It reads two integers from each line of the input, calls the `flowerGame` method with these integers, and prints the result. The `flowerGame` method itself is a direct translation of the C++ method, using the same logic and the same variable names.