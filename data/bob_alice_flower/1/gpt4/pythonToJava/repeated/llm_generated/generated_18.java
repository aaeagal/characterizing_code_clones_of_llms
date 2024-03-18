Here is a Java version that performs the same function:

```java
import java.util.Scanner;

public class Solution {
    public int flowerGame(int n, int m) {
        return (m * n) / 2;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        // Use a scanner to get the input from the user
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        // Split the input string into two parts and convert them to integers
        String[] inputs = input.split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        System.out.println(sol.flowerGame(n, m));
        System.exit(0);
    }
}
```

This Java code is a semantic equivalent of your provided Python code. It first establishes the "Solution" class with the "flowerGame" method returning the integer value of `(m * n) / 2`. In the "main" method, it changes the input to an integer, runs the "flowerGame" method with the provided input, and prints out the returned result. The `System.exit(0);` line then ensures that the program terminates after printing the result.