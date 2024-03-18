In Java, the equivalent code would be:

```java
import java.util.Scanner;

class Solution {
    int flowerGame(int n, int m) {
        return m * n / 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        // Split the input string into two parts and convert them to integers
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(sol.flowerGame(n, m));
        System.exit(0);
    }
}
```

This code is functionally identical to the original Python code. It prompts the user for two inputs, sends them to the `flowerGame` method of a Solution object, and then prints the result. After that, it ends the program.