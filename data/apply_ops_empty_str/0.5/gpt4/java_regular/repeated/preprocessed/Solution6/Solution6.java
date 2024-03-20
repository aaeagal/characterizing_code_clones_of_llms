import java.util.*;
import java.io.*;


class Solution6 {
    public String lastNonBlankString(String str) {
        int array[] = new int[26];
        int maxVal = 0;

        for (int i = 0; i < str.length(); i++) {
            array[str.charAt(i) - 'a'] ++;
        }

        for (int i = 0; i < 26; i++) {
            maxVal = Math.max(maxVal, array[i]);
        }

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            if (array[str.charAt(i) - 'a'] == maxVal) {
                array[str.charAt(i) - 'a'] --;
                result = str.charAt(i) + result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution6 answer = new Solution6();
        // read string from stdin
        Scanner scanner = new Scanner(System.in);
        // read only one line from stdin
        String str = scanner.nextLine();
        // call the function and print the result
        System.out.println(answer.lastNonBlankString(str));
        scanner.close();
        // end the program
        System.exit(0);
    }
}