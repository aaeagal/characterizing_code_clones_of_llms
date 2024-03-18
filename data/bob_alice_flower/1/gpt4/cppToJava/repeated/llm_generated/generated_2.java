Here is the Java version of the provided C++ code:

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

        // Continuously read input lines until no more input
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split("\\s+");
            int n = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);

            // Call the solution function and print the result
            System.out.println(solution.flowerGame(n, m));

        }
    }
}
```

Here are the changes:

- `#include <iostream>` and `#include <sstream>` have been replaced by `import java.util.Scanner;`, as needed for reading from `System.in` in Java.
- The main method signature has been updated to `public static void main(String[] args)`.
- C++ `std::getline(std::cin, line)` has been replaced with `scanner.nextLine()`, as needed in Java.
- `std::istringstream` has been replaced with `line.split("\\s+");`, as it's the way to split a string in Java.
- `std::cout` has been replaced with `System.out.println()`.
- The class `Solution` doesn't need to be marked `public`.