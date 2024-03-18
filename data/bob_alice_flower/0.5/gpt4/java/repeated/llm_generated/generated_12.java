import java.util.Scanner;

class GameSolution {
    public long calculateFlowerGame(int a, int b) {
        int countOddA = (a + 1) / 2;
        int countOddB = (b + 1) / 2;
        int countEvenA = a / 2;
        int countEvenB = b / 2;
        return (long)countOddA * countEvenB + (long)countOddB * countEvenA;
    }
    public static void main(String[] args) {
        GameSolution gameSol = new GameSolution();
        Scanner inputScanner = new Scanner(System.in);
        int a = inputScanner.nextInt();
        int b = inputScanner.nextInt();
        System.out.println(gameSol.calculateFlowerGame(a, b));
        inputScanner.close();
        System.exit(0);   
    }
}