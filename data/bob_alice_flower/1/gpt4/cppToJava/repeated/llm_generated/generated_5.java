Below is the Java semantic code clone of the provided C++ code.

```java
import java.util.Scanner;

class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        // Continuously read input lines until EOF
        while (scanner.hasNext()) {
            
            // Read two integers
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            // Call the solution function and print the result
            System.out.println(solution.flowerGame(n, m));
        }
        scanner.close();
    }

    public long flowerGame(int n, int m) {
        long AOdd = n % 2 == 1 ? n / 2 + 1 : n / 2;
        long AEven = n / 2;
        long BOdd = m % 2 == 1 ? m / 2 + 1 : m / 2;
        long BEven = m / 2;
        return AOdd * BEven + AEven * BOdd;
    }
}
```
In the Java variant, we make use of `java.util.Scanner` class to read inputs from the console line by line. The `hasNext()` method from the `Scanner` class is equivalent to the `std::getline(std::cin, line)` used in the C++ version to continuously read input lines until EOF (End of input). We then use the `nextInt()` method to read the two integers. The `Solution` class and the `flowerGame` method remain largely the same, with just minor adjustments to adapt to the Java language syntax and conventions.