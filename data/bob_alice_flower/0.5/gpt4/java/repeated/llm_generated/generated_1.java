import java.util.Scanner;

public class GameSolution {
    public long calculateFlowerGame(int a, int b) {
        int oddA = (a + 1) / 2;
        int oddB = (b + 1) / 2;
        int evenA = a / 2;
        int evenB = b / 2;
        return (long) oddA * evenB + (long) oddB * evenA;
    }
    public static void main(String[] args) {
        GameSolution gameSolution = new GameSolution();
        Scanner inputScanner = new Scanner(System.in);
        int a = inputScanner.nextInt();
        int b = inputScanner.nextInt();
        System.out.println(gameSolution.calculateFlowerGame(a, b));
        inputScanner.close();
        System.exit(0);
    }
}