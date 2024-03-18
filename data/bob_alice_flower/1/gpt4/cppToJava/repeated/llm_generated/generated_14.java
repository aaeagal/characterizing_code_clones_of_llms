Here is your converted Java code:

```java
import java.util.Scanner;

public class Solution {
    
    public static long flowerGame(int n, int m) {
        long AOdd;
        if(n % 2 == 1) {
          AOdd = n / 2 + 1;
        } else {
          AOdd = n / 2;
        }
        long AEven = n / 2;
        long BOdd;
        if(m % 2 == 1) {
          BOdd = m / 2 + 1;
        } else {
          BOdd = m / 2;
        }
        long BEven = m / 2;
        return AOdd * BEven + AEven * BOdd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        
        // Continuously read input lines until EOF
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");       
            n = Integer.parseInt(tokens[0]);
            m = Integer.parseInt(tokens[1]);

            // Call the solution function and print the result
            System.out.println(flowerGame(n, m));
        }
        sc.close();
    }
}
```