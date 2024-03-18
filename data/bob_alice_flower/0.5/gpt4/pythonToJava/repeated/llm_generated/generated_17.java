Here is the Java equivalent of the Python code:

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

This Java code does the same thing as the Python code. It defines a `Solution` class with a `flowerGame` method, and a `Main` class with a `main` method. The `main` method creates a `Solution` object, reads two integers from the standard input, calls the `flowerGame` method with these integers, and prints the result. The `flowerGame` method simply multiplies the two integers and divides the result by 2.