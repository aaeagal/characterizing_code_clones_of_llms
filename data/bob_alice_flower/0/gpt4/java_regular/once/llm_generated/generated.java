1.
```java
import java.util.Scanner;
class Solution1 {
    public long flowerGame(int a, int b) {
        int oddCountA = (a + 1) / 2, oddCountB = (b + 1) / 2;
        int evenCountA = a / 2, evenCountB = b / 2;
        return oddCountA * 1L * evenCountB + oddCountB * 1L * evenCountA;
    }
    public static void main(String[] args) {
        Solution1 sol1 = new Solution1();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(sol1.flowerGame(a, b));
        scanner.close();
        System.exit(0);   
    }
}
```
2.
```java
import java.util.Scanner;
class Solution2 {
    public long flowerGame(int x, int y) {
        int oddCountX = (x + 1) / 2, oddCountY = (y + 1) / 2;
        int evenCountX = x / 2, evenCountY = y / 2;
        return oddCountX * 1L * evenCountY + oddCountY * 1L * evenCountX;
    }
    public static void main(String[] args) {
        Solution2 sol2 = new Solution2();
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(sol2.flowerGame(x, y));
        scanner.close();
        System.exit(0);   
    }
}
```
3.
```java
import java.util.Scanner;
class Solution3 {
    public long flowerGame(int p, int q) {
        int oddCountP = (p + 1) / 2, oddCountQ = (q + 1) / 2;
        int evenCountP = p / 2, evenCountQ = q / 2;
        return oddCountP * 1L * evenCountQ + oddCountQ * 1L * evenCountP;
    }
    public static void main(String[] args) {
        Solution3 sol3 = new Solution3();
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        System.out.println(sol3.flowerGame(p, q));
        scanner.close();
        System.exit(0);   
    }
}
```
4.
```java
import java.util.Scanner;
class Solution4 {
    public long flowerGame(int i, int j) {
        int oddCountI = (i + 1) / 2, oddCountJ = (j + 1) / 2;
        int evenCountI = i / 2, evenCountJ = j / 2;
        return oddCountI * 1L * evenCountJ + oddCountJ * 1L * evenCountI;
    }
    public static void main(String[] args) {
        Solution4 sol4 = new Solution4();
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        System.out.println(sol4.flowerGame(i, j));
        scanner.close();
        System.exit(0);   
    }
}
```
5.
```java
import java.util.Scanner;
class Solution5 {
    public long flowerGame(int u, int v) {
        int oddCountU = (u + 1) / 2, oddCountV = (v + 1) / 2;
        int evenCountU = u / 2, evenCountV = v / 2;
        return oddCountU * 1L * evenCountV + oddCountV * 1L * evenCountU;
    }
    public static void main(String[] args) {
        Solution5 sol5 = new Solution5();
        Scanner scanner = new Scanner(System.in);
        int u = scanner.nextInt();
        int v = scanner.nextInt();
        System.out.println(sol5.flowerGame(u, v));
        scanner.close();
        System.exit(0);   
    }
}
```
6.
```java
import java.util.Scanner;
class Solution6 {
    public long flowerGame(int s, int t) {
        int oddCountS = (s + 1) / 2, oddCountT = (t + 1) / 2;
        int evenCountS = s / 2, evenCountT = t / 2;
        return oddCountS * 1L * evenCountT + oddCountT * 1L * evenCountS;
    }
    public static void main(String[] args) {
        Solution6 sol6 = new Solution6();
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        System.out.println(sol6.flowerGame(s, t));
        scanner.close();
        System.exit(0);   
    }
}
```
7.
```java
import java.util.Scanner;
class Solution7 {
    public long flowerGame(int k, int l) {
        int oddCountK = (k + 1) / 2, oddCountL = (l + 1) / 2;
        int evenCountK = k / 2, evenCountL = l / 2;
        return oddCountK * 1L * evenCountL + oddCountL * 1L * evenCountK;
    }
    public static void main(String[] args) {
        Solution7 sol7 = new Solution7();
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        System.out.println(sol7.flowerGame(k, l));
        scanner.close();
        System.exit(0);   
    }
}
```
8.
```java
import java.util.Scanner;
class Solution8 {
    public long flowerGame(int r, int s) {
        int oddCountR = (r + 1) / 2, oddCountS = (s + 1) / 2;
        int evenCountR = r / 2, evenCountS = s / 2;
        return oddCountR * 1L * evenCountS + oddCountS * 1L * evenCountR;
    }
    public static void main(String[] args) {
        Solution8 sol8 = new Solution8();
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int s = scanner.nextInt();
        System.out.println(sol8.flowerGame(r, s));
        scanner.close();
        System.exit(0);   
    }
}
```
9.
```java
import java.util.Scanner;
class Solution9 {
    public long flowerGame(int w, int x) {
        int oddCountW = (w + 1) / 2, oddCountX = (x + 1) / 2;
        int evenCountW = w / 2, evenCountX = x / 2;
        return oddCountW * 1L * evenCountX + oddCountX * 1L * evenCountW;
    }
    public static void main(String[] args) {
        Solution9 sol9 = new Solution9();
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int x = scanner.nextInt();
        System.out.println(sol9.flowerGame(w, x));
        scanner.close();
        System.exit(0);   
    }
}
```
10.
```java
import java.util.Scanner;
class Solution10 {
    public long flowerGame(int y, int z) {
        int oddCountY = (y + 1) / 2, oddCountZ = (z + 1) / 2;
        int evenCountY = y / 2, evenCountZ = z / 2;
        return oddCountY * 1L * evenCountZ + oddCountZ * 1L * evenCountY;
    }
    public static void main(String[] args) {
        Solution10 sol10 = new Solution10();
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println(sol10.flowerGame(y, z));
        scanner.close();
        System.exit(0);   
    }
}
```
11.
```java
import java.util.Scanner;
class Solution11 {
    public long flowerGame(int g, int h) {
        int oddCountG = (g + 1) / 2, oddCountH = (h + 1) / 2;
        int evenCountG = g / 2, evenCountH = h / 2;
        return oddCountG * 1L * evenCountH + oddCountH * 1L * evenCountG;
    }
    public static void main(String[] args) {
        Solution11 sol11 = new Solution11();
        Scanner scanner = new Scanner(System.in);
        int g = scanner.nextInt();
        int h = scanner.nextInt();
        System.out.println(sol11.flowerGame(g, h));
        scanner.close();
        System.exit(0);   
    }
}
```
12.
```java
import java.util.Scanner;
class Solution12 {
    public long flowerGame(int d, int e) {
        int oddCountD = (d + 1) / 2, oddCountE = (e + 1) / 2;
        int evenCountD = d / 2, evenCountE = e / 2;
        return oddCountD * 1L * evenCountE + oddCountE * 1L * evenCountD;
    }
    public static void main(String[] args) {
        Solution12 sol12 = new Solution12();
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        System.out.println(sol12.flowerGame(d, e));
        scanner.close();
        System.exit(0);   
    }
}
```
13.
```java
import java.util.Scanner;
class Solution13 {
    public long flowerGame(int f, int g) {
        int oddCountF = (f + 1) / 2, oddCountG = (g + 1) / 2;
        int evenCountF = f / 2, evenCountG = g / 2;
        return oddCountF * 1L * evenCountG + oddCountG * 1L * evenCountF;
    }
    public static void main(String[] args) {
        Solution13 sol13 = new Solution13();
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int g = scanner.nextInt();
        System.out.println(sol13.flowerGame(f, g));
        scanner.close();
        System.exit(0);   
    }
}
```
14.
```java
import java.util.Scanner;
class Solution14 {
    public long flowerGame(int h, int i) {
        int oddCountH = (h + 1) / 2, oddCountI = (i + 1) / 2;
        int evenCountH = h / 2, evenCountI = i / 2;
        return oddCountH * 1L * evenCountI + oddCountI * 1L * evenCountH;
    }
    public static void main(String[] args) {
        Solution14 sol14 = new Solution14();
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int i = scanner.nextInt();
        System.out.println(sol14.flowerGame(h, i));
        scanner.close();
        System.exit(0);   
    }
}
```
15.
```java
import java.util.Scanner;
class Solution15 {
    public long flowerGame(int j, int k) {
        int oddCountJ = (j + 1) / 2, oddCountK = (k + 1) / 2;
        int evenCountJ = j / 2, evenCountK = k / 2;
        return oddCountJ * 1L * evenCountK + oddCountK * 1L * evenCountJ;
    }
    public static void main(String[] args) {
        Solution15 sol15 = new Solution15();
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(sol15.flowerGame(j, k));
        scanner.close();
        System.exit(0);   
    }
}
```
16.
```java
import java.util.Scanner;
class Solution16 {
    public long flowerGame(int l, int m) {
        int oddCountL = (l + 1) / 2, oddCountM = (m + 1) / 2;
        int evenCountL = l / 2, evenCountM = m / 2;
        return oddCountL * 1L * evenCountM + oddCountM * 1L * evenCountL;
    }
    public static void main(String[] args) {
        Solution16 sol16 = new Solution16();
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(sol16.flowerGame(l, m));
        scanner.close();
        System.exit(0);   
    }
}
```
17.
```java
import java.util.Scanner;
class Solution17 {
    public long flowerGame(int n, int o) {
        int oddCountN = (n + 1) / 2, oddCountO = (o + 1) / 2;
        int evenCountN = n / 2, evenCountO = o / 2;
        return oddCountN * 1L * evenCountO + oddCountO * 1L * evenCountN;
    }
    public static void main(String[] args) {
        Solution17 sol17 = new Solution17();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int o = scanner.nextInt();
        System.out.println(sol17.flowerGame(n, o));
        scanner.close();
        System.exit(0);   
    }
}
```
18.
```java
import java.util.Scanner;
class Solution18 {
    public long flowerGame(int p, int q) {
        int oddCountP = (p + 1) / 2, oddCountQ = (q + 1) / 2;
        int evenCountP = p / 2, evenCountQ = q / 2;
        return oddCountP * 1L * evenCountQ + oddCountQ * 1L * evenCountP;
    }
    public static void main(String[] args) {
        Solution18 sol18 = new Solution18();
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        System.out.println(sol18.flowerGame(p, q));
        scanner.close();
        System.exit(0);   
    }
}
```
19.
```java
import java.util.Scanner;
class Solution19 {
    public long flowerGame(int r, int s) {
        int oddCountR = (r + 1) / 2, oddCountS = (s + 1) / 2;
        int evenCountR = r / 2, evenCountS = s / 2;
        return oddCountR * 1L * evenCountS + oddCountS * 1L * evenCountR;
    }
    public static void main(String[] args) {
        Solution19 sol19 = new Solution19();
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int s = scanner.nextInt();
        System.out.println(sol19.flowerGame(r, s));
        scanner.close();
        System.exit(0);   
    }
}
```
20.
```java
import java.util.Scanner;
class Solution20 {
    public long flowerGame(int t, int u) {
        int oddCountT = (t + 1) / 2, oddCountU = (u + 1) / 2;
        int evenCountT = t / 2, evenCountU = u / 2;
        return oddCountT * 1L * evenCountU + oddCountU * 1L * evenCountT;
    }
    public static void main(String[] args) {
        Solution20 sol20 = new Solution20();
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int u = scanner.nextInt();
        System.out.println(sol20.flowerGame(t, u));
        scanner.close();
        System.exit(0);   
    }
}
```