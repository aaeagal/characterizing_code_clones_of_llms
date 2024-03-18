Below is the Java code that has the same functionality as your C++ code:

```java
import java.util.*;

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
        int n, m;

        // Continuously read input lines until EOF
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) break;

            String[] parts = line.split(" ");

            // Read the two integers
            n = Integer.parseInt(parts[0]);
            m = Integer.parseInt(parts[1]);

            // Call the solution function and print the result
            System.out.println(solution.flowerGame(n, m));
        }

        scanner.close();
    }
}
```
In the Java code, the `nextLine()` function of `Scanner` is called until EOF is reached. Then it splits the input line into two parts by space and parses each part as an integer using `Integer.parseInt()`. The `flowerGame` method is then called and the result is printed out.