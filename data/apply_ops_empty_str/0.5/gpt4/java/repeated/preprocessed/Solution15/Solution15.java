import java.util.*;
import java.io.*;


class Solution15Clone {
    public String getLastNonEmptySubstring(String inputStr) {
        int alphabetCount[] = new int[26];
        int maximum = 0;
        
        for (int index = 0; index < inputStr.length(); index++) {
            alphabetCount[inputStr.charAt(index) - 'a'] ++;
        }
        
        for (int index = 0; index < 26; index++) {
            maximum = Math.max(maximum, alphabetCount[index]);
        }
        
        
        String result = "";
        
        for (int index = inputStr.length() - 1; index >= 0; index--) {
            if (alphabetCount[inputStr.charAt(index) - 'a'] == maximum) {
                alphabetCount[inputStr.charAt(index) - 'a'] --;
                result = inputStr.charAt(index) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution15Clone solutionClone = new Solution15Clone();
        // read string from stdin
        Scanner scannerInput = new Scanner(System.in);
        // read only one line from stdin
        String inputStr = scannerInput.nextLine();
        // call the function and print the result
        System.out.println(solutionClone.getLastNonEmptySubstring(inputStr));
        scannerInput.close();
        // end the program
        System.exit(0);
    }
}