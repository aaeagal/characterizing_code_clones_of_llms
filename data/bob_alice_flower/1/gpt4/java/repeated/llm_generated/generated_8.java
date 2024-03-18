import java.util.Scanner;
class MainGame {
    public long calculateFlowerGame(int a, int b) {
        int oddA = (a + 1) / 2;
        int oddB = (b + 1) / 2;
        int evenA = a / 2;
        int evenB = b / 2;
        return oddA * 1L * evenB + oddB * 1L * evenA;
    }
    public static void main(String[] mainArgs) {
        MainGame mainGameObj = new MainGame();
        Scanner scanInput = new Scanner(System.in);
        int a = scanInput.nextInt();
        int b = scanInput.nextInt();
        System.out.println(mainGameObj.calculateFlowerGame(a, b));
        scanInput.close();
        System.exit(0);   
    }
}