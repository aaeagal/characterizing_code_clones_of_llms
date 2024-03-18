import java.util.Scanner;

class GameSolution {
    public long gameWithFlowers(int var1, int var2) {
        int oddCountVar1 = (var1 + 1) / 2;
        int oddCountVar2 = (var2 + 1) / 2;
        int evenCountVar1 = var1 / 2;
        int evenCountVar2 = var2 / 2;
        return oddCountVar1 * 1L * evenCountVar2 + oddCountVar2 * 1L * evenCountVar1;
    }

    public static void main(String[] parameters) {
        GameSolution gameSolutionObject = new GameSolution();
        // read var1 and var2 from stdin
        Scanner scannerObject = new Scanner(System.in);
        int var1 = scannerObject.nextInt();
        int var2 = scannerObject.nextInt();
        System.out.println(gameSolutionObject.gameWithFlowers(var1, var2));
        scannerObject.close();
        // terminate 
        System.exit(0);   
    }
}