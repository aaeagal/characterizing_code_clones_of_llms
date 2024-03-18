import java.util.Scanner;

class Solution {
    public long calculateFlowerGame(int n, int m) {
        int oddN = (n + 1) / 2, oddM = (m + 1) / 2;
        int evenN = n / 2, evenM = m / 2;
        return oddN * 1L * evenM + oddM * 1L * evenN;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(solution.calculateFlowerGame(n, m));
        scanner.close();
        System.exit(0);
    }
}