import java.util.Scanner;

class Game {
    public long plantGame(int p, int q) {
        int oddCountP = (p + 1) / 2, oddCountQ = (q + 1) / 2;
        int evenCountP = p / 2, evenCountQ = q / 2;
        return oddCountP * 1L * evenCountQ + oddCountQ * 1L * evenCountP;
    }
    
    public static void main(String[] args) {
        Game game = new Game();
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int q = scan.nextInt();
        System.out.println(game.plantGame(p, q));
        scan.close();
        System.exit(0);
    }
}