Here is the Java version of the same code.

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()) {
            String line = input.nextLine();
            String[] values = line.split(" ");
            int n = Integer.parseInt(values[0]);
            int m = Integer.parseInt(values[1]);
            System.out.println(flowerGame(n, m));
        }
        input.close();
    }

    public static long flowerGame(int n, int m) {
        long AOdd = (n % 2 == 1) ? (n / 2) + 1 : n / 2;
        long AEven = n / 2;
        long BOdd = (m % 2 == 1) ? (m / 2) + 1 : m / 2;
        long BEven = m / 2;
        return AOdd * BEven + AEven * BOdd;
    }
}
```
This code will do exactly the same as the C++ code you provided. It creates a main function that reads from standard input until EOF. It then splits the line by spaces and parses the integer values and passes them to the `flowerGame` method. 

The function calculates and returns a value based on the algorithm given in the C++ version. Following Java naming conventions, I have also named the methods and variables in camelCase.