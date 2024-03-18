Here is a Java semantic version of the provided Python code:

```java
import java.util.Scanner;

public class Solution {

    public static int flowerGame(int n, int m) {
        return m * n / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        // Split the input string into two parts and convert them to integers
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(flowerGame(n, m));
        sc.close();
        System.exit(0);
    }

} 
```
In this Java version, the `input()` function from Python is replaced with a `Scanner` to read the input from the user. Also, the Python division operator `//` which performs floor division is replaced with normal division operator `/` in Java.