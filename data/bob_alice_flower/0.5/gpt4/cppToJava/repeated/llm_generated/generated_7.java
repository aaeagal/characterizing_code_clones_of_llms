Here is the Java equivalent code for the given C++ code.

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
            String[] parts = line.split(" ");

            // Read the two integers
            n = Integer.parseInt(parts[0]);
            m = Integer.parseInt(parts[1]);

            // Call the solution function and print the result
            System.out.println(solution.flowerGame(n, m));
        }
    }
}
```

The main changes in the Java version are the use of the `Scanner` class for reading input, the `split` method to split the input line into two parts, and the `Integer.parseInt` method to convert the string parts into integers. The `System.out.println` method is used to print the result.