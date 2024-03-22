import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution13 solution = new Solution13();

        System.out.println("Enter your string");
        String s = scanner.nextLine().trim();
        System.out.println(solution.lastNonEmptyString(s));

        scanner.close(); // close the scanner
    }
}
