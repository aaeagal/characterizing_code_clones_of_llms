import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution12 {
    public String getLastNonEmptySubstring(String input) {
        int[] alphabetCount = new int[26];
        int maximumCount = 0;

        for (int index = 0; index < input.length(); index++) {
            alphabetCount[input.charAt(index) - 'a']++;
        }

        for (int index = 0; index < 26; index++) {
            maximumCount = Math.max(maximumCount, alphabetCount[index]);
        }

        StringBuilder result = new StringBuilder();

        for (int index = input.length() - 1; index >= 0; index--) {
            if (alphabetCount[input.charAt(index) - 'a'] == maximumCount) {
                alphabetCount[input.charAt(index) - 'a']--;
                result.insert(0, input.charAt(index));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution12 programInstance = new Solution12();
        Scanner inputScanner = new Scanner(System.in);
        String userInput = inputScanner.nextLine();
        System.out.println(programInstance.getLastNonEmptySubstring(userInput));
        inputScanner.close();
        System.exit(0);
    }
}