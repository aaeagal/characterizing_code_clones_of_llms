import java.util.*;
import java.io.*;
import java.util.stream.*;

class Solution8 {
    public String getLastNonEmptyStr(String inputStr) {
        int freq[] = new int[26];
        int maxFreq = 0;

        for (int i = 0; i < inputStr.length(); i++) {
            freq[inputStr.charAt(i) - 'a'] ++;
        }

        for (int i = 0; i < 26; i++) {
            maxFreq = Math.max(maxFreq, freq[i]);
        }

        String result = "";

        for (int i = inputStr.length() - 1; i >= 0; i--) {
            if (freq[inputStr.charAt(i) - 'a'] == maxFreq) {
                freq[inputStr.charAt(i) - 'a'] --;
                result = inputStr.charAt(i) + result;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Solution8 sol2 = new Solution8();
        // read string from stdin
        Scanner scanner = new Scanner(System.in);
        // read only one line from stdin
        String inputStr = scanner.nextLine();
        // call the function and print the result
        System.out.println(sol2.getLastNonEmptyStr(inputStr));
        scanner.close();
        // end the program
        System.exit(0);
    }
}