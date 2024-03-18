import java.util.Scanner;
public class Main {
    public long playGame(int a, int b) {
        int oddA = (a + 1) / 2, oddB = (b + 1) / 2;
        int evenA = a / 2, evenB = b / 2;
        return oddA * 1L * evenB + oddB * 1L * evenA;
    }
    public static void main(String[] args) {
        Main mainInstance = new Main();
        Scanner inputScanner = new Scanner(System.in);
        int a = inputScanner.nextInt();
        int b = inputScanner.nextInt();
        System.out.println(mainInstance.playGame(a, b));
        inputScanner.close();
        System.exit(0);
    }
}