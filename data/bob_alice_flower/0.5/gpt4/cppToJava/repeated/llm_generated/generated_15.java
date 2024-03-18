Below is the Java semantic code clone of the provided C++ code:

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

The Java code performs the same operations as the C++ code. It reads two integers from each input line and calls the `flowerGame` method with these integers. The result is then printed to the console. The `flowerGame` method itself also performs the same operations in both languages: it calculates the values of `AOdd`, `AEven`, `BOdd`, and `BEven` based on the input parameters `n` and `m` and returns the result of `AOdd * BEven + AEven * BOdd`.