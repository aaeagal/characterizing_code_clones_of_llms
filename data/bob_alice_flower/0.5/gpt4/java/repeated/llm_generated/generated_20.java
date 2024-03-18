import java.util.Scanner;

public class GameSolution {
    public long calculateFlowerGame(int number1, int number2) {
        int oddNumber1 = (number1 + 1) / 2;
        int oddNumber2 = (number2 + 1) / 2;
        int evenNumber1 = number1 / 2;
        int evenNumber2 = number2 / 2;
        return oddNumber1 * 1L * evenNumber2 + oddNumber2 * 1L * evenNumber1;
    }
    public static void main(String[] args) {
        GameSolution gameSolution = new GameSolution();
        // read number1 and number2 from stdin
        Scanner scannerInput = new Scanner(System.in);
        int number1 = scannerInput.nextInt();
        int number2 = scannerInput.nextInt();
        System.out.println(gameSolution.calculateFlowerGame(number1, number2));
        scannerInput.close();
        // exit 
        System.exit(0);   
    }
}