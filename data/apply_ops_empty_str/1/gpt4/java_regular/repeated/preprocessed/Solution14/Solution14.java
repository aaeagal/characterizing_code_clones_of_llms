import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution14 {
    public String getLastNonEmptyString(String input) {
        int[] countArray = new int[26];
        int maximum = 0;

        for (int i = 0; i < input.length(); i++) {
            countArray[input.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            maximum = Math.max(maximum, countArray[i]);
        }

        String result = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            if (countArray[input.charAt(i) - 'a'] == maximum) {
                countArray[input.charAt(i) - 'a']--;
                result = input.charAt(i) + result;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Solution14 answer = new Solution14();
        // read string from stdin
        Scanner scanner = new Scanner(System.in);
         // read only one line from stdin
        String input = scanner.nextLine();
       // call the function and print the result
        System.out.println(answer.getLastNonEmptyString(input));
        scanner.close();
        // end the program
        System.exit(0);
    }
}