import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution11Clone {
    public String lastNonEmptySubstring(String inputStr) {
        int lettersCount[] = new int[26];
        int maxValue = 0;
        
        for (int index = 0; index < inputStr.length(); index++) {
            lettersCount[inputStr.charAt(index) - 'a'] ++;
        }
        
        for (int index = 0; index < 26; index++) {
            maxValue = Math.max(maxValue, lettersCount[index]);
        }
        
        
        String resultStr = "";
        
        for (int index = inputStr.length() - 1; index >= 0; index--) {
            if (lettersCount[inputStr.charAt(index) - 'a'] == maxValue) {
                lettersCount[inputStr.charAt(index) - 'a'] --;
                resultStr = inputStr.charAt(index) + resultStr;
            }
        }
        
        return resultStr;
    }
    public static void main(String[] args) {
        Solution11Clone solutionClone = new Solution11Clone();
        
        Scanner userInput = new Scanner(System.in);
        
        String inputStr = userInput.nextLine();
        
        System.out.println(solutionClone.lastNonEmptySubstring(inputStr));
        userInput.close();
        
        System.exit(0);
    }
}