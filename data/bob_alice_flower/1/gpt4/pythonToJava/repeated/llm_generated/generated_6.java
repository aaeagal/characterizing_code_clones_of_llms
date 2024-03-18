Below is the converted Java code from the given Python code.

```java
import java.util.Scanner;

public class Solution {
    public int flowerGame(int n, int m) {
        return m * n / 2;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // Create a Scanner to read from standard input
        Scanner scanner = new Scanner(System.in);
        // Split the input string into two parts and convert them to integers
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);

        System.out.println(sol.flowerGame(n, m));
        // In Java, there's usually no need to explicitly exit the program
        // System.exit(0);
    }
}
```

Please note that Java does integer division by default, so there's no need for the double slash `//` in the original Python code.