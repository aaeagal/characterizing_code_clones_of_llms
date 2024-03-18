Here is a Java semantic code clone of the provided C++ code:

```java
import java.util.Scanner;

class Solution {
    long flowerGame(int n, int m) {
        long AOdd = n % 2 == 1 ? n / 2 + 1 : n / 2;
        long AEven = n / 2;
        long BOdd = m % 2 == 1 ? m / 2 + 1 : m / 2;
        long BEven = m / 2;
        return AOdd * BEven + AEven * BOdd;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");

            try {
                int n = Integer.parseInt(parts[0]);
                int m = Integer.parseInt(parts[1]);

                System.out.println(solution.flowerGame(n, m));
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input!");
            }
        }
    }
}
```

This Java code does the same thing as the original C++ code: It reads lines from the standard input. Each line is expected to contain two integers, separated by a space. For each line, it calls the `flowerGame` method with the two integers and prints the result. If the input line was not in the expected format, it prints an error message.