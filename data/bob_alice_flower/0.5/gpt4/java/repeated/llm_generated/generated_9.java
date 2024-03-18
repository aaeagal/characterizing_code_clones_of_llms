import java.util.Scanner;
public class Game {
    public long calculateFlowerGame(int a, int b) {
        int oddCountA = (a + 1) / 2, oddCountB = (b + 1) / 2;
        int evenCountA = a / 2, evenCountB = b / 2;
        return oddCountA * 1L * evenCountB + oddCountB * 1L * evenCountA;
    }
    public static void main(String[] parameters) {
        Game gameInstance = new Game();
        // read a and b from stdin
        Scanner inputScanner = new Scanner(System.in);
        int a = inputScanner.nextInt();
        int b = inputScanner.nextInt();
        System.out.println(gameInstance.calculateFlowerGame(a, b));
        inputScanner.close();
        // exit 
        System.exit(0);   
    }
}