import java.util.Scanner;

public class Main {
    public String getLastNonEmptyString(String input) {
        int[] frequency = new int[26];
        int maximum = 0;

        for (int index = 0; index < input.length(); index++) {
            frequency[input.charAt(index) - 'a']++;
        }

        for (int index = 0; index < 26; index++) {
            maximum = Math.max(maximum, frequency[index]);
        }

        StringBuilder result = new StringBuilder();

        for (int index = input.length() - 1; index >= 0; index--) {
            if (frequency[input.charAt(index) - 'a'] == maximum) {
                frequency[input.charAt(index) - 'a']--;
                result.insert(0, input.charAt(index));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Main mainObject = new Main();
        Scanner scannerInput = new Scanner(System.in);
        String input = scannerInput.nextLine();
        System.out.println(mainObject.getLastNonEmptyString(input));
        scannerInput.close();
        System.exit(0);
    }
}