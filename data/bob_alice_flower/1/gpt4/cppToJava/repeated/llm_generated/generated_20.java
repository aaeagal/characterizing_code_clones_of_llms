Below is the Java semantic code clone of your C++ code:

```java
import java.util.*;

public class Solution {
    public static long flowerGame(int n, int m) {
        long AOdd = n % 2 == 1 ? n / 2 + 1 : n / 2;
        long AEven = n / 2;
        long BOdd = m % 2 == 1 ? m / 2 + 1 : m / 2;
        long BEven = m / 2;
        return AOdd * BEven + AEven * BOdd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        int n, m;
    
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
    
            // Read the two integers from each line
            String[] tokens = line.split(" ");
            n = Integer.parseInt(tokens[0]);
            m = Integer.parseInt(tokens[1]);
    
            // Call the solution function and print the result
            System.out.println(flowerGame(n, m));
        }
    
        scanner.close();
    }
}
```

Keep in mind that the Java counterpart uses the Scanner class to read from standard input. The `Scanner.hasNextLine()` method is a boolean function that's true if the scanner has another line of input.
`split(" ")` is used to break the line into individual words(i.e. integers in this case). `parseInt(String)` is used to convert a String(the integers in this case) to an int. The `println()` function is used to print out the result of `flowerGame(n, m)` to the terminal. Finally, we close the scanner object using `scanner.close()` to prevent a memory leak.