import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution20 {
    public String returnLastNonEmptyString(String inputString) {
        int countArray[] = new int[26];
        int maximumCount = 0;

        for (int index = 0; index < inputString.length(); index++) {
            countArray[inputString.charAt(index) - 'a']++;
        }

        for (int index = 0; index < 26; index++) {
            maximumCount = Math.max(maximumCount, countArray[index]);
        }

        StringBuilder answer = new StringBuilder();

        for (int index = inputString.length() - 1; index >= 0; index--) {
            if (countArray[inputString.charAt(index) - 'a'] == maximumCount) {
                countArray[inputString.charAt(index) - 'a']--;
                answer.insert(0, inputString.charAt(index));
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution20 alternativeSolution20 = new Solution20();

        // read string from stdin
        Scanner scannedInput = new Scanner(System.in);

        // read a line from stdin
        String inputString = scannedInput.nextLine();

        // call the method and print the result
        System.out.println(alternativeSolution20.returnLastNonEmptyString(inputString));

        // close scanner
        scannedInput.close();

        // end the program
        System.exit(0);
    }
}