import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Solution19 sol = new Solution19();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        scanner.close();
    }
}