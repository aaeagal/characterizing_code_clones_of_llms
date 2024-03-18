Here is the Java semantic code clone:

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
            String[] parts = line.split("\\s+");
            int n = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);

            // Call the solution function and print the result
            System.out.println(solution.flowerGame(n, m));
        }

        scanner.close();
    }
}
```
The Java version uses the `Scanner` class to read input from the console. The `hasNextLine()` method is used to check if there is another line to read, and `nextLine()` is used to read the next line. The line is then split into parts using the `split()` method, and the parts are converted to integers using `Integer.parseInt()`. The `flowerGame()` method is called with these integers as arguments, and the result is printed to the console using `System.out.println()`.