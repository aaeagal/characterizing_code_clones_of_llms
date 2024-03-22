import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Solution3 {
    public String retrieveLastNonEmptyString(String text) {
        int frequencyArray[] = new int[26];
        int highestFrequency = 0;

        for (int i = 0; i < text.length(); i++) {
            frequencyArray[text.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            highestFrequency = Math.max(highestFrequency, frequencyArray[i]);
        }

        String highFrequencyCharString = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            if (frequencyArray[text.charAt(i) - 'a'] == highestFrequency) {
                frequencyArray[text.charAt(i) - 'a']--;
                highFrequencyCharString = text.charAt(i) + highFrequencyCharString;
            }
        }

        return highFrequencyCharString;
    }

    public static void main(String[] programArguments) {
        Solution3 sol3Instance = new Solution3();
        Scanner userInputScanner = new Scanner(System.in);
        String receivedText=userInputScanner.nextLine();
        System.out.println(sol3Instance.retrieveLastNonEmptyString(receivedText));
        userInputScanner.close();
        System.exit(0);
    }
}
