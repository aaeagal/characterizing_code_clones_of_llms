import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        String inputString = System.console().readLine();

        String result = solution.lastNonEmptyString(inputString);

        System.out.println(result);
    }
}