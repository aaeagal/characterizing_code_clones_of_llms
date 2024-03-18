1.
```java
import java.util.Scanner;
class Solution1 {
    public long calculateFlowerGame(int a, int b) {
        int oddCountA = (a + 1) / 2, oddCountB = (b + 1) / 2;
        int evenCountA = a / 2, evenCountB = b / 2;
        return oddCountA * 1L * evenCountB + oddCountB * 1L * evenCountA;
    }
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(sol.calculateFlowerGame(a, b));
        scanner.close();
        System.exit(0);   
    }
}
```

2.
```java
import java.util.Scanner;
class Solution2 {
    public long gameOfFlowers(int x, int y) {
        int oddCountX = (x + 1) / 2, oddCountY = (y + 1) / 2;
        int evenCountX = x / 2, evenCountY = y / 2;
        return oddCountX * 1L * evenCountY + oddCountY * 1L * evenCountX;
    }
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(sol.gameOfFlowers(x, y));
        scanner.close();
        System.exit(0);   
    }
}
```

3.
```java
import java.util.Scanner;
class Solution3 {
    public long computeFlowerGame(int p, int q) {
        int oddCountP = (p + 1) / 2, oddCountQ = (q + 1) / 2;
        int evenCountP = p / 2, evenCountQ = q / 2;
        return oddCountP * 1L * evenCountQ + oddCountQ * 1L * evenCountP;
    }
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        System.out.println(sol.computeFlowerGame(p, q));
        scanner.close();
        System.exit(0);   
    }
}
```

4.
```java
import java.util.Scanner;
class Solution4 {
    public long flowerGameCalculation(int s, int t) {
        int oddCountS = (s + 1) / 2, oddCountT = (t + 1) / 2;
        int evenCountS = s / 2, evenCountT = t / 2;
        return oddCountS * 1L * evenCountT + oddCountT * 1L * evenCountS;
    }
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        System.out.println(sol.flowerGameCalculation(s, t));
        scanner.close();
        System.exit(0);   
    }
}
```

5.
```java
import java.util.Scanner;
class Solution5 {
    public long flowerGameResult(int u, int v) {
        int oddCountU = (u + 1) / 2, oddCountV = (v + 1) / 2;
        int evenCountU = u / 2, evenCountV = v / 2;
        return oddCountU * 1L * evenCountV + oddCountV * 1L * evenCountU;
    }
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        Scanner scanner = new Scanner(System.in);
        int u = scanner.nextInt();
        int v = scanner.nextInt();
        System.out.println(sol.flowerGameResult(u, v));
        scanner.close();
        System.exit(0);   
    }
}
```

6.
```java
import java.util.Scanner;
class Solution6 {
    public long flowerGameOutcome(int i, int j) {
        int oddCountI = (i + 1) / 2, oddCountJ = (j + 1) / 2;
        int evenCountI = i / 2, evenCountJ = j / 2;
        return oddCountI * 1L * evenCountJ + oddCountJ * 1L * evenCountI;
    }
    public static void main(String[] args) {
        Solution6 sol = new Solution6();
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        System.out.println(sol.flowerGameOutcome(i, j));
        scanner.close();
        System.exit(0);   
    }
}
```

7.
```java
import java.util.Scanner;
class Solution7 {
    public long flowerGameScore(int k, int l) {
        int oddCountK = (k + 1) / 2, oddCountL = (l + 1) / 2;
        int evenCountK = k / 2, evenCountL = l / 2;
        return oddCountK * 1L * evenCountL + oddCountL * 1L * evenCountK;
    }
    public static void main(String[] args) {
        Solution7 sol = new Solution7();
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        System.out.println(sol.flowerGameScore(k, l));
        scanner.close();
        System.exit(0);   
    }
}
```

8.
```java
import java.util.Scanner;
class Solution8 {
    public long flowerGamePoints(int r, int s) {
        int oddCountR = (r + 1) / 2, oddCountS = (s + 1) / 2;
        int evenCountR = r / 2, evenCountS = s / 2;
        return oddCountR * 1L * evenCountS + oddCountS * 1L * evenCountR;
    }
    public static void main(String[] args) {
        Solution8 sol = new Solution8();
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int s = scanner.nextInt();
        System.out.println(sol.flowerGamePoints(r, s));
        scanner.close();
        System.exit(0);   
    }
}
```

