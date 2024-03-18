import java.util.Scanner;
class FlowerSolution {
    public long calculateFlowerGame(int x, int y) {
        int oddX = (x + 1) / 2, oddY = (y + 1) / 2;
        int evenX = x / 2, evenY = y / 2;
        return oddX * 1L * evenY + oddY * 1L * evenX;
    }
    public static void main(String[] arguments) {
        FlowerSolution solution = new FlowerSolution();
        Scanner scannerInput = new Scanner(System.in);
        int xValue = scannerInput.nextInt();
        int yValue = scannerInput.nextInt();
        System.out.println(solution.calculateFlowerGame(xValue, yValue));
        scannerInput.close();
        System.exit(0);   
    }
}