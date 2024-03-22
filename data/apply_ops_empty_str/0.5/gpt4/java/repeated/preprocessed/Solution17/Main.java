import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Main {
    public String findLastNonEmptyString(String inputStr) {
        int[] countArr = new int[26];
        int maxCount = 0;

        for (int index = 0; index < inputStr.length(); index++) {
            countArr[inputStr.charAt(index) - 'a']++;
        }

        for (int index = 0; index < 26; index++) {
            maxCount = Math.max(maxCount, countArr[index]);
        }

        StringBuilder resultStr = new StringBuilder();

        for (int index = inputStr.length() - 1; index >= 0; index--) {
            if (countArr[inputStr.charAt(index) - 'a'] == maxCount) {
                countArr[inputStr.charAt(index) - 'a']--;
                resultStr.insert(0, inputStr.charAt(index));
            }
        }

        return resultStr.toString();
    }

    public static void main(String[] args) {
        Main mainObj = new Main();
        Scanner scannerObj = new Scanner(System.in);
        String inputStr = scannerObj.nextLine();
        System.out.println(mainObj.findLastNonEmptyString(inputStr));
        scannerObj.close();
        System.exit(0);
    }
}