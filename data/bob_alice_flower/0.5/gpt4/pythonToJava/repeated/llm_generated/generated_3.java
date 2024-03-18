Here is the Java semantic code clone of the Python code you provided:

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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(sol.flowerGame(n, m));
        System.exit(0);
    }
}
```

This Java code does the same thing as the Python code. It defines a class `Solution` with a method `flowerGame` that takes two integers and returns their product divided by 2. The `main` method creates an instance of `Solution`, reads two integers from the standard input, and prints the result of calling `flowerGame` with these integers. It then terminates the program.