import java.util.*;
import java.io.*;
import java.util.stream.*;

class Solution6 {
    public String fetchLastNonEmptyString(String inputData) {
        int frequency[] = new int[26];
        int greatest = 0;
        
        for (int index = 0; index < inputData.length(); index++) {
            frequency[inputData.charAt(index) - 'a'] ++;
        }
        
        for (int index = 0; index < 26; index++) {
            greatest = Math.max(greatest, frequency[index]);
        }
        
        
        String result = "";
        
        for (int index = inputData.length() - 1; index >= 0; index--) {
            if (frequency[inputData.charAt(index) - 'a'] == greatest) {
                frequency[inputData.charAt(index) - 'a'] --;
                result = inputData.charAt(index) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution6 objMainProgram = new Solution6();
        // read string from stdin
        Scanner scannerObj = new Scanner(System.in);
        // read only one line from stdin
        String inputData = scannerObj.nextLine();
        // call the function and print the result
        System.out.println(objMainProgram.fetchLastNonEmptyString(inputData));
        scannerObj.close();
        // end the program
        System.exit(0);
    }
}