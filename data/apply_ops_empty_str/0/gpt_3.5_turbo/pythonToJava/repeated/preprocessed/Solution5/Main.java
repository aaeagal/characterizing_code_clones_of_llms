import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}