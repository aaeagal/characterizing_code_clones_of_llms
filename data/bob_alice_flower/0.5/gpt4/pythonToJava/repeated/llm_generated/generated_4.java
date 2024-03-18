Here is the Java semantic code clone of the Python code:

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

This Java code does the same thing as the Python code. It defines a class `Solution` with a method `flowerGame` that multiplies two integers and divides the result by 2. The `main` method creates an instance of `Solution`, takes a line of input, splits it into two strings, converts those strings to integers, and prints the result of calling `flowerGame` with those integers. It then exits the program.