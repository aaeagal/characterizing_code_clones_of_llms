import java.util.Scanner;

public class FlowerGame {
    public long calculateFlowerGame(int input1, int input2) {
        int oddInput1Count = (input1 + 1) / 2;
        int oddInput2Count = (input2 + 1) / 2;
        int evenInput1Count = input1 / 2;
        int evenInput2Count = input2 / 2;
        return oddInput1Count * 1L * evenInput2Count + oddInput2Count * 1L * evenInput1Count;
    }

    public static void main(String[] args) {
        FlowerGame flowerGame = new FlowerGame();
        Scanner inputScanner = new Scanner(System.in);
        int input1 = inputScanner.nextInt();
        int input2 = inputScanner.nextInt();
        System.out.println(flowerGame.calculateFlowerGame(input1, input2));
        inputScanner.close();
        System.exit(0);
    }
}