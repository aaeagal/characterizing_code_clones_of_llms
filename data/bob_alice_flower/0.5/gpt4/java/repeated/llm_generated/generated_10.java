import java.util.Scanner;

public class FlowerGame {
    public long calculateGameResult(int n, int m) {
        int oddN = (n + 1) / 2;
        int oddM = (m + 1) / 2;
        int evenN = n / 2;
        int evenM = m / 2;
        return oddN * 1L * evenM + oddM * 1L * evenN;
    }

    public static void main(String[] args) {
        FlowerGame game = new FlowerGame();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        System.out.println(game.calculateGameResult(n, m));
        input.close();
        System.exit(0);
    }
}