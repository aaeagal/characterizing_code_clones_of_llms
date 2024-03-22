import java.util.*;
import java.io.*;
import java.util.stream.*;
class Main {
    public String getLastNonEmptyString(String str) {
        int[] countArray = new int[26];
        int maximum = 0;

        for (int i = 0; i < str.length(); i++) {
            countArray[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            maximum = Math.max(maximum, countArray[i]);
        }

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            if (countArray[str.charAt(i) - 'a'] == maximum) {
                countArray[str.charAt(i) - 'a']--;
                result = str.charAt(i) + result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Main mainObj = new Main();
        Scanner scannerObj = new Scanner(System.in);
        String inputString = scannerObj.nextLine();
        System.out.println(mainObj.getLastNonEmptyString(inputString));
        scannerObj.close();
        System.exit(0);
    }
}