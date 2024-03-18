import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Solution13 solution = new Solution13();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        scanner.close();

        // call the solution's function and get the result
        String result = solution.lastNonEmptyString(inputString);

        // output the result to stdout
        System.out.println(result);
    }
}