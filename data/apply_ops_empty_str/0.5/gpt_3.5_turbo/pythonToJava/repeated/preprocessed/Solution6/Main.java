import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Solution6 sol = new Solution6();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
    }
}