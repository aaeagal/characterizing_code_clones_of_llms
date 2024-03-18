Below is a Java clone of the given C++ code:

```Java
import java.util.Scanner;

public class Solution
{
    public long flowerGame(int n, int m)
    {
        long AOdd = n % 2 == 1 ? n / 2 + 1 : n / 2;
        long AEven = n / 2;
        long BOdd = m % 2 == 1 ? m / 2 + 1 : m / 2;
        long BEven = m / 2;
        
        return AOdd * BEven + AEven * BOdd;
    }
    
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int n, m;
        
        // Continuously read input lines until EOF
        while (scanner.hasNextLine()) 
        {
            // Read the two integers 
            String[] tokens = scanner.nextLine().split(" ");
            n = Integer.parseInt(tokens[0]);
            m = Integer.parseInt(tokens[1]);
            
            // Call the solution function and print the result
            System.out.println(solution.flowerGame(n, m));
        }
        
        scanner.close();
    }
}
```
This Java code does the same thing as the C++ code. It reads lines of input, splits each line into two integers, passes them to the `flowerGame` method, and prints the result. The `flowerGame` method also has the same logic as in the C++ code. Note that this Java code uses the `Scanner` class to read inputs from the standard input, whereas the C++ code uses the `std::getline` function along with an `std::istringstream`.