import java.util.*;
import java.io.*;
class Main {
    public String getLastNonEmptyString(String str) {
        int[] frequencyArray = new int[26];
        int maximumFrequency = 0;

        for (int index = 0; index < str.length(); index++) {
            frequencyArray[str.charAt(index) - 'a']++;
        }

        for (int index = 0; index < 26; index++) {
            maximumFrequency = Math.max(maximumFrequency, frequencyArray[index]);
        }

        String result = "";

        for (int index = str.length() - 1; index >= 0; index--) {
            if (frequencyArray[str.charAt(index) - 'a'] == maximumFrequency) {
                frequencyArray[str.charAt(index) - 'a']--;
                result = str.charAt(index) + result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Main mainObj = new Main();
        Scanner inputScanner = new Scanner(System.in);
        String inputString = inputScanner.nextLine();
        System.out.println(mainObj.getLastNonEmptyString(inputString));
        inputScanner.close();
        System.exit(0);
    }
}