Below is a Java equivalent of your Python code:

```java
import java.util.Scanner;

public class Solution {
    public int flowerGame(int n, int m) {
        return m * n / 2;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        
        // Split the input string into two parts and convert them to integers
        String[] inputs = sc.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        
        System.out.println(sol.flowerGame(n, m));
    }
}
```
Please note few things:

1. Python's floor division operator `//` has been replaced with `/` in Java. It is because in Java, integer division automatically floors the result.

2. There is no direct equivalent of `sys.exit(0)` in Java because normally Java applications automatically terminate when all non-daemon threads have completed. If you really need an equivalent thing, you can use `System.exit(0);` but it is highly not recommended for normal use as it terminates the JVM abruptly. 

3. I used `Scanner` for reading the input from user. Make sure the input is entered in the format "number number" (e.g. "3 4").

4. In java you have to wrap the code inside a class and the class usually saved in a file with the same name as the class (with `.java` extension). In this case you need to save the code inside a `Solution.java` file.

5. Make sure the first letter of class name ('Solution') is in UpperCase, this is naming convention for classes in Java.

You might need to handle exceptions for edge cases (e.g., if the inputs are not integers or are not in right format) based on your requirements.