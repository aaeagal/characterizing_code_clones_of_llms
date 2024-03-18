import java.util.Scanner;

public class Game {
    public long calculateFlowerGame(int num1, int num2) {
        int oddNum1 = (num1 + 1) / 2;
        int oddNum2 = (num2 + 1) / 2;
        int evenNum1 = num1 / 2;
        int evenNum2 = num2 / 2;
        return oddNum1 * 1L * evenNum2 + oddNum2 * 1L * evenNum1;
    }
    public static void main(String[] args) {
        Game game = new Game();
        // read num1 and num2 from stdin
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(game.calculateFlowerGame(num1, num2));
        scanner.close();
        // exit 
        System.exit(0);   
    }
}