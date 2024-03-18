Below is the Java semantic code clone of the provided C++ code:

```java
import java.util.Scanner;

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

        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split(" ");

            int n = Integer.parseInt(line[0]);
            int m = Integer.parseInt(line[1]);

            System.out.println(flowerGame(n, m));
        }

        scanner.close();
    }
}
```

In the Java version:

- The `Solution` class is made `public`.
- The `flowerGame` method is made `static` so it can be called from the `static` `main` method without creating an instance of the `Solution` class.
- The `main` method uses a `Scanner` to read lines of input from `System.in`.
- The `Scanner`'s `hasNextLine` method is used to determine when to stop reading input.
- The `Scanner`'s `nextLine` method is used to read a line of input, which is then split into an array of `String`s using the `split` method.
- The `Integer.parseInt` method is used to convert the `String`s to `int`s.
- The `System.out.println` method is used to print the result of the `flowerGame` method.