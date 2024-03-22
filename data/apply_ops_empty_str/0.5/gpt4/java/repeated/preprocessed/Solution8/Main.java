import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Main {
    public String getLastNonEmptyString(String inputStr) {
        int alphabetCount[] = new int[26];
        int maxCount = 0;
        
        for (int index = 0; index < inputStr.length(); index++) {
            alphabetCount[inputStr.charAt(index) - 'a']++;
        }
        
        for (int index = 0; index < 26; index++) {
            maxCount = Math.max(maxCount, alphabetCount[index]);
        }
        
        String resultStr = "";
        
        for (int index = inputStr.length() - 1; index >= 0; index--) {
            if (alphabetCount[inputStr.charAt(index) - 'a'] == maxCount) {
                alphabetCount[inputStr.charAt(index) - 'a']--;
                resultStr = inputStr.charAt(index) + resultStr;
            }
        }
        
        return resultStr;
    }
    
    public static void main(String[] args) {
        Main mainObj = new Main();
        // read string from stdin
        Scanner scannerObj = new Scanner(System.in);
        // read only one line from stdin
        String inputStr = scannerObj.nextLine();
        // call the function and print the result
        System.out.println(mainObj.getLastNonEmptyString(inputStr));
        scannerObj.close();
        // end the program
        System.exit(0);
    }
}