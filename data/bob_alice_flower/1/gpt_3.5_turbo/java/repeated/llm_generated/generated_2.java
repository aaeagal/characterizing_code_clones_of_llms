import java.util.Scanner;

class DifferentSolution {
    public long magicGame(int x, int y) {
        int oddNumX = (x + 1) / 2, oddNumY = (y + 1) / 2;
        int evenNumX = x / 2, evenNumY = y / 2;
        return oddNumX * 1L * evenNumY + oddNumY * 1L * evenNumX;
    }

    public static void main(String[] arguments) {
        DifferentSolution differentSol = new DifferentSolution();
        
        Scanner scannerInput = new Scanner(System.in);
        int xVar = scannerInput.nextInt();
        int yVar = scannerInput.nextInt();
        
        System.out.println(differentSol.magicGame(xVar, yVar));
        scannerInput.close();
        
        System.exit(0);
    }
}