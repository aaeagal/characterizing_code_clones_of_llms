import java.util.*;
import java.io.*;
import java.util.stream.*;

class Solution14 {
    public String getLastNonEmptyString(String input) {
        int alphabets[] = new int[26];
        int highestFrequency = 0;
        
        for (int index = 0; index < input.length(); index++) {
            alphabets[input.charAt(index) - 'a'] ++;
        }
        
        for (int index = 0; index < 26; index++) {
            highestFrequency = Math.max(highestFrequency, alphabets[index]);
        }
        
        String result = "";
        
        for (int index = input.length() - 1; index >= 0; index--) {
            if (alphabets[input.charAt(index) - 'a'] == highestFrequency) {
                alphabets[input.charAt(index) - 'a'] --;
                result = input.charAt(index) + result;
            }
        }
        
        return result;
    }
    
    public static void main(String[] arguments) {
        Solution14 cloneInstance = new Solution14();
        Scanner userScanner = new Scanner(System.in);
        String userInput = userScanner.nextLine();
        System.out.println(cloneInstance.getLastNonEmptyString(userInput));
        userScanner.close();
        System.exit(0);
    }
}