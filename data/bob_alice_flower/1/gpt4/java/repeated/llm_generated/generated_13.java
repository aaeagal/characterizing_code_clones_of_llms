import java.util.Scanner;

class FlowerGame {
    public long calculate(int x, int y) {
        int oddCounterX = (x + 1) / 2, oddCounterY = (y + 1) / 2;
        int evenCounterX = x / 2, evenCounterY = y / 2;
        return (oddCounterX * 1L * evenCounterY) + (oddCounterY * 1L * evenCounterX);
    }

    public static void main(String[] mainArgs) {
        FlowerGame flowerGame = new FlowerGame();
        // retrieve x and y from stdin
        Scanner inputScanner = new Scanner(System.in);
        int x = inputScanner.nextInt();
        int y = inputScanner.nextInt();
        System.out.println(flowerGame.calculate(x, y));
        inputScanner.close();
        // exit program
        System.exit(0);
    }
}