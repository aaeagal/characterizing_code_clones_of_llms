Below is the Java code which is a clone of the original one:

```java
import java.util.Scanner;
class Game {
    public long playFlowerGame(int p, int q) {
        int oddP = (p + 1) / 2, oddQ = (q + 1) / 2;
        int evenP = p / 2, evenQ = q / 2;
        return oddP * 1L * evenQ + oddQ * 1L * evenP;
    }
    public static void main(String[] args) {
        Game g = new Game();
        // read p and q from stdin
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int q = scan.nextInt();
        System.out.println(g.playFlowerGame(p, q));
        scan.close();
        // exit 
        System.exit(0);   
    }
}
```
Please note that I have changed the names of the class and function along with some variable names, but the overall logic and structure of the program is maintained, hence, this is a clone of the original Java code.