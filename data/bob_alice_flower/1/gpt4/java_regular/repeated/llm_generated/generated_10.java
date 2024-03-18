import java.util.Scanner;
class GameSolution {
    public long petalGame(int a, int b) {
        int oddCountA = (a + 1) / 2, oddCountB = (b + 1) / 2;
        int evenCountA = a / 2, evenCountB = b / 2;
        return oddCountA * 1L * evenCountB + oddCountB * 1L * evenCountA;
    }
    public static void main(String[] args) {
        GameSolution gameSol = new GameSolution();
        // read a and b from stdin
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(gameSol.petalGame(a, b));
        scan.close();
        // exit 
        System.exit(0);   
    }
}