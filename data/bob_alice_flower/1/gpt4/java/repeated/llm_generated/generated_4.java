import java.util.Scanner;

public class Game {
    
    private long flowerCount(int first, int second) {
        int oddFirst = (first + 1) / 2;
        int oddSecond = (second + 1) / 2;
        int evenFirst = first / 2;
        int evenSecond = second / 2;
        long result = (long) oddFirst * evenSecond + (long) oddSecond * evenFirst;
        return result;
    }
    
    public static void main(String[] args) {
        Game gameInstance = new Game();

        Scanner inputScanner = new Scanner(System.in);

        int firstNum = inputScanner.nextInt();
        int secondNum = inputScanner.nextInt();

        long result = gameInstance.flowerCount(firstNum, secondNum);
        System.out.println(result);

        inputScanner.close();

        System.exit(0);
    }
}