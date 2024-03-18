```java
import java.util.Scanner;

public class FlowerGame {
    public int flowerGame(int n, int m) {
        return m * n / 2;
    }

    public static void main(String[] args) {
        FlowerGame solution = new FlowerGame();
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        System.out.println(solution.flowerGame(n, m));
        System.exit(0);
    }
}
```