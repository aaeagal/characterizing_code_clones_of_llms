Here is a Java clone of the provided Python code:

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
        
        // in java, there is no need to call explicit exit command
        // once execution done, it automatically exits
        // so, below line is not needed in java
        // System.exit(0);
    }
}
```
This Java program does the exact same job as the Python code: It takes two space-separated integers from the user as input and uses the `flowerGame` method from the `Solution` class to multiply them and then divide the result by 2 before printing it.