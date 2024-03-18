Below is the Java semantic code clone of the given C++ code:

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
        String line;
        int n, m;

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            String[] parts = line.split(" ");
            n = Integer.parseInt(parts[0]);
            m = Integer.parseInt(parts[1]);

            System.out.println(solution.flowerGame(n, m));
        }
        scanner.close();
    }
}
```
This Java code does the same thing as the C++ code. It defines a `flowerGame` method that performs some calculations based on two input integers. In the `main` method, it continuously reads input lines until EOF, splits the line into two parts, converts those parts to integers, calls the `flowerGame` method with those integers, and prints the result.