import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        Scanner scanner = new Scanner(System.in);

        // read only one line from stdin
        String inputString = scanner.nextLine();

        // call the solution's function and get the result
        String result = solution.lastNonEmptyString(inputString);

        // output the result to stdout
        System.out.println(result);
    }
}