import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Main {
    public String fetchLastNonEmptyString(String input) {
        int frequency[] = new int[26];
        int maxFreq = 0;

        for (int index = 0; index < input.length(); index++) {
            frequency[input.charAt(index) - 'a'] ++;
        }

        for (int index = 0; index < 26; index++) {
            maxFreq = Math.max(maxFreq, frequency[index]);
        }


        String response = "";

        for (int index = input.length() - 1; index >= 0; index--) {
            if (frequency[input.charAt(index) - 'a'] == maxFreq) {
                frequency[input.charAt(index) - 'a'] --;
                response = input.charAt(index) + response;
            }
        }

        return response;
    }
    public static void main(String[] args) {
        Main mainObj = new Main();
        // Receive string from standard input
        Scanner scannerObj = new Scanner(System.in);
        // Receive only one line from stdin
        String inputStr = scannerObj.nextLine();
        // call the function and print the result
        System.out.println(mainObj.fetchLastNonEmptyString(inputStr));
        scannerObj.close();
        // end the program
        System.exit(0);
    }
}