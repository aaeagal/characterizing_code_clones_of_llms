import java.util.*;
import java.io.*;
import java.util.stream.*;
class Main {
    public String findLastNonEmptyString(String str) {
        int count[] = new int[26];
        int maximum = 0;
        
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maximum = Math.max(maximum, count[i]);
        }
        
        
        String result = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (count[str.charAt(i) - 'a'] == maximum) {
                count[str.charAt(i) - 'a']--;
                result = str.charAt(i) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Main mainObj = new Main();
        // read string from stdin
        Scanner scannerObj = new Scanner(System.in);
        // read only one line from stdin
        String str = scannerObj.nextLine();
        // call the function and print the result
        System.out.println(mainObj.findLastNonEmptyString(str));
        scannerObj.close();
        // end the program
        System.exit(0);
    }
}