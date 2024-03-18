Here is your semantically equivalent code in Java:

```java
import java.util.*;

public class Solution {
    public int flowerGame(int n, int m) {
        return m * n / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Split the input string into two parts and convert them to integers
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        Solution sol = new Solution();
        System.out.println(sol.flowerGame(n, m));
        System.exit(0);
    }
}
```

Please note that // operator in Python performs integer division where the result of the division will always be an integer. The equivalent operator in Java is the / operator when two integers are divided.