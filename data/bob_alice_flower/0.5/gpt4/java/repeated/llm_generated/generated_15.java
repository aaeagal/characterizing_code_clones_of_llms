import java.util.Scanner;

public class GameSolution {
    public long calculateFlowerGameResult(int num1, int num2) {
        int oddNum1 = (num1 + 1) / 2;
        int oddNum2 = (num2 + 1) / 2;
        int evenNum1 = num1 / 2;
        int evenNum2 = num2 / 2;
        return oddNum1 * 1L * evenNum2 + oddNum2 * 1L * evenNum1;
    }

    public static void main(String[] args) {
        GameSolution gameSol = new GameSolution();
        Scanner inputScanner = new Scanner(System.in);
        int num1 = inputScanner.nextInt();
        int num2 = inputScanner.nextInt();
        System.out.println(gameSol.calculateFlowerGameResult(num1, num2));
        inputScanner.close();
        System.exit(0);
    }
}