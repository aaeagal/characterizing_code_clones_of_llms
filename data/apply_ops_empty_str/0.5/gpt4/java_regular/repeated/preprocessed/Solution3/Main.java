import java.util.*;
import java.io.*;
public class Main {
    public String findLastNonEmptyString(String str) {
        int count[] = new int[26];
        int highest = 0;
        
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            highest = Math.max(highest, count[i]);
        }
        
        
        String result = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (count[str.charAt(i) - 'a'] == highest) {
                count[str.charAt(i) - 'a'] --;
                result = str.charAt(i) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Main main = new Main();
        // read string from stdin
        Scanner scanner = new Scanner(System.in);
        // read only one line from stdin
        String str = scanner.nextLine();
        // call the function and print the result
        System.out.println(main.findLastNonEmptyString(str));
        scanner.close();
        // end the program
        System.exit(0);
    }
}