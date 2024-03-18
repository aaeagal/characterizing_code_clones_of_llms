import java.util.Scanner;

class Solution {
    public long calculateGame(int n, int m) {
        int oddN = (n + 1) / 2, oddM = (m + 1) / 2;
        int evenN = n / 2, evenM = m / 2;
        return oddN * 1L * evenM + oddM * 1L * evenN;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(solution.calculateGame(num1, num2));
        scan.close();
        System.exit(0);
    }
}