Here is a clone of this code:

```java
import java.util.Scanner;

class Game {
    
    public long event(int a, int b) {
        int oddCountA = (a + 1) / 2;
        int oddCountB = (b + 1) / 2;
        int evenCountA = a / 2;
        int evenCountB = b / 2;
        return oddCountA * 1L * evenCountB + oddCountB * 1L * evenCountA;
    }
    
    public static void main(String[] args) {
        Game game = new Game();
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(game.event(a, b));
        scan.close();
        System.exit(0);
    }
}
```
This code clone does the same thing as the original code but different variable names are used.