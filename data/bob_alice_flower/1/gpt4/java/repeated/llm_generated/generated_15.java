```java
import java.util.Scanner;
public class Game {
    public long calculateRounds(int nParameter, int mParameter) {
        int oddN = (nParameter + 1) / 2, oddM = (mParameter + 1) / 2;
        int evenN = nParameter / 2, evenM = mParameter / 2;
        return (long)oddN * evenM + (long)oddM * evenN;
    }
    public static void main(String[] arguments) {
        Game gameInstance = new Game();
        // read n and m from stdin
        Scanner scanInput = new Scanner(System.in);
        int nInput = scanInput.nextInt();
        int mInput = scanInput.nextInt();
        System.out.println(gameInstance.calculateRounds(nInput, mInput));
        scanInput.close();
        System.exit(0);   
    }
}
```