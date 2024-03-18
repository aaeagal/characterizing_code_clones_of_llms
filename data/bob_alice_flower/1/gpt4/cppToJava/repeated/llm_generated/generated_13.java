Here is how you can write the semantic code clone of the given C++ code in Java:

```Java
import java.util.Scanner;

class Solution {
    public long flowerGame(int n, int m) {
        long AOdd = n % 2 == 1 ? n / 2 + 1 : n / 2;
        long AEven = n / 2;
        long BOdd = m % 2 == 1 ? m / 2 + 1 : m / 2;
        long BEven = m / 2;
        return AOdd * BEven + AEven * BOdd;
    }
};

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            int n = Integer.parseInt(numbers[0]);
            int m = Integer.parseInt(numbers[1]);

            long result = solution.flowerGame(n, m);
            System.out.println(result);
        }

        scanner.close();
    }
}
```
The Java code performs the same operations as our initial C++ code. We first create a solution class that has a method for our calculation and then create a main method to read user input and call our solution method. The Java's `Scanner` class is used for reading user input.