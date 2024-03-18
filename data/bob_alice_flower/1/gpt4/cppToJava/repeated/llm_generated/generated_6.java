The Java code equivalent of the above C++ code would be:

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
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            // Call the solution function and print the result
            System.out.println(solution.flowerGame(n, m));
        }

        scanner.close();
    }
}
```

In Java, we use `Scanner` to read the input. It works differently from `std::getline()` in C++ which reads a single line and then parses the integers. In Java using `Scanner`, we directly scan the next integer in the input. Consequently, this Java code will stop when there are no more integers to read, which might behave differently from the original C++ code under certain circumstances.