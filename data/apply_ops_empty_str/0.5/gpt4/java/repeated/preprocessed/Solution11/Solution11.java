import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution11 {
    public String getLastNonEmptyString(String inputStr) {
        int[] alphabetCount = new int[26];
        int maxCount = 0;

        for (int index = 0; index < inputStr.length(); index++) {
            alphabetCount[inputStr.charAt(index) - 'a']++;
        }

        for (int index = 0; index < 26; index++) {
            maxCount = Math.max(maxCount, alphabetCount[index]);
        }

        StringBuilder resultStr = new StringBuilder();

        for (int index = inputStr.length() - 1; index >= 0; index--) {
            if (alphabetCount[inputStr.charAt(index) - 'a'] == maxCount) {
                alphabetCount[inputStr.charAt(index) - 'a']--;
                resultStr.insert(0, inputStr.charAt(index));
            }
        }

        return resultStr.toString();
    }

    public static void main(String[] args) {
        Solution11 solutionClone = new Solution11();
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        System.out.println(solutionClone.getLastNonEmptyString(inputStr));
        scanner.close();
        System.exit(0);
    }
}