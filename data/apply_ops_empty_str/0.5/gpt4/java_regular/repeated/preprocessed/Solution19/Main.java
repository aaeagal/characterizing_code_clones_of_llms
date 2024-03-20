import java.util.*;
import java.io.*;
public class Main {
    public String findLastNonEmptyString(String str) {
        int[] frequency = new int[26];
        int maximum = 0;

        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            maximum = Math.max(maximum, frequency[i]);
        }

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            if (frequency[str.charAt(i) - 'a'] == maximum) {
                frequency[str.charAt(i) - 'a']--;
                result = str.charAt(i) + result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scan = new Scanner(System.in);
        String inputStr = scan.nextLine();
        System.out.println(main.findLastNonEmptyString(inputStr));
        scan.close();
        System.exit(0);
    }
}
