import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Solution12 solution = new Solution12();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String result = solution.lastNonEmptyString(inputString);
        System.out.println(result);
        scanner.close();
    }
}
