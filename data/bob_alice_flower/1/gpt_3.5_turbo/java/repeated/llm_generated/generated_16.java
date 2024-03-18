import java.util.Scanner;

class Solution {
    public long winningCombination(int num1, int num2) {
        int oddNumCount1 = (num1 + 1) / 2, oddNumCount2 = (num2 + 1) / 2;
        int evenNumCount1 = num1 / 2, evenNumCount2 = num2 / 2;
        return oddNumCount1 * 1L * evenNumCount2 + oddNumCount2 * 1L * evenNumCount1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // Read num1 and num2 from the console
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(solution.winningCombination(num1, num2));
        scanner.close();

        // Terminate the program
        System.exit(0);
    }
}