import java.util.Scanner;
class Game {
    public long flowerCompetition(int p, int q) {
        int oddCountP = (p + 1) / 2, oddCountQ = (q + 1) / 2;
        int evenCountP = p / 2, evenCountQ = q / 2;
        return oddCountP * 1L * evenCountQ + oddCountQ * 1L * evenCountP;
    }
    public static void main(String[] args) {
        Game game = new Game();
        // read p and q from stdin
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        System.out.println(game.flowerCompetition(p, q));
        scanner.close();
        // exit 
        System.exit(0);   
    }
}