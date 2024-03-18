import java.util.Scanner;
class ProblemSolution {
    public long roseGame(int x, int y) {
        int oddCountX = (x + 1) / 2, oddCountY = (y + 1) / 2;
        int evenCountX = x / 2, evenCountY = y / 2;
        return oddCountX * 1L * evenCountY + oddCountY * 1L * evenCountX;
    }
    public static void main(String[] args) {
        ProblemSolution problemSol = new ProblemSolution();
        // read x and y from stdin
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println(problemSol.roseGame(x, y));
        scan.close();
        // exit 
        System.exit(0);   
    }
}