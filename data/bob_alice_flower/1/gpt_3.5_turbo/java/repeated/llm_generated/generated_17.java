import java.util.Scanner;
class Solution {
    public long calculateFlowerGame(int a, int b) {
        int oddNumCountA = (a + 1) / 2, oddNumCountB = (b + 1) / 2;
        int evenNumCountA = a / 2, evenNumCountB = b / 2;
        return oddNumCountA * 1L * evenNumCountB + oddNumCountB * 1L * evenNumCountA;
    }
    public static void main(String[] arguments) {
        Solution solutionObj = new Solution();
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(solutionObj.calculateFlowerGame(a, b));
        scan.close();
        System.exit(0);
    }
}