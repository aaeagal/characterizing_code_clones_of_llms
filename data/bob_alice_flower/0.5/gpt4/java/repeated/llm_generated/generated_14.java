import java.util.Scanner;

public class Game {
    public long calculateFlowerGame(int a, int b) {
        int countOddA = (a + 1) / 2;
        int countOddB = (b + 1) / 2;
        int countEvenA = a / 2;
        int countEvenB = b / 2;
        return countOddA * 1L * countEvenB + countOddB * 1L * countEvenA;
    }

    public static void main(String[] args) {
        Game game = new Game();
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(game.calculateFlowerGame(a, b));
        input.close();
        System.exit(0);
    }
}