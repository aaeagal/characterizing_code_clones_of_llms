import java.util.Scanner;
class GameSolver {
    public long calculate(int x, int y) {
        int countOddX = (x + 1) / 2, countOddY = (y + 1) / 2;
        int countEvenX = x / 2, countEvenY = y / 2;
        return countOddX * 1L * countEvenY + countOddY * 1L * countEvenX;
    }
    public static void main(String[] args) {
        GameSolver gameSolver = new GameSolver();
        // read x and y from stdin
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(gameSolver.calculate(x, y));
        scanner.close();
        // exit 
        System.exit(0);   
    }
}