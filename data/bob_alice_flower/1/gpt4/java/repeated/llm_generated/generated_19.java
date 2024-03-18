import java.util.Scanner;
public class FlowerGame {
    public static void main(String[] args) {
        FlowerGame game = new FlowerGame();
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        System.out.println(game.result(value1, value2));
        scanner.close();
        System.exit(0); 
    }
    public long result(int num1, int num2) {
        int oddNum1 = (num1 + 1) / 2;
        int oddNum2 = (num2 + 1) / 2;
        int evenNum1 = num1 / 2;
        int evenNum2 = num2 / 2;
        return (long) oddNum1 * evenNum2 + (long)oddNum2 * evenNum1;
    }
}