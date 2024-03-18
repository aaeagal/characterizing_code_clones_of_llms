import java.util.Scanner;

class Game {
    public long gameOfFlowers(int p, int q) {
        int oddP = (p % 2 == 0) ? p/2 : (p/2) + 1;
        int oddQ = (q % 2 == 0) ? q/2 : (q/2) + 1;
        int evenP = p/2;
        int evenQ = q/2;
        return oddP * evenQ * 1L + oddQ * evenP * 1L;
    }

    public static void main(String[] args) {
        Game gameInstance = new Game();
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int q = scan.nextInt();
        System.out.println(gameInstance.gameOfFlowers(p, q));
        scan.close();
        System.exit(0);   
    }
}