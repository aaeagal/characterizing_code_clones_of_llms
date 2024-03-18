Here is a Java semantic code clone of the given C++ code:

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
            String[] numbers = line.split(" ");
            n = Integer.parseInt(numbers[0]);
            m = Integer.parseInt(numbers[1]);

            // Call the solution function and print the result
            System.out.println(solution.flowerGame(n, m));
        }

        scanner.close();
    }
}
```

This Java code does the same thing as the C++ code. It reads two integers from each input line and uses them as arguments to call the `flowerGame` method of the `Solution` class. The result is then printed to the console. The `flowerGame` method calculates and returns the same value as in the C++ code.