9.
```java
import java.util.Scanner;
class Solution9 {
    public long flowerGameTotal(int w, int x) {
        int oddCountW = (w + 1) / 2, oddCountX = (x + 1) / 2;
        int evenCountW = w / 2, evenCountX = x / 2;
        return oddCountW * 1L * evenCountX + oddCountX * 1L * evenCountW;
    }
    public static void main(String[] args) {
        Solution9 sol = new Solution9();
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int x = scanner.nextInt();
        System.out.println(sol.flowerGameTotal(w, x));
        scanner.close();
        System.exit(0);   
    }
}
```

10.
```java
import java.util.Scanner;
class Solution10 {
    public long flowerGameSum(int y, int z) {
        int oddCountY = (y + 1) / 2, oddCountZ = (z + 1) / 2;
        int evenCountY = y / 2, evenCountZ = z / 2;
        return oddCountY * 1L * evenCountZ + oddCountZ * 1L * evenCountY;
    }
    public static void main(String[] args) {
        Solution10 sol = new Solution10();
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println(sol.flowerGameSum(y, z));
        scanner.close();
        System.exit(0);   
    }
}
```

11.
```java
import java.util.Scanner;
class Solution11 {
    public long flowerGameCount(int alpha, int beta) {
        int oddCountAlpha = (alpha + 1) / 2, oddCountBeta = (beta + 1) / 2;
        int evenCountAlpha = alpha / 2, evenCountBeta = beta / 2;
        return oddCountAlpha * 1L * evenCountBeta + oddCountBeta * 1L * evenCountAlpha;
    }
    public static void main(String[] args) {
        Solution11 sol = new Solution11();
        Scanner scanner = new Scanner(System.in);
        int alpha = scanner.nextInt();
        int beta = scanner.nextInt();
        System.out.println(sol.flowerGameCount(alpha, beta));
        scanner.close();
        System.exit(0);   
    }
}
```

12.
```java
import java.util.Scanner;
class Solution12 {
    public long flowerGameValue(int gamma, int delta) {
        int oddCountGamma = (gamma + 1) / 2, oddCountDelta = (delta + 1) / 2;
        int evenCountGamma = gamma / 2, evenCountDelta = delta / 2;
        return oddCountGamma * 1L * evenCountDelta + oddCountDelta * 1L * evenCountGamma;
    }
    public static void main(String[] args) {
        Solution12 sol = new Solution12();
        Scanner scanner = new Scanner(System.in);
        int gamma = scanner.nextInt();
        int delta = scanner.nextInt();
        System.out.println(sol.flowerGameValue(gamma, delta));
        scanner.close();
        System.exit(0);   
    }
}
```

13.
```java
import java.util.Scanner;
class Solution13 {
    public long flowerGameEstimate(int epsilon, int zeta) {
        int oddCountEpsilon = (epsilon + 1) / 2, oddCountZeta = (zeta + 1) / 2;
        int evenCountEpsilon = epsilon / 2, evenCountZeta = zeta / 2;
        return oddCountEpsilon * 1L * evenCountZeta + oddCountZeta * 1L * evenCountEpsilon;
    }
    public static void main(String[] args) {
        Solution13 sol = new Solution13();
        Scanner scanner = new Scanner(System.in);
        int epsilon = scanner.nextInt();
        int zeta = scanner.nextInt();
        System.out.println(sol.flowerGameEstimate(epsilon, zeta));
        scanner.close();
        System.exit(0);   
    }
}
```

14.
```java
import java.util.Scanner;
class Solution14 {
    public long flowerGameEvaluation(int eta, int theta) {
        int oddCountEta = (eta + 1) / 2, oddCountTheta = (theta + 1) / 2;
        int evenCountEta = eta / 2, evenCountTheta = theta / 2;
        return oddCountEta * 1L * evenCountTheta + oddCountTheta * 1L * evenCountEta;
    }
    public static void main(String[] args) {
        Solution14 sol = new Solution14();
        Scanner scanner = new Scanner(System.in);
        int eta = scanner.nextInt();
        int theta = scanner.nextInt();
        System.out.println(sol.flowerGameEvaluation(eta, theta));
        scanner.close();
        System.exit(0);   
    }
}
```

