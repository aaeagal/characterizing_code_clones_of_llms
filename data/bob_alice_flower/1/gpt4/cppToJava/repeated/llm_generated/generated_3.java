Here is a semantic code clone of the provided C++ code, written in Java:

```java
import java.util.Scanner;

public class Solution {
    
    public long flowerGame(int n, int m) {
        long AOdd = n % 2 == 1 ? n / 2 + 1 : n / 2;
        long AEven = n / 2;
        long BOdd = m % 2 == 1 ? m / 2 + 1 : m / 2;
        long BEven = m / 2;
        return AOdd * BEven + AEven * BOdd;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String line;
        int n, m;

        // Continuously read input lines until there's no input
        while (scanner.hasNextLine()){
            line = scanner.nextLine();
            String[] inputs = line.split(" ");
            
            // Read the two integers
            n = Integer.parseInt(inputs[0]);
            m = Integer.parseInt(inputs[1]);

            // Call the solution function and print the result
            System.out.println(solution.flowerGame(n, m));
        }

        scanner.close();
    }
}
```
Note: This Java code works similarly as the given C++ code. It reads from the console until no more input is given, splits the line by spaces and assigns the first and second integer to n and m. After that, it calls the method "flowerGame" and prints the result.