import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Main {
    public String getLastNonEmptyString(String inputString) {
        int[] letterCountArray = new int[26];
        int maxCount = 0;

        for (int index = 0; index < inputString.length(); index++) {
            letterCountArray[inputString.charAt(index) - 'a']++;
        }

        for (int index = 0; index < 26; index++) {
            maxCount = Math.max(maxCount, letterCountArray[index]);
        }

        StringBuilder resultString = new StringBuilder();

        for (int index = inputString.length() - 1; index >= 0; index--) {
            if (letterCountArray[inputString.charAt(index) - 'a'] == maxCount) {
                letterCountArray[inputString.charAt(index) - 'a']--;
                resultString.insert(0, inputString.charAt(index));
            }
        }

        return resultString.toString();
    }

    public static void main(String[] args) {
        Main mainInstance = new Main();
        Scanner inputScanner = new Scanner(System.in);
        String inputLine = inputScanner.nextLine();
        System.out.println(mainInstance.getLastNonEmptyString(inputLine));
        inputScanner.close();
        System.exit(0);
    }
}