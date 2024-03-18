import java.util.Scanner;
class FlowerGame {
    public long calculateGame(int a, int b) {
        int oddCountA = (a + 1) / 2, oddCountB = (b + 1) / 2;
        int evenCountA = a / 2, evenCountB = b / 2;
        return oddCountA * 1L * evenCountB + oddCountB * 1L * evenCountA;
    }
    public static void main(String[] args) {
        FlowerGame game = new FlowerGame();
        // read a and b from stdin
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(game.calculateGame(a, b));
        scanner.close();
        // exit 
        System.exit(0);   
    }
}