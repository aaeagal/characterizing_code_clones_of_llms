Below is the Java semantic code clone for the given C++ code:

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
        String line;

        // Continuously read input lines until EOF
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();

            // Read the two integers
            String[] parts = line.split(" ");
            int n = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);

            // Call the solution function and print the result
            System.out.println(solution.flowerGame(n, m));
        }

        scanner.close();
    }
}
```

This Java code does the same thing as the C++ code. It reads two integers from each line of the input, calls the `flowerGame` method with these integers, and prints the result. The `flowerGame` method itself also does the same calculation as in the C++ code.