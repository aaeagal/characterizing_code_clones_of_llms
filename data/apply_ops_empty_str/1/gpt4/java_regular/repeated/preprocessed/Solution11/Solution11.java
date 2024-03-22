import java.util.*;
import java.io.*;
import java.util.stream.*;


class Solution11 {
    public String getLastNonEmptyString(String str) {
        int freq[] = new int[26];
        int maxFrequency = 0;
        
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxFrequency = Math.max(maxFrequency, freq[i]);
        }
        
        String finalStr = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (freq[str.charAt(i) - 'a'] == maxFrequency) {
                freq[str.charAt(i) - 'a'] --;
                finalStr = str.charAt(i) + finalStr;
            }
        }
        
        return finalStr;
    }
     
    public static void main(String[] args) {
        Solution11 solOne = new Solution11();
        // read string from stdin
        Scanner s = new Scanner(System.in);
        // read only one line from stdin
        String str = s.nextLine();
        // call the function and print the result
        System.out.println(solOne.getLastNonEmptyString(str));
        s.close();
        // end the program
        System.exit(0);
    }
}