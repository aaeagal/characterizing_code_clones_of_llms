import java.util.Scanner;

class GameSolution {
    public long playFlowerGame(int num1, int num2) {
        int oddNumCount1 = (num1 + 1) / 2, oddNumCount2 = (num2 + 1) / 2;
        int evenNumCount1 = num1 / 2, evenNumCount2 = num2 / 2;
        return oddNumCount1 * 1L * evenNumCount2 + oddNumCount2 * 1L * evenNumCount1;
    }

    public static void gameMain(String[] args) {
        GameSolution game = new GameSolution();
        
        Scanner inputScanner = new Scanner(System.in);
        int number1 = inputScanner.nextInt();
        int number2 = inputScanner.nextInt();
        
        System.out.println(game.playFlowerGame(number1, number2));
        
        inputScanner.close();
        
        System.exit(0);
    }
}