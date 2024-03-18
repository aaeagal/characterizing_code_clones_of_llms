Below is the Java semantic code clone of the provided C++ code:

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

            // Read the two integers assign them to n and m
            String[] inputs = line.split(" ");
            n = Integer.parseInt(inputs[0]);
            m = Integer.parseInt(inputs[1]);

            // Call the solution function and print the result
            System.out.println(solution.flowerGame(n, m));
        }

        scanner.close();
    }
}
```
Note: This Java code will continue reading from the standard input until an EOF (end-of-file) signal is received (i.e., you press Ctrl+D in the console). It splits the input line into two strings, converts them to integers (n and m), and then calls the solution function with these values as parameters.