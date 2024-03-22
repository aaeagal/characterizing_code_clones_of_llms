import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        // call the solution's function and get the result
        String result = solution.lastNonEmptyString(inputString);

        // output the result to stdout
        System.out.println(result);
        
        scanner.close();
    }
}
