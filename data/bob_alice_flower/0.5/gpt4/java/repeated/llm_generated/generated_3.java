import java.util.Scanner;
class FlowerGame {
    public long calculate(int a, int b) {
        int oddCountA = (a + 1) / 2, oddCountB = (b + 1) / 2;
        int evenCountA = a / 2, evenCountB = b / 2;
        return oddCountA * 1L * evenCountB + oddCountB * 1L * evenCountA;
    }
    public static void main(String[] args) {
        FlowerGame flowerGame = new FlowerGame();
        // read a and b from stdin
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(flowerGame.calculate(a, b));
        input.close();
        // exit 
        System.exit(0);   
    }
}