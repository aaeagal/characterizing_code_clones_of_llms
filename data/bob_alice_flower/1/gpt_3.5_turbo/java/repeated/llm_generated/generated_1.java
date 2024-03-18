import java.util.Scanner;

class Solution {
    public long countFlowers(int n, int m) {
        int oddN = (n + 1) / 2, oddM = (m + 1) / 2;
        int evenN = n / 2, evenM = m / 2;
        return oddN * 1L * evenM + oddM * 1L * evenN;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        System.out.println(solution.countFlowers(n, m));
        input.close();
    }
}