Here is a Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Solution {
    public int flowerGame(int n, int m) {
        return m * n / 2;
    }

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

In this Java code, we used a `Scanner` object to read the input from the user. The `nextLine()` method of `Scanner` is used to read the whole line of input as a string. Then we split the string into two parts using the `split()` method and convert them to integers using `Integer.parseInt()`. The `flowerGame()` method is the same as in the Python code. The `System.exit(0)` is used to terminate the program.