import java.util.*;
import java.io.*;
import java.util.stream.*;

class Solution8 {
    public String fetchLastNonEmptyString(String str) {
        int frequency[] = new int[26];
        int greatest = 0;
        
        for (int index = 0; index < str.length(); index++) {
            frequency[str.charAt(index) - 'a'] ++;
        }
        
        for (int index = 0; index < 26; index++) {
            greatest = Math.max(greatest, frequency[index]);
        }  
        
        String answer = "";
        
        for (int index = str.length() - 1; index >= 0; index--) {
            if (frequency[str.charAt(index) - 'a'] == greatest) {
                frequency[str.charAt(index) - 'a'] --;
                answer = str.charAt(index) + answer;
            }
        }
        
        return answer;
    }
    public static void main(String[] args) {
        Solution8 solutionInstance = new Solution8();
        // create new scanner to fetch input
        Scanner inputReader = new Scanner(System.in);
        // read line from the scanner
        String str = inputReader.nextLine();
        // invoke method and produce output
        System.out.println(solutionInstance.fetchLastNonEmptyString(str));
        inputReader.close();
        // terminate the program
        System.exit(0);
    }
}