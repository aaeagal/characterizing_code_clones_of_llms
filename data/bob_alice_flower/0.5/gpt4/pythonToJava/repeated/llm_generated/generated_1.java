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

In this Java code, I've defined a `Solution` class with a `flowerGame` method that takes two integers as arguments and returns their product divided by 2. The `main` method is inside the `Main` class. It creates an instance of `Solution`, reads a line from the standard input, splits it into two parts, converts them to integers, and then calls the `flowerGame` method with these integers. The result is printed to the standard output. The program then exits with a status code of 0.