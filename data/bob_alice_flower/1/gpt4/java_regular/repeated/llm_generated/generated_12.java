import java.util.Scanner;

public class FlowerGame {
    public long calculateFlowers(int x, int y) {
        int oddCountX = (x + 1) / 2, oddCountY = (y + 1) / 2;
        int evenCountX = x / 2, evenCountY = y / 2;
        return oddCountX * 1L * evenCountY + oddCountY * 1L * evenCountX;
    }
    public static void main(String[] parameters) {
        FlowerGame fg = new FlowerGame();
        // read x and y from standard input
        Scanner inputReader = new Scanner(System.in);
        int x = inputReader.nextInt();
        int y = inputReader.nextInt();
        System.out.println(fg.calculateFlowers(x, y));
        inputReader.close();
        // end of program  
        System.exit(0);   
    }
}