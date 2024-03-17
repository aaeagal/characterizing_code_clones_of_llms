import java.util.Scanner;

public class Main {

    public String getLastNonEmptyString(String str) {
        int[] frequencyArray = new int[26];
        int maxFrequency = 0;

        for (int index = 0; index < str.length(); index++) {
            frequencyArray[str.charAt(index) - 'a']++;
        }

        for (int index = 0; index < 26; index++) {
            maxFrequency = Math.max(maxFrequency, frequencyArray[index]);
        }

        StringBuilder result = new StringBuilder();

        for (int index = str.length() - 1; index >= 0; index--) {
            if (frequencyArray[str.charAt(index) - 'a'] == maxFrequency) {
                frequencyArray[str.charAt(index) - 'a']--;
                result.insert(0, str.charAt(index));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Main mainClass = new Main();
        Scanner inputScanner = new Scanner(System.in);
        String inputString = inputScanner.nextLine();
        System.out.println(mainClass.getLastNonEmptyString(inputString));
        inputScanner.close();
        System.exit(0);
    }
}