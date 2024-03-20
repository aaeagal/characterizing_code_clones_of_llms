import java.util.*;
import java.io.*;


public class Solution19 {
    public String getLastNonEmptyString(String input) {
        int[] countArray = new int[26];
        int maximum = 0;

        for (int index = 0; index < input.length(); index++) {
            countArray[input.charAt(index) - 'a']++;
        }

        for (int index = 0; index < 26; index++) {
            maximum = Math.max(maximum, countArray[index]);
        }

        String result = "";

        for (int index = input.length() - 1; index >= 0; index--) {
            if (countArray[input.charAt(index) - 'a'] == maximum) {
                countArray[input.charAt(index) - 'a']--;
                result = input.charAt(index) + result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution19 solution = new Solution19();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(solution.getLastNonEmptyString(input));
        scanner.close();
        System.exit(0);
    }
}