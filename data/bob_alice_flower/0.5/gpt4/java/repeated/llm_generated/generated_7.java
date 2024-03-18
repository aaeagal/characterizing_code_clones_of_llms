import java.util.Scanner;

public class GameSolution {
    public long calculateFlowerGame(int firstNumber, int secondNumber) {
        int oddFirstNumber = (firstNumber + 1) / 2;
        int oddSecondNumber = (secondNumber + 1) / 2;
        int evenFirstNumber = firstNumber / 2;
        int evenSecondNumber = secondNumber / 2;
        return (long)oddFirstNumber * evenSecondNumber + (long)oddSecondNumber * evenFirstNumber;
    }
    public static void main(String[] args) {
        GameSolution gameSolution = new GameSolution();
        // read firstNumber and secondNumber from stdin
        Scanner inputScanner = new Scanner(System.in);
        int firstNumber = inputScanner.nextInt();
        int secondNumber = inputScanner.nextInt();
        System.out.println(gameSolution.calculateFlowerGame(firstNumber, secondNumber));
        inputScanner.close();
        // exit 
        System.exit(0);   
    }
}