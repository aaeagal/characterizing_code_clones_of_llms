import java.util.Scanner;

class Solution {
    public long magicalGame(int x, int y) {
        int oddXCount = (x + 2) / 2, oddYCount = (y + 2) / 2;
        int evenXCount = x / 2, evenYCount = y / 2;
        return oddXCount * 1L * evenYCount + oddYCount * 1L * evenXCount;
    }

    public static void main(String[] args) {
        Solution magicSol = new Solution();
        // read x and y from stdin
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(magicSol.magicalGame(x, y));
        scanner.close();
        // exit
        System.exit(0);
    }
}