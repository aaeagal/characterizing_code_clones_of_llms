import java.util.*;
import java.io.*;
import java.util.stream.*;
class Main {
    public String getLastNonEmptyString(String input) {
        int count[] = new int[26];
        int maximum = 0;
        
        for (int index = 0; index < input.length(); index++) {
            count[input.charAt(index) - 'a'] ++;
        }
        
        for (int index = 0; index < 26; index++) {
            maximum = Math.max(maximum, count[index]);
        }
        
        
        String result = "";
        
        for (int index = input.length() - 1; index >= 0; index--) {
            if (count[input.charAt(index) - 'a'] == maximum) {
                count[input.charAt(index) - 'a'] --;
                result = input.charAt(index) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Main main = new Main();
        // read string from stdin
        Scanner scanner = new Scanner(System.in);
        // read only one line from stdin
        String input = scanner.nextLine();
        // call the function and print the result
        System.out.println(main.getLastNonEmptyString(input));
        scanner.close();
        // end the program
        System.exit(0);
    }
}