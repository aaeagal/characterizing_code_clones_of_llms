import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution13 {
    private String findLastNonEmptyString(String str) {
        int[] charCountArray = new int[26];
        int maxCount = 0;

        for (int i = 0; i < str.length(); i++) {
            charCountArray[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            int value = charCountArray[i];
            if(maxCount < value) {
                maxCount = value;
            }
        }

        StringBuilder result = new StringBuilder();

        for (int j = str.length() - 1; j >= 0; j--) {
            if (charCountArray[str.charAt(j) - 'a'] == maxCount) {
                charCountArray[str.charAt(j) - 'a']--;
                result.insert(0, str.charAt(j));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution13 obj = new Solution13();
        Scanner inputScanner = new Scanner(System.in);
        String inpString = inputScanner.nextLine();
        System.out.println(obj.findLastNonEmptyString(inpString));
        inputScanner.close();
        System.exit(0);
    }
}