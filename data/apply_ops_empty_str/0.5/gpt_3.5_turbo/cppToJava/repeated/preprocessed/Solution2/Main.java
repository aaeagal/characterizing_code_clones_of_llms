import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        String inputString = System.console().readLine();

        String result = solution.lastNonEmptyString(inputString);

        System.out.println(result);
    }
}