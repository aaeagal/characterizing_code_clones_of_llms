Here is a Java semantic code clone of the provided C++ code:

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
This Java code does the same thing as the provided C++ code. It defines a `Solution` class with a `flowerGame` method, and a `main` method that reads pairs of integers from the input, calls the `flowerGame` method with these integers, and prints the result. The `flowerGame` method calculates and returns the result of a certain mathematical operation involving the input integers.