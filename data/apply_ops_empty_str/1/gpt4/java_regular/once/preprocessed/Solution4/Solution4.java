import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Solution4 {
    public String lastNonEmptyCharString(String characterString) {
        int asciiRecordArray[] = new int[26];
        int maxValue = 0;

        for (int counter = 0; counter < characterString.length(); counter++) {
            asciiRecordArray[characterString.charAt(counter) - 'a'] += 1;
        }

        for (int counter = 0; counter < 26; counter++) {
            maxValue = Math.max(maxValue, asciiRecordArray[counter]);
        }

        String maxOccurrenceString = "";

        for (int counter = characterString.length() - 1; counter >= 0; counter--) {
            if (asciiRecordArray[characterString.charAt(counter) - 'a'] == maxValue) {
                asciiRecordArray[characterString.charAt(counter) - 'a'] -= 1;
                maxOccurrenceString = characterString.charAt(counter) + maxOccurrenceString;
            }
        }

        return maxOccurrenceString;
    }

    public static void main(String[] args) {
        Solution4 sol4 = new Solution4();
        Scanner scanInput = new Scanner(System.in);
        String inputCharString = scanInput.nextLine();
        System.out.println(sol4.lastNonEmptyCharString(inputCharString));
        scanInput.close();
        System.exit(0);
    }
}
