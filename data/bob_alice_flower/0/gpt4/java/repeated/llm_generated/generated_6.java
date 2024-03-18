import java.util.Scanner;

public class Game {
    public long calculateFlowerGame(int a, int b) {
        int oddA = (a + 1) / 2;
        int oddB = (b + 1) / 2;
        int evenA = a / 2;
        int evenB = b / 2;
        return (long)oddA * evenB + (long)oddB * evenA;
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