15.
```java
import java.util.Scanner;
class Solution15 {
    public long flowerGameCalc(int iota, int kappa) {
        int oddCountIota = (iota + 1) / 2, oddCountKappa = (kappa + 1) / 2;
        int evenCountIota = iota / 2, evenCountKappa = kappa / 2;
        return oddCountIota * 1L * evenCountKappa + oddCountKappa * 1L * evenCountIota;
    }
    public static void main(String[] args) {
        Solution15 sol = new Solution15();
        Scanner scanner = new Scanner(System.in);
        int iota = scanner.nextInt();
        int kappa = scanner.nextInt();
        System.out.println(sol.flowerGameCalc(iota, kappa));
        scanner.close();
        System.exit(0);   
    }
}
```

16.
```java
import java.util.Scanner;
class Solution16 {
    public long flowerGameCompute(int lambda, int mu) {
        int oddCountLambda = (lambda + 1) / 2, oddCountMu = (mu + 1) / 2;
        int evenCountLambda = lambda / 2, evenCountMu = mu / 2;
        return oddCountLambda * 1L * evenCountMu + oddCountMu * 1L * evenCountLambda;
    }
    public static void main(String[] args) {
        Solution16 sol = new Solution16();
        Scanner scanner = new Scanner(System.in);
        int lambda = scanner.nextInt();
        int mu = scanner.nextInt();
        System.out.println(sol.flowerGameCompute(lambda, mu));
        scanner.close();
        System.exit(0);   
    }
}
```

17.
```java
import java.util.Scanner;
class Solution17 {
    public long flowerGameResultant(int nu, int xi) {
        int oddCountNu = (nu + 1) / 2, oddCountXi = (xi + 1) / 2;
        int evenCountNu = nu / 2, evenCountXi = xi / 2;
        return oddCountNu * 1L * evenCountXi + oddCountXi * 1L * evenCountNu;
    }
    public static void main(String[] args) {
        Solution17 sol = new Solution17();
        Scanner scanner = new Scanner(System.in);
        int nu = scanner.nextInt();
        int xi = scanner.nextInt();
        System.out.println(sol.flowerGameResultant(nu, xi));
        scanner.close();
        System.exit(0);   
    }
}
```

18.
```java
import java.util.Scanner;
class Solution18 {
    public long flowerGameOutcome(int omicron, int pi) {
        int oddCountOmicron = (omicron + 1) / 2, oddCountPi = (pi + 1) / 2;
        int evenCountOmicron = omicron / 2, evenCountPi = pi / 2;
        return oddCountOmicron * 1L * evenCountPi + oddCountPi * 1L * evenCountOmicron;
    }
    public static void main(String[] args) {
        Solution18 sol = new Solution18();
        Scanner scanner = new Scanner(System.in);
        int omicron = scanner.nextInt();
        int pi = scanner.nextInt();
        System.out.println(sol.flowerGameOutcome(omicron, pi));
        scanner.close();
        System.exit(0);   
    }
}
```

19.
```java
import java.util.Scanner;
class Solution19 {
    public long flowerGameEstimation(int rho, int sigma) {
        int oddCountRho = (rho + 1) / 2, oddCountSigma = (sigma + 1) / 2;
        int evenCountRho = rho / 2, evenCountSigma = sigma / 2;
        return oddCountRho * 1L * evenCountSigma + oddCountSigma * 1L * evenCountRho;
    }
    public static void main(String[] args) {
        Solution19 sol = new Solution19();
        Scanner scanner = new Scanner(System.in);
        int rho = scanner.nextInt();
        int sigma = scanner.nextInt();
        System.out.println(sol.flowerGameEstimation(rho, sigma));
        scanner.close();
        System.exit(0);   
    }
}
```

20.
```java
import java.util.Scanner;
class Solution20 {
    public long flowerGameEvaluation(int tau, int upsilon) {
        int oddCountTau = (tau + 1) / 2, oddCountUpsilon = (upsilon + 1) / 2;
        int evenCountTau = tau / 2, evenCountUpsilon = upsilon / 2;
        return oddCountTau * 1L * evenCountUpsilon + oddCountUpsilon * 1L * evenCountTau;
    }
    public static void main(String[] args) {
        Solution20 sol = new Solution20();
        Scanner scanner = new Scanner(System.in);
        int tau = scanner.nextInt();
        int upsilon = scanner.nextInt();
        System.out.println(sol.flowerGameEvaluation(tau, upsilon));
        scanner.close();
        System.exit(0);   
    }
}
```