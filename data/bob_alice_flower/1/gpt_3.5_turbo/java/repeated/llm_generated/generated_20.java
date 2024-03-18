import java.util.Scanner;

class Game {
    public long calculateScore(int rows, int cols) {
        int oddRows = (rows + 1) / 2, oddCols = (cols + 1) / 2;
        int evenRows = rows / 2, evenCols = cols / 2;
        return oddRows * 1L * evenCols + oddCols * 1L * evenRows;
    }

    public static void main(String[] args) {
        Game game = new Game();
        
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        
        System.out.println(game.calculateScore(rows, cols));
        scanner.close();

        System.exit(0);
    }
}