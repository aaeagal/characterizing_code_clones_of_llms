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

This Java code does the same thing as the Python code. It defines a class `Solution` with a method `flowerGame()`, which takes two integers `n` and `m` and returns the integer result of the expression `m * n / 2`. The `main()` method creates an instance of `Solution`, takes user input, splits it into two parts, converts them to integers, and then calls `flowerGame()` with these integers. The result is printed to the console.