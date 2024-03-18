import java.util.Scanner;

class Solution {
    public long calculateFlowerGame(int num1, int num2) {
        int oddNum1 = (num1 + 1) / 2, oddNum2 = (num2 + 1) / 2;
        int evenNum1 = num1 / 2, evenNum2 = num2 / 2;
        return oddNum1 * 1L * evenNum2 + oddNum2 * 1L * evenNum1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(solution.calculateFlowerGame(num1, num2));
        scan.close();
        System.exit(0);
    }
}