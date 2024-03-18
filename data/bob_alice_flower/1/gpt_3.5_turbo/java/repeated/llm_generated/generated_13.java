import java.util.Scanner;
class Solution {
    public long calculateFlowers(int x, int y) {
        int oddNumberX = (x + 1) / 2, oddNumberY = (y + 1) / 2;
        int evenNumberX = x / 2, evenNumberY = y / 2;
        return oddNumberX * 1L * evenNumberY + oddNumberY * 1L * evenNumberX;
    }
    public static void main(String[] arguments) {
        Solution solution = new Solution();
        // read x and y from user input
        Scanner inputScanner = new Scanner(System.in);
        int x = inputScanner.nextInt();
        int y = inputScanner.nextInt();
        System.out.println(solution.calculateFlowers(x, y));
        inputScanner.close();
        // exit program
        System.exit(0);   
    }
}