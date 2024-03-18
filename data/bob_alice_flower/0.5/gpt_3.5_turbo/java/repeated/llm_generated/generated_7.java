import java.util.Scanner;

class Solution {
    public long calculateFlowerGame(int x, int y) {
        int oddNumX = (x + 1) / 2, oddNumY = (y + 1) / 2;
        int evenNumX = x / 2, evenNumY = y / 2;
        return oddNumX * 1L * evenNumY + oddNumY * 1L * evenNumX;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        
        System.out.println(solution.calculateFlowerGame(x, y));
        
        input.close();
        
        System.exit(0);
    }
}