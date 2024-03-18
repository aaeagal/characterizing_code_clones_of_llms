Here is the Java semantic code clone of the provided C++ code:

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
            String[] splitLine = line.split(" ");
            int n = Integer.parseInt(splitLine[0]);
            int m = Integer.parseInt(splitLine[1]);

            // Call the solution function and print the result
            System.out.println(solution.flowerGame(n, m));
        }

        scanner.close();
    }
}
```

This code does the same thing as the original C++ code, but in Java. It defines a `Solution` class with a `flowerGame` method, and a `main` method that reads input lines until EOF, parses two integers from each line, and prints the result of calling `flowerGame` with these integers.