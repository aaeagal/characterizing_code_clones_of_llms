In Java, the equivalent code would look like the code provided below. Note that Java does not have a direct equivalent to Python's input() function, so the Java code makes use of the Scanner object to read user input.

```java
import java.util.Scanner;

public class Solution {
    public int flowerGame(int n, int m) {
        return m * n / 2;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // Scanner object to read user's input
        Scanner scanner = new Scanner(System.in);

        // Read n and m values from user
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(sol.flowerGame(n, m));
        System.exit(0);
    }
}
```

This Java code performs the analogous functionality to the provided Python code. Specifically, it defines a function "flowerGame" that multiplies two input integers and divides the product by 2. It then uses a Scanner to capture two integers as inputs from the user, and prints the output of the "flowerGame" function when these integers are inputted. It terminates with a System exit command.