Here is a Java semantic code clone of the given C++ code.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        // Continuously read input lines until EOF
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Scanner lineScanner = new Scanner(line);

            // Read the two integers
            int n = lineScanner.nextInt();
            int m = lineScanner.nextInt();

            // Call the solution function and print the result
            System.out.println(solution.flowerGame(n, m));
        }
    }

    static class Solution {
        public long flowerGame(int n, int m) {
            long AOdd = n % 2 == 1 ? n / 2 + 1 : n / 2;
            long AEven = n / 2;
            long BOdd = m % 2 == 1 ? m / 2 + 1 : m / 2;
            long BEven = m / 2;
            return AOdd * BEven + AEven * BOdd;
        }
    }
}