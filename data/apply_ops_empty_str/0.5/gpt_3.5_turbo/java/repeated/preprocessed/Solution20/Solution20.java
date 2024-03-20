import java.util.*;
import java.io.*;

class Solution20 {
    public String lastNonEmptyString(String input) {
        int[] charCount = new int[26];
        int maxCount = 0;
        
        for (int index = 0; index < input.length(); index++) {
            charCount[input.charAt(index) - 'a'] ++;
        }
        
        for (int index = 0; index < 26; index++) {
            maxCount = Math.max(maxCount, charCount[index]);
        }
        
        
        String result = "";
        
        for (int index = input.length() - 1; index >= 0; index--) {
            if (charCount[input.charAt(index) - 'a'] == maxCount) {
                charCount[input.charAt(index) - 'a'] --;
                result = input.charAt(index) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] arguments) {
        Solution20 solution = new Solution20();
        // read input string from console
        Scanner scanner = new Scanner(System.in);
        // read only one line from console
        String inputString = scanner.nextLine();
        // call the function and print the result
        System.out.println(solution.lastNonEmptyString(inputString));
        scanner.close();
        // end the program
        System.exit(0);
    }
}