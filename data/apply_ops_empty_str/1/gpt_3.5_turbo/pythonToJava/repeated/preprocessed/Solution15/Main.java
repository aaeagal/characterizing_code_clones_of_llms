import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Main {

    public static void main(String[] args) {
        Solution15 sol = new Solution15();
        // read only one line
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        scanner.close();
        System.out.println(sol.lastNonEmptyString(s));
        // end the program
        System.exit(0);
    }
}

