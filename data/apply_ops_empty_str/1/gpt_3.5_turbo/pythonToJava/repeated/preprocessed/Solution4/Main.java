import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        // read only one line
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        // end the program
        System.exit(0);
    }
}