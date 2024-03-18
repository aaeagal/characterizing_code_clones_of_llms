Here is the Java version of the given C++ code:

```java
import java.util.*;

class Solution {
    public long flowerGame(int n, int m) {
        long AOdd = n % 2 == 1 ? n / 2 + 1 : n / 2;
        long AEven = n / 2;
        long BOdd = m % 2 == 1 ? m / 2 + 1 : m / 2;
        long BEven = m / 2;
        return AOdd * BEven + AEven * BOdd;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            int n = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);
            
            System.out.println(solution.flowerGame(n, m));
        }

        scanner.close();
    }
}
```

This Java version does the same thing as the C++ version: it reads pairs of integers from the standard input and for each pair, it calls the `flowerGame` method and prints the result. Note that in Java, we use the `Scanner` class to read from the standard input and we use `System.out.println` to print to the standard output.