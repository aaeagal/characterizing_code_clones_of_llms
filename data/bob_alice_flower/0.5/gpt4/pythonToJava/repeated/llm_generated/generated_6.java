Here is a Java version of the Python code you provided:

```java
import java.util.Scanner;

public class Solution {
    public int flowerGame(int n, int m) {
        return m * n / 2;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // Create a Scanner object to read inputs
        Scanner scanner = new Scanner(System.in);
        // Split the input string into two parts and convert them to integers
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        System.out.println(sol.flowerGame(n, m));
        System.exit(0);
    }
}
```

This Java code does the same thing as the Python code. It defines a class `Solution` with a method `flowerGame` that takes two integers and returns their product divided by 2. The `main` method creates an instance of `Solution`, reads two integers from the standard input, calls `flowerGame` with these integers, and prints the result.