Here is the Java code that has similar functionality with the provided C++ code:

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

        // Continuously read input lines until EOF
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();

            String[] numbers = line.split(" ");
            int n = Integer.parseInt(numbers[0]);
            int m = Integer.parseInt(numbers[1]);

            // Call the solution function and print the result
            System.out.println(solution.flowerGame(n, m));
        }

        scanner.close();
    }
}
```

In this Java code, a `Scanner` is used for reading the inputs, which has similar functionality with `std::getline` and `std::istringstream` used in the provided C++ code. The integers `n` and `m` are read from each line and parsed from a `String` split by a space. When there's not anything left from the `Scanner`, the loop will break. Then at the end, the `Scanner` is closed properly.