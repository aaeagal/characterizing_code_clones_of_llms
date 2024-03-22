import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        Solution8 sol = new Solution8();
        // read only one line
        Scanner in = new Scanner(System.in);
        String s = in.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        // end the program
        System.exit(0);
    }
}
