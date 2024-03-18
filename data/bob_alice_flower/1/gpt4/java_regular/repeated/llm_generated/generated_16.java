import java.util.Scanner;
class GameSystem {
    public long floraCompetition(int a, int b) {
        int oddCountA = (a + 1) / 2, oddCountB = (b + 1) / 2;
        int evenCountA = a / 2, evenCountB = b / 2;
        return oddCountA * 1L * evenCountB + oddCountB * 1L * evenCountA;
    }
    public static void main(String[] args) {
        GameSystem gameSystem = new GameSystem();
        // read a and b from stdin
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(gameSystem.floraCompetition(a, b));
        in.close();
        // exit 
        System.exit(0);   
    }
}