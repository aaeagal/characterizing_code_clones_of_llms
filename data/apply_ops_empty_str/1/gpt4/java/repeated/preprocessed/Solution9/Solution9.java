import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Processor {
    public String retrieveLastNonEmptyString(String inputStr) {
        int[] counterArray = new int[26];
        int maximum = 0;

        for (int i = 0; i < inputStr.length(); i++) {
            counterArray[inputStr.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            maximum = Math.max(maximum, counterArray[i]);
        }

        String resultantStr = "";

        for (int i = inputStr.length() - 1; i >= 0; i--) {
            if (counterArray[inputStr.charAt(i) - 'a'] == maximum) {
                counterArray[inputStr.charAt(i) - 'a']--;
                resultantStr = inputStr.charAt(i) + resultantStr;
            }
        }

        return resultantStr;
    }

    public static void main(String[] args) {
        Processor processor = new Processor();

        Scanner inputScanner = new Scanner(System.in);

        String inputStr = inputScanner.nextLine();

        String outputStr = processor.retrieveLastNonEmptyString(inputStr);

        System.out.println(outputStr);

        inputScanner.close();

        System.exit(0);
    }
}