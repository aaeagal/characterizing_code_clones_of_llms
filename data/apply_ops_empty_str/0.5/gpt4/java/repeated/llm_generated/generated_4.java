import java.util.Scanner;

public class Main {
    public String getLastNonEmptyString(String str) {
        int frequency[] = new int[26];
        int maximum = 0;

        for (int index = 0; index < str.length(); index++) {
            frequency[str.charAt(index) - 'a'] ++;
        }

        for (int index = 0; index < 26; index++) {
            maximum = Math.max(maximum, frequency[index]);
        }

        StringBuilder result = new StringBuilder();

        for (int index = str.length() - 1; index >= 0; index--) {
            if (frequency[str.charAt(index) - 'a'] == maximum) {
                frequency[str.charAt(index) - 'a'] --;
                result.insert(0, str.charAt(index));
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner inputScanner = new Scanner(System.in);
        String inputStr = inputScanner.nextLine();
        System.out.println(main.getLastNonEmptyString(inputStr));
        inputScanner.close();
        System.exit(0);
    }
}