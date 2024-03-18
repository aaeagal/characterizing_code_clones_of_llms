Here is your code as a Java solution:

```java
import java.util.Scanner;

public class Solution {
    public int flowerGame(int n, int m) {
        return (m * n) / 2;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // Create a Scanner object to take inputs
        Scanner scanner = new Scanner(System.in);

        // Read the input from user, split it and convert the first part to an integer
        int n = Integer.parseInt(scanner.next());
        // Read the input from user, split it and convert the second part to an integer
        int m = Integer.parseInt(scanner.next());

        System.out.println(sol.flowerGame(n, m));
        scanner.close();
        System.exit(0);
    }
}
```

This code first takes two user inputs 'n' and 'm'. Then, it calls the 'flowerGame' method of the 'Solution' class with these inputs and finally prints the result.