import java.util.Scanner;

class Game {
    public long calculateFlowerGame(int a, int b) {
        int oddA = (a + 1) / 2, oddB = (b + 1) / 2;
        int evenA = a / 2, evenB = b / 2;
        return (long)oddA * evenB + (long)oddB * evenA;
    }
    public static void main(String[] parameters) {
        Game game = new Game();
        Scanner inputScanner = new Scanner(System.in);
        int a = inputScanner.nextInt();
        int b = inputScanner.nextInt();
        System.out.println(game.calculateFlowerGame(a, b));
        inputScanner.close();
        System.exit(0);   
    }
}