Here is a Java semantic code clone of the provided Python code:

```java
import java.util.Scanner;

class Solution {
    public int flowerGame(int n, int m) {
        return m * n / 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // Create a Scanner object for reading inputs
        Scanner scanner = new Scanner(System.in);
        // Read the input string, split it into two parts and convert them to integers
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        // Print the result of the flowerGame method
        System.out.println(sol.flowerGame(n, m));
        // Close the scanner
        scanner.close();
        // Exit the program
        System.exit(0);
    }
}
```

This Java code does the same thing as the Python code. It defines a `Solution` class with a `flowerGame` method that multiplies two integers and divides the result by 2. The `main` method reads two integers from the standard input, calls the `flowerGame` method with these integers, and prints the result. After that, it closes the scanner and exits the program.