1.
```java
import java.util.Scanner;

class Solution1 {
    public long computeFlowerGameProp(long n, long m) {
        long oddN = (n + 1) / 2;
        long oddM = (m + 1) / 2;
        long evenN = n / 2;
        long evenM = m / 2;
        return oddN * evenM + oddM * evenN;
    }
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long m = scanner.nextInt();
        System.out.println(solution.computeFlowerGameProp(n, m));
        scanner.close();
        System.exit(0);   
    }
}
```

2.
```java
import java.util.Scanner;

class Solution2 {
    long provideFlowerGameValue(int a, int b) {
        int oddA = (a + 1) / 2, oddB = (b + 1) / 2;
        int evenA = a / 2, evenB = b / 2;
        return oddA * 1L * evenB + oddB * 1L * evenA;
    }
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        Scanner scannerObject = new Scanner(System.in);
        int a = scannerObject.nextInt();
        int b = scannerObject.nextInt();
        System.out.println(solution.provideFlowerGameValue(a, b));
        scannerObject.close();
        System.exit(0);
    }
}
```

3.
```java
import java.util.Scanner;

class Solution3 {
    public long flowerGameFunction(int a1, int a2) {
        int oddA1 = (a1 + 1) / 2, oddA2 = (a2 + 1) / 2;
        int evenA1 = a1 / 2, evenA2 = a2 / 2;
        return oddA1 * Long.valueOf(evenA2) + oddA2 * Long.valueOf(evenA1);
     }
    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        Scanner scan = new Scanner(System.in);
        int a1 = scan.nextInt();
        int a2 = scan.nextInt();
        System.out.println(solution.flowerGameFunction(a1, a2));
        scan.close();
        System.exit(0);
    }
}
```

4.
```java
import java.util.Scanner;

class Solution4 {
    long gameFlowerFunction(int nm1, int nm2) {
        int oddNm1 = (nm1 % 2 == 0 ? nm1 / 2 : nm1 / 2 + 1);
        int oddNm2 = (nm2 % 2 == 0 ? nm2 / 2 : nm2 / 2 + 1);
        int evenNm1 = nm1 / 2, evenNm2 = nm2 / 2;
        return oddNm1 * (long)evenNm2 + oddNm2 * (long)evenNm1;
    }
    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        Scanner scannerObj = new Scanner(System.in);
        int nm1 = scannerObj.nextInt();
        int nm2 = scannerObj.nextInt();
        System.out.println(solution.gameFlowerFunction(nm1, nm2));
        scannerObj.close();
        System.exit(0);
    }
}
```

5.
```java
import java.util.Scanner;

class Solution5 {
    long flowerGameCalc(long x, long y) {
        long oddX = (x % 2 == 0) ? x / 2 : x / 2 + 1;
        long oddY = (y % 2 == 0) ? y / 2 : y / 2 + 1;
        long evenX = x / 2, evenY = y / 2;
        return oddX * evenY + oddY * evenX;
    }
    public static void main(String[] args) {
        Solution5 solution = new Solution5();
        Scanner scanObject = new Scanner(System.in);
        long xParam = scanObject.nextInt();
        long yParam = scanObject.nextInt();
        System.out.println(solution.flowerGameCalc(xParam, yParam));
        scanObject.close();
        System.exit(0);
    }
}
```

6.
```java
import java.util.Scanner;

class Solution6 {
    public long executeFlowerGame(int a, int b) {
        int oddACount = (a % 2 == 0) ? a / 2 : a / 2 + 1;
        int oddBCount = (b % 2 == 0) ? b / 2 : b / 2 + 1;
        int evenACount = a / 2, evenBCount = b / 2;
        return oddACount * 1L * evenBCount + oddBCount * 1L * evenACount;
    }
    public static void main(String[] args) {
        Solution6 sol = new Solution6();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(sol.executeFlowerGame(a, b));
        scanner.close();
        System.exit(0);   
    }
}
```

7.
```java
import java.util.Scanner;

class Solution7 {
    public long computeFlowerGame(int n, int m) {
        int oddCountN = n / 2;
        oddCountN += n % 2 == 0 ? 0 : 1;
        int oddCountM = m / 2;
        oddCountM += m % 2 == 0 ? 0 : 1;
        int evenCountN = n / 2, evenCountM = m / 2;
        return oddCountN * 1L * evenCountM + oddCountM * 1L * evenCountN;
    }
    public static void main(String[] args) {
        Solution7 sol = new Solution7();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(sol.computeFlowerGame(n, m));
        scanner.close();
        System.exit(0);   
    }
}
```

8.
```java
import java.util.Scanner;

class Solution8 {
    public long processFlowerGame(int num1, int num2) {
        int oddCountNum1 = (num1 + 1) / 2, oddCountNum2 = (num2 + 1) / 2;
        int evenCountNum1 = num1 / 2, evenCountNum2 = num2 / 2;
        return oddCountNum1 * 1L * evenCountNum2 + oddCountNum2 * 1L * evenCountNum1;
    }
    public static void main(String[] args) {
        Solution8 sol = new Solution8();
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(sol.processFlowerGame(num1, num2));
        scanner.close();
        System.exit(0);   
    }
}
```

9.
```java
import java.util.Scanner;

class Solution9 {
    public long flowerGameCalculationMethod(int n1, int m1) {
        int oddCountN1 = (n1 + 1) / 2, oddCountM1 = (m1 + 1) / 2;
        int evenCountN1 = n1 / 2, evenCountM1 = m1 / 2;
        return oddCountN1 * 1L * evenCountM1 + oddCountM1 * 1L * evenCountN1;
    }
    public static void main(String[] args) {
        Solution9 sol = new Solution9();
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        System.out.println(sol.flowerGameCalculationMethod(n1, m1));
        scanner.close();
        System.exit(0);   
    }
}
```

10.
```java
import java.util.Scanner;

class Solution10 {
    long getFlowerGameResult(int a, int b) {
        int oddA = (a + 1) / 2, oddB = (b + 1) / 2;
        int evenA = a / 2, evenB = b / 2;
        return oddA * 1L * evenB + oddB * 1L * evenA;
    }
    public static void main(String[] args) {
        Solution10 solution = new Solution10();
        Scanner scannerObject = new Scanner(System.in);
        int aP = scannerObject.nextInt();
        int bP = scannerObject.nextInt();
        System.out.println(solution.getFlowerGameResult(aP, bP));
        scannerObject.close();
        System.exit(0);   
    }
}
```
