Below is a Java semantic code clone of the given C++ code:

```java
import java.util.*;

public class Solution {
    public long flowerGame(int n, int m) {
        long AOdd = n % 2 == 1 ? n / 2 + 1 : n / 2;
        long AEven = n / 2;
        long BOdd = m % 2 == 1 ? m / 2 + 1 : m / 2;
        long BEven = m / 2;
        return AOdd * BEven + AEven * BOdd;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner in = new Scanner(System.in);

        // Continuously read input lines until EOF
        while (in.hasNext()) {
            String line = in.nextLine();
            String[] integers = line.split(" ");
            int n = Integer.parseInt(integers[0]);
            int m = Integer.parseInt(integers[1]);

            // Call the solution method and print the result
            System.out.println(solution.flowerGame(n, m));
        }
        
        in.close();
    }
}
```

Please note that Java doesn't have a direct equivalent to C++'s `EOF`, so I used `Scanner.hasNext()` to mimic the behavior of continuously reading input lines until there are no more.