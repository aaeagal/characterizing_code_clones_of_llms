Here's the Java version of your C++ code:

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

        // Continuously read input lines until EOF
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

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

In this Java version, the `Solution` class and its `flowerGame` method are the same as in the C++ version. The `main` method is different because Java uses different classes and methods for input and output. It uses a `Scanner` to read lines from the standard input and `System.out.println` to print to the standard output. The `main` method also splits each line into two parts and converts them to integers before calling `flowerGame`.