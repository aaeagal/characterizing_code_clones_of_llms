import java.util.Scanner;
class Solution {
    public long calculateFlowerGameScore(int roses, int daises) {
        int oddRoses = (roses + 1) / 2, oddDaises = (daises + 1) / 2;
        int evenRoses = roses / 2, evenDaises = daises / 2;
        return oddRoses * 1L * evenDaises + oddDaises * 1L * evenRoses;
    }
    public static void main(String[] arguments) {
        Solution solution = new Solution();
        // get the input values for roses and daises
        Scanner input = new Scanner(System.in);
        int roses = input.nextInt();
        int daises = input.nextInt();
        System.out.println(solution.calculateFlowerGameScore(roses, daises));
        input.close();
        // exit the program
        System.exit(0);   
    }
}