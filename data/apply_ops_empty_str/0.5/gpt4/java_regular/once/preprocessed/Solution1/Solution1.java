import java.util.*;
import java.io.*;
class Solution1 {
    public String getLastNonEmptyString(String str) {
        int[] frequency = new int[26];
        int maxFreq = 0;

        for (int index = 0; index < str.length(); index++) {
            frequency[str.charAt(index) - 'a']++;
        }

        for (int index = 0; index < 26; index++) {
            maxFreq = Math.max(maxFreq, frequency[index]);
        }

        String result = "";

        for (int index = str.length() - 1; index >= 0; index--) {
            if (frequency[str.charAt(index) - 'a'] == maxFreq) {
                frequency[str.charAt(index) - 'a']--;
                result = str.charAt(index) + result;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(solution.getLastNonEmptyString(str));
        input.close();
        System.exit(0);
    }
}
