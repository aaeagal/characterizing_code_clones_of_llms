import java.util.Scanner;
class Game {
    public long calculateFlowerGame(int x, int y) {
        int oddCountX = (x + 1) / 2, oddCountY = (y + 1) / 2;
        int evenCountX = x / 2, evenCountY = y / 2;
        return oddCountX * 1L * evenCountY + oddCountY * 1L * evenCountX;
    }
    public static void main(String[] args) {
        Game game = new Game();
        // read x and y from stdin
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(game.calculateFlowerGame(x, y));
        scanner.close();
        // exit 
        System.exit(0);   
    }
}