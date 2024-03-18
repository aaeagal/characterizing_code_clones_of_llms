import java.util.Scanner;

class GameSolver {
    public long calculateScore(int x, int y) {
        int evenCountX = x / 2, evenCountY = y / 2;
        int oddCountX = (x + 1) / 2, oddCountY = (y + 1) / 2;
        return evenCountX * 1L * oddCountY + evenCountY * 1L * oddCountX;
    }
    
    public static void main(String[] args) {
        GameSolver solver = new GameSolver();
        
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        System.out.println(solver.calculateScore(x, y));
        
        scanner.close();
        
        System.exit(0);
    }
}