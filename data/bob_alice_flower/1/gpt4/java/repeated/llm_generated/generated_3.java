import java.util.Scanner;
public class GameSolution {
    public long calculateFlowerGame(int nValue, int mValue) {
        int oddCountNValue = (nValue + 1) / 2, oddCountMValue = (mValue + 1) / 2;
        int evenCountNValue = nValue / 2, evenCountMValue = mValue / 2;
        return longResult = (oddCountNValue * 1L * evenCountMValue) + (oddCountMValue * 1L * evenCountNValue);
    }
    public static void main(String[] parameter) {
        GameSolution newSol = new GameSolution();
        // read nValue and mValue from stdin
        Scanner scannerObj = new Scanner(System.in);
        int nValue = scannerObj.nextInt();
        int mValue = scannerObj.nextInt();
        System.out.println(newSol.calculateFlowerGame(nValue, mValue));
        scannerObj.close();
        // exit 
        System.exit(0);   
    }
}