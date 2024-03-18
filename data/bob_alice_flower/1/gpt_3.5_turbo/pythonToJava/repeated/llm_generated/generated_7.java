import java.util.Scanner;

class Solution {
    public int flowerGame(int n, int m) {
        return m * n / 2;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        
        // Split the input string into two parts and convert them to integers
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        
        System.out.println(sol.flowerGame(n, m));
        System.exit(0);
    }
}