import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution10 {
    public String getLastNonEmptyStr(String str) {
        int count[] = new int[26];
        int maxCount = 0;

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            maxCount = Math.max(maxCount, count[i]);
        }

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            if (count[str.charAt(i) - 'a'] == maxCount) {
                count[str.charAt(i) - 'a']--;
                result = str.charAt(i) + result;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Solution10 myProgram = new Solution10();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(myProgram.getLastNonEmptyStr(str));
        scanner.close();
        System.exit(0);
    }
}
