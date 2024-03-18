import java.util.Scanner;

public class FlowerGame {
    private long calculateFlowers(int length, int width) {
        int oddCountLength = (length + 1) / 2;
        int oddCountWidth = (width + 1) / 2;
        int evenCountLength = length / 2;
        int evenCountWidth = width / 2;
        return oddCountLength * 1L * evenCountWidth + oddCountWidth * 1L * evenCountLength;
    }
    public static void main(String[] args) {
        FlowerGame flower = new FlowerGame();
        // read length and width from stdin
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int width = input.nextInt();
        System.out.println(flower.calculateFlowers(length, width));
        input.close();
        // exit 
        System.exit(0);   
    }
}