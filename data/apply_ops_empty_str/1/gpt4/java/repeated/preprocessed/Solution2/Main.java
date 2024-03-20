import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Main {
    public String getLastNonEmpty(String str) {
        int char_count[] = new int[26];
        int highest = 0;

        for (int pos = 0; pos < str.length(); pos++) {
            char_count[str.charAt(pos) - 'a']++;
        }

        for (int pos = 0; pos < 26; pos++) {
            highest = Math.max(highest, char_count[pos]);
        }

        String result = "";

        for (int pos = str.length() - 1; pos >= 0; pos--) {
            if (char_count[str.charAt(pos) - 'a'] == highest) {
                char_count[str.charAt(pos) - 'a']--;
                result = str.charAt(pos) + result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Main mainObj = new Main();
        Scanner scan = new Scanner(System.in);
        String inputStr = scan.nextLine();
        System.out.println(mainObj.getLastNonEmpty(inputStr));
        scan.close();
        System.exit(0);
    }
}