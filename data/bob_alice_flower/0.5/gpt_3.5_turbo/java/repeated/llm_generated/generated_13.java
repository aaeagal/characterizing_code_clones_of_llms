import java.util.Scanner;
class Solution {
    public long calculateScore(int x, int y) {
        int oddX = (x + 1) / 2, oddY = (y + 1) / 2;
        int evenX = x / 2, evenY = y / 2;
        return oddX * 1L * evenY + oddY * 1L * evenX;
    }
    public static void main(String[] arguments) {
        Solution solution = new Solution();
        // read x and y from stdin
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(solution.calculateScore(x, y));
        scanner.close();
        // exit 
        System.exit(0);   
    }
}