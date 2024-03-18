import java.util.Scanner;
class GameSolution {
    public long flowerCompetition(int a, int b) {
        int oddCountA = (a + 1) / 2, oddCountB = (b + 1) / 2;
        int evenCountA = a / 2, evenCountB = b / 2;
        return oddCountA * 1L * evenCountB + oddCountB * 1L * evenCountA;
    }
    public static void main(String[] args) {
        GameSolution gsol = new GameSolution();
        // read a and b from stdin
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(gsol.flowerCompetition(a, b));
        scanner.close();
        // exit 
        System.exit(0);   
    }
}