import java.util.Scanner;
class Solution {
    public long calculateFlowerGame(int n, int m) {
        int evenCountN = n / 2, evenCountM = m / 2;
        int oddCountN = (n + 1) / 2, oddCountM = (m + 1) / 2;
        return oddCountN * 1L * evenCountM + oddCountM * 1L * evenCountN;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        int nValue = input.nextInt();
        int mValue = input.nextInt();
        System.out.println(solution.calculateFlowerGame(nValue, mValue));
        input.close();
        System.exit(0);   
    }
}