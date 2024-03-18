Here is a Java version of the given C++ code:

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
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int m = Integer.parseInt(line[1]);

            System.out.println(solution.flowerGame(n, m));
        }
    }
}
```

In this Java version, we use the `Scanner` class for reading the input from the standard input. The `hasNextLine` method is used to check if there is another line to read and the `nextLine` method is used to read that line. The line is then split into an array of strings and each string is parsed to an integer. The `flowerGame` method is then called with these integers and the result is printed to the standard output.