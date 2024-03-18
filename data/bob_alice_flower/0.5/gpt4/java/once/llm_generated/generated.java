1.
```java
import java.util.Scanner;
class Main {
    private long flowerGame(int n, int m) {
        int oddN = (n + 1) / 2, oddM = (m + 1) / 2;
        int evenN = n / 2, evenM = m / 2;
        return oddN * 1L * evenM + oddM * 1L * evenN;
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(main.flowerGame(n, m));
        scanner.close();
        System.exit(0);   
    }
}
```
2.
```java
import java.util.Scanner;
public class Game {
    long flowerGame(int n, int m) {
        int oddN = (n + 1) / 2, oddM = (m + 1) / 2;
        int evenN = n / 2, evenM = m / 2;
        return oddN * 1L * evenM + oddM * 1L * evenN;
    }
    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(game.flowerGame(n, m));
        scanner.close();
        System.exit(0);
    }
}
```
3.
```java
import java.util.Scanner;
class FlowerGame {
    private long computeGame(int n, int m) {
        int oddN = (n + 1) / 2, oddM = (m + 1) / 2;
        int evenN = n / 2, evenM = m / 2;
        return oddN * 1L * evenM + oddM * 1L * evenN;
    }
    public static void main(String[] args) {
        FlowerGame flowerGame = new FlowerGame();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(flowerGame.computeGame(n, m));
        scanner.close();
        System.exit(0);   
    }
}
```
4.
```java
import java.util.Scanner;
class Solution {
    public long flowerGame(int n, int m) {
        int oddCountN = (n + 1) / 2, oddCountM = (m + 1) / 2;
        int evenCountN = n / 2, evenCountM = m / 2;
        long result = oddCountN * 1L * evenCountM + oddCountM * 1L * evenCountN;
        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(sol.flowerGame(n, m));
        scanner.close();
        System.exit(0);   
    }
}
```
5.
```java
import java.util.Scanner;
class Solution {
    public long flowerGame(int n, int m) {
        int oddCountN = (n + 1) / 2;
        int oddCountM = (m + 1) / 2;
        int evenCountN = n / 2;
        int evenCountM = m / 2;
        return oddCountN * 1L * evenCountM + oddCountM * 1L * evenCountN;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(sol.flowerGame(n, m));
        scanner.close();
        System.exit(0);   
    }
}
```
6.
```java
import java.util.Scanner;
class Solution {
    public long flowerGame(int n, int m) {
        int oddCountN = (n + 1) / 2, oddCountM = (m + 1) / 2;
        int evenCountN = n / 2, evenCountM = m / 2;
        return oddCountN * (long)evenCountM + oddCountM * (long)evenCountN;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(sol.flowerGame(n, m));
        scanner.close();
        System.exit(0);   
    }
}
```
7.
```java
import java.util.Scanner;
class Solution {
    public long flowerGame(int n, int m) {
        int oddCountN = (n + 1) / 2;
        int oddCountM = (m + 1) / 2;
        int evenCountN = n / 2;
        int evenCountM = m / 2;
        long result = oddCountN * 1L * evenCountM;
        result += oddCountM * 1L * evenCountN;
        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(sol.flowerGame(n, m));
        scanner.close();
        System.exit(0);   
    }
}
```
8.
```java
import java.util.Scanner;
class Solution {
    public long flowerGame(int n, int m) {
        int oddCountN = (n + 1) / 2, oddCountM = (m + 1) / 2;
        int evenCountN = n / 2, evenCountM = m / 2;
        long result = oddCountN * 1L * evenCountM;
        result = result + oddCountM * 1L * evenCountN;
        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(sol.flowerGame(n, m));
        scanner.close();
        System.exit(0);   
    }
}
```
9.
```java
import java.util.Scanner;
class Solution {
    public long flowerGame(int n, int m) {
        int oddCountN = (n + 1) / 2, oddCountM = (m + 1) / 2;
        int evenCountN = n / 2, evenCountM = m / 2;
        long result = oddCountN * 1L * evenCountM;
        result = result + oddCountM * 1L * evenCountN;
        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(sol.flowerGame(n, m));
        scanner.close();
        System.exit(0);   
    }
}
```
10.
```java
import java.util.Scanner;
class Solution {
    public long flowerGame(int n, int m) {
        int oddCountN = (n + 1) / 2, oddCountM = (m + 1) / 2;
        int evenCountN = n / 2, evenCountM = m / 2;
        long result = oddCountN * 1L * evenCountM;
        result = result + oddCountM * 1L * evenCountN;
        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(sol.flowerGame(n, m));
        scanner.close();
        System.exit(0);   
    }
}
```
11.
```java
import java.util.Scanner;
class Solution {
    public long flowerGame(int n, int m) {
        int oddCountN = (n + 1) / 2, oddCountM = (m + 1) / 2;
        int evenCountN = n / 2, evenCountM = m / 2;
        return oddCountN * 1L * evenCountM + oddCountM * 1L * evenCountN;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(sol.flowerGame(n, m));
        scanner.close();
        System.exit(0);   
    }
}
```
12.
```java
import java.util.Scanner;
class Solution {
    public long flowerGame(int n, int m) {
        int oddCountN = (n + 1) / 2, oddCountM = (m + 1) / 2;
        int evenCountN = n / 2, evenCountM = m / 2;
        return oddCountN * 1L * evenCountM + oddCountM * 1L * evenCountN;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(sol.flowerGame(n, m));
        scanner.close();
        System.exit(0);   
    }
}
```
13.
```java
import java.util.Scanner;
class Solution {
    public long flowerGame(int n, int m) {
        int oddCountN = (n + 1) / 2, oddCountM = (m + 1) / 2;
        int evenCountN = n / 2, evenCountM = m / 2;
        return oddCountN * 1L * evenCountM + oddCountM * 1L * evenCountN;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(sol.flowerGame(n, m));
        scanner.close();
        System.exit(0);   
    }
}
```
14.
```java
import java.util.Scanner;
class Solution {
    public long flowerGame(int n, int m) {
        int oddCountN = (n + 1) / 2, oddCountM = (m + 1) / 2;
        int evenCountN = n / 2, evenCountM = m / 2;
        return oddCountN * 1L * evenCountM + oddCountM * 1L * evenCountN;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(sol.flowerGame(n, m));
        scanner.close();
        System.exit(0);   
    }
}
```
15.
```java
import java.util.Scanner;
class Solution {
    public long flowerGame(int n, int m) {
        int oddCountN = (n + 1) / 2, oddCountM = (m + 1) / 2;
        int evenCountN = n / 2, evenCountM = m / 2;
        return oddCountN * 1L * evenCountM + oddCountM * 1L * evenCountN;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(sol.flowerGame(n, m));
        scanner.close();
        System.exit(0);   
    }
}
```
16.
```java
import java.util.Scanner;
class Solution {
    public long flowerGame(int n, int m) {
        int oddCountN = (n + 1) / 2, oddCountM = (m + 1) / 2;
        int evenCountN = n / 2, evenCountM = m / 2;
        return oddCountN * 1L * evenCountM + oddCountM * 1L * evenCountN;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(sol.flowerGame(n, m));
        scanner.close();
        System.exit(0);   
    }
}
```
17.
```java
import java.util.Scanner;
class Solution {
    public long flowerGame(int n, int m) {
        int oddCountN = (n + 1) / 2, oddCountM = (m + 1) / 2;
        int evenCountN = n / 2, evenCountM = m / 2;
        return oddCountN * 1L * evenCountM + oddCountM * 1L * evenCountN;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(sol.flowerGame(n, m));
        scanner.close();
        System.exit(0);   
    }
}
```
18.
```java
import java.util.Scanner;
class Solution {
    public long flowerGame(int n, int m) {
        int oddCountN = (n + 1) / 2, oddCountM = (m + 1) / 2;
        int evenCountN = n / 2, evenCountM = m / 2;
        return oddCountN * 1L * evenCountM + oddCountM * 1L * evenCountN;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(sol.flowerGame(n, m));
        scanner.close();
        System.exit(0);   
    }
}
```
19.
```java
import java.util.Scanner;
class Solution {
    public long flowerGame(int n, int m) {
        int oddCountN = (n + 1) / 2, oddCountM = (m + 1) / 2;
        int evenCountN = n / 2, evenCountM = m / 2;
        return oddCountN * 1L * evenCountM + oddCountM * 1L * evenCountN;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(sol.flowerGame(n, m));
        scanner.close();
        System.exit(0);   
    }
}
```
20.
```java
import java.util.Scanner;
class Solution {
    public long flowerGame(int n, int m) {
        int oddCountN = (n + 1) / 2, oddCountM = (m + 1) / 2;
        int evenCountN = n / 2, evenCountM = m / 2;
        return oddCountN * 1L * evenCountM + oddCountM * 1L * evenCountN;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(sol.flowerGame(n, m));
        scanner.close();
        System.exit(0);   
    }
}
```