Here is the equivalent of above code in Java:

```Java
import java.util.Scanner;

public class Solution {
    public long flowerGame(int n, int m) {
        long AOdd = n % 2 == 1 ? n / 2 + 1 : n / 2;
        long AEven = n / 2;
        long BOdd = m % 2 == 1 ? m / 2 + 1 : m / 2;
        long BEven = m / 2;
        return AOdd * BEven + AEven * BOdd;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] splitLine = line.split(" ");
            int n = Integer.parseInt(splitLine[0]);
            int m = Integer.parseInt(splitLine[1]);
            
            // Call the solution function and print the result
            System.out.println(solution.flowerGame(n, m));
        }

        scanner.close();
    }
}
```

This Java code does the same thing as the given C++ code.  One main differences is that the main method is now inside the `Solution` class. Another difference is that Java doesn't have an equivalent for iostream, so Java uses `java.util.Scanner` for user input.