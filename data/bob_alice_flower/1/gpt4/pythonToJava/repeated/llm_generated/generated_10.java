Here is the Java code semantic clone of the Python code you posted:

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
        
        // Scanner object to get the user inputs
        Scanner sc = new Scanner(System.in);
        
        // Get the two inputs from the user
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // Print the result of the flower game
        System.out.println(sol.flowerGame(n, m));
        
        // Close the Scanner
        sc.close();
        
        // Terminate the JVM
        System.exit(0);
    }
}
```

Just like with the Python implementation, this Java semantic clone makes use of a class `Solution` with a method `flowerGame` that takes in two integers and returns the value of their multiplication divided by 2. In the `main` method, two integers are read from the standard input using Scanner and passed to the `flowerGame` method. The result of this method call is then printed to the standard output. The program then exits with a status code of 0.