import java.util.Scanner;

class FlowerGame {
    public long calculateFlowerGame(int num1, int num2) {
        int oddNum1 = (num1 + 1) / 2, oddNum2 = (num2 + 1) / 2;
        int evenNum1 = num1 / 2, evenNum2 = num2 / 2;
        return oddNum1 * 1L * evenNum2 + oddNum2 * 1L * evenNum1;
    }

    public static void main(String[] args) {
        FlowerGame game = new FlowerGame();
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(game.calculateFlowerGame(num1, num2));
        input.close();
        System.exit(0);
    }
}