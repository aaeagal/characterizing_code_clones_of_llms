import java.util.*;
import java.io.*;
import java.util.stream.*;


class Solution3 {
    public String getFinalNonEmptyString(String inpStr) {
        int alphabets[] = new int[26];
        int predominant = 0;

        for (int i = 0; i < inpStr.length(); i++) {
            alphabets[inpStr.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            predominant = Math.max(predominant, alphabets[i]);
        }

        String result = "";

        for (int i = inpStr.length() - 1; i >= 0; i--) {
            if (alphabets[inpStr.charAt(i) - 'a'] == predominant) {
                alphabets[inpStr.charAt(i) - 'a']--;
                result = inpStr.charAt(i) + result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution3 myClass = new Solution3();
        Scanner scanner = new Scanner(System.in);
        String inpStr = scanner.nextLine();
        System.out.println(myClass.getFinalNonEmptyString(inpStr));
        scanner.close();
        System.exit(0);
    }
}
