import java.util.Scanner;

public class FlowerGame {
    public long calculateFlowerGame(int n, int m) {
        int oddN = (n + 1) / 2;
        int oddM = (m + 1) / 2;
        int evenN = n / 2;
        int evenM = m / 2;
        return (oddN * (long) evenM) + (oddM * (long) evenN);
    }

    public static void main(String[] args) {
        FlowerGame flowerGame = new FlowerGame();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        System.out.println(flowerGame.calculateFlowerGame(n, m));
        input.close();
        System.exit(0);
    }
}