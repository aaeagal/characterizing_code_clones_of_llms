import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Solution4 sol = new Solution4();
        System.out.println(sol.lastNonEmptyString(s));
        in.close();
    }
}

