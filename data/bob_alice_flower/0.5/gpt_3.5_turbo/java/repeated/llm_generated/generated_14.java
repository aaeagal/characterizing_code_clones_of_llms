import java.util.Scanner;

class GameSolution {
    public long calculateFlowerGame(int x, int y) {
        int oddX = (x + 1) / 2, oddY = (y + 1) / 2;
        int evenX = x / 2, evenY = y / 2;
        return oddX * 1L * evenY + oddY * 1L * evenX;
    }

    public static void main(String[] args) {
        GameSolution gameSol = new GameSolution();
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println(gameSol.calculateFlowerGame(x, y));
        input.close();
        System.exit(0);
    }
}