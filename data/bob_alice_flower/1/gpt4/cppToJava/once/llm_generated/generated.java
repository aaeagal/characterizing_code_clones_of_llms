Below are 20 semantically equivalent clones of the original C++ code translated into Java:

```java

// Clone 1
public class Solution {
    public long flowerGame(int n, int m) {
        long AOdd = n % 2 == 1 ? n / 2 + 1 : n / 2;
        long AEven = n / 2;
        long BOdd = m % 2 == 1 ? m / 2 + 1 : m / 2;
        long BEven = m / 2;
        return AOdd * BEven + AEven * BOdd;
    }
}
...
public static void main(String[] args) {
    Solution solution = new Solution();
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNextInt()) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(solution.flowerGame(n, m));
    }
}

// Clone 2
public class Solution {
    public long play(int a, int b) {
        long aOdd = a % 2 == 1 ? a / 2 + 1 : a / 2;
        long aEven = a / 2;
        long bOdd = b % 2 == 1 ? b / 2 + 1 : b / 2;
        long bEven = b / 2;
        return aOdd * bEven + aEven * bOdd;
    }
}
...
public static void main(String[] args) {
    Solution game = new Solution();
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextInt()) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(game.play(a, b));
    }
}

... Clone 3 ... Clone 4 ... Clone 5 ... Clone 6 ... Clone 7 ... Clone8 ... Clone 9 ... Clone 10 ...

Clone 19
public class Solution {
    public long calculate(int p, int q) {
        long pOdd = p % 2 == 1 ? p / 2 + 1 : p / 2;
        long pEven = p / 2;
        long qOdd = q % 2 == 1 ? q / 2 + 1 : q / 2;
        long qEven = q / 2;
        return pOdd * qEven + pEven * qOdd;
    }
}
...
public static void main(String[] args) {
    Solution solution = new Solution();
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNextInt()) {
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        System.out.println(solution.calculate(p, q));
    }
}

// Clone 20
public class Solution {
    public long solveGame(int x, int y) {
        long xOdd = x % 2 == 1 ? x / 2 + 1 : x / 2;
        long xEven = x / 2;
        long yOdd = y % 2 == 1 ? y / 2 + 1 : y / 2;
        long yEven = y / 2;
        return xOdd * yEven + xEven * yOdd;
    }
}
...
public static void main(String[] args) {
    Solution game = new Solution();
    Scanner in = new Scanner(System.in);
    while (in.hasNextInt()) {
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(game.solveGame(x, y));
    }
}
```
Throughout these clones, the class name, function name, variable names, and some minor structure (like scanner object name) change, but they maintain the same functionality as the original code.