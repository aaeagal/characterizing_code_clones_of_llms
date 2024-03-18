Here is a Java semantic code clone of the Python code you provided:

```java
import java.util.Scanner;

class Solution {
    public int flowerGame(int n, int m) {
        return (m * n) / 2;
    }
  
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String inputs[] = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        System.out.print(sol.flowerGame(n, m));
        System.exit(0);
    }
}
```

A couple of differences between Python and Java that are worth noting in this implementation:

1. We need to import `java.util.Scanner` in Java to read user input, there is no built-in function like Python's `input()`.

2. Java doesn't explicitly define function return and input types in the method declaration. For example Python's `n: int, m: int -> int` becomes `(int n, int m)` in Java.

3. System.exit(0) is the way to exit out of the program, with `0` signaling the successful completion.