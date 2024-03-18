import java.util.Scanner;

class GameSolution {
    public long calculateFlowerGame(int a, int b) {
        int oddA = (a + 1) / 2, oddB = (b + 1) / 2;
        int evenA = a / 2, evenB = b / 2;
        return oddA * 1L * evenB + oddB * 1L * evenA;
    }
    public static void main(String[] args) {
        GameSolution gameSolution = new GameSolution();
        // read a and b from stdin
        Scanner inputScanner = new Scanner(System.in);
        int a = inputScanner.nextInt();
        int b = inputScanner.nextInt();
        System.out.println(gameSolution.calculateFlowerGame(a, b));
        inputScanner.close();
        // exit 
        System.exit(0);   
    }
}