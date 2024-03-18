Here is a Java implementation of the C++ code you provided, following the same semantic structure:

```java
import java.util.Scanner;
// Required to read from standard input

public class Solution {
    long flowerGame(int n, int m) {
        long AOdd = n % 2 == 1 ? n / 2 + 1 : n / 2;
        long AEven = n / 2;
        long BOdd = m % 2 == 1 ? m / 2 + 1 : m / 2;
        long BEven = m / 2;
        return AOdd * BEven + AEven * BOdd;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n, m;

        // Continuously read input lines until no further input
        while (scanner.hasNextLine()) {
            n = scanner.nextInt();
            m = scanner.nextInt();

            // Call the solution function and print the result
            System.out.println(solution.flowerGame(n, m));
        }
    }
}
```
This Java code does the same job as the C++ code, reading two integers per line of input, calling the `flowerGame` method on each pair, and printing the results. An instance of `Solution` is created to call the non-static `flowerGame` method from the `main` method. Note also that scanner.nextInt automatically skips white spaces and line breaks. This might cause issues if your input has other types of delimiters or if there's extra information on the line.
Note: In Java, "@public" isn't appropriate syntax. Instead use "public" for declaring a public method or class.