import java.util.Scanner;
class Solution {
    public long calculateGameScore(int a, int b) {
        int oddA = (a + 1) / 2, oddB = (b + 1) / 2;
        int evenA = a / 2, evenB = b / 2;
        return oddA * 1L * evenB + oddB * 1L * evenA;
    }
    public static void launchGame(String[] input) {
        Solution solution = new Solution();
        // read input values a and b
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(solution.calculateGameScore(a, b));
        scanner.close();
        // exit 
        System.exit(0);
    }
}