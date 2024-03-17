import java.util.Scanner;

public class Main {
    public String findLastNonEmptyString(String inputString) {
        int characterFrequency[] = new int[26];
        int highestFrequency = 0;

        for (int index = 0; index < inputString.length(); index++) {
            characterFrequency[inputString.charAt(index) - 'a']++;
        }

        for (int index = 0; index < 26; index++) {
            highestFrequency = Math.max(highestFrequency, characterFrequency[index]);
        }

        String resultString = "";

        for (int index = inputString.length() - 1; index >= 0; index--) {
            if (characterFrequency[inputString.charAt(index) - 'a'] == highestFrequency) {
                characterFrequency[inputString.charAt(index) - 'a']--;
                resultString = inputString.charAt(index) + resultString;
            }
        }

        return resultString;
    }

    public static void main(String[] args) {
        Main mainInstance = new Main();
        Scanner userInput = new Scanner(System.in);
        String inputString = userInput.nextLine();
        System.out.println(mainInstance.findLastNonEmptyString(inputString));
        userInput.close();
        System.exit(0);
    }
}