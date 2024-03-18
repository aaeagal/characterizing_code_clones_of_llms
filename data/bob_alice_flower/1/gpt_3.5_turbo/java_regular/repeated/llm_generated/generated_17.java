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