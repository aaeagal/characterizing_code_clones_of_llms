import java.util.*;
import java.io.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        Scanner scn = new Scanner(System.in);

        // read the string from stdin
        String inputString = scn.nextLine();

        // call the solution's function and get the result
        String result = solution.lastNonEmptyString(inputString);

        // output the result to stdout
        System.out.println(result);

        scn.close();
    }
}
