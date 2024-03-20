import java.util.*;
import java.io.*;


class Solution1 {
    public String getLastNonEmptyString(String str) {
        int[] array = new int[26];
        int maximum = 0;

        for (int i = 0; i < str.length(); i++) {
            array[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            maximum = Math.max(maximum, array[i]);
        }

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            if (array[str.charAt(i) - 'a'] == maximum) {
                array[str.charAt(i) - 'a']--;
                result = str.charAt(i) + result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution1 example = new Solution1();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(example.getLastNonEmptyString(str));
        scanner.close();
        System.exit(0);
    }
}