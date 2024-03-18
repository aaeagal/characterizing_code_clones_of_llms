import java.util.Scanner;

public class GameSolution{
    public long calculateFlowerGameResult(int parameter1, int parameter2){
        int halfParameter1 = (parameter1+1) / 2;
        int halfParameter2 = (parameter2+1) / 2;
        int otherHalfParameter1 = parameter1 / 2;
        int otherHalfParameter2 = parameter2 / 2;
        return (long) halfParameter1 * otherHalfParameter2 + (long) halfParameter2 * otherHalfParameter1;
    }
    
    public static void main(String[] mainArgs){
        GameSolution gs = new GameSolution();
        
        Scanner scan = new Scanner(System.in);
        int firstInput = scan.nextInt();
        int secondInput = scan.nextInt();
        
        System.out.println(gs.calculateFlowerGameResult(firstInput, secondInput));
        scan.close();
        System.exit(0);
    }
}
