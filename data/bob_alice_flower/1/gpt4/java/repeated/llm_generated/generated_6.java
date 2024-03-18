import java.util.Scanner;

class GameSolution {
    public long playFlowerGame(int a, int b) {
        int oddA = (a % 2 == 0) ? a / 2 : a / 2 + 1;
        int oddB = (b % 2 == 0) ? b / 2 : b / 2 + 1;
        int evenA = a / 2;
        int evenB = b / 2;
        long result = (long) oddA * evenB + (long) oddB * evenA;
        return result;
    }
    public static void main(String[] args) {
        GameSolution gs = new GameSolution();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gs.playFlowerGame(a, b));
        sc.close();
        System.exit(0);
    }
}