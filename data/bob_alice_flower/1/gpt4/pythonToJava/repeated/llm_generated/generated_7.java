Here is the Java semantic code clone of the provided Python code:

```java
import java.util.Scanner;

public class Solution {
    public int flowerGame(int n, int m) {
        return m * n / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        
        Solution sol = new Solution();
        System.out.println(sol.flowerGame(n, m));
        scanner.close();
    }
}
```
Please note, Java's division will do integer division by default so there's no need for "//" operator. Also, the sys.exit(0) function used in the python code at the end of the program is not necessary in java, as java will automatically exit the program when the main function finished execution. Therefore, it's not included in the java clone.