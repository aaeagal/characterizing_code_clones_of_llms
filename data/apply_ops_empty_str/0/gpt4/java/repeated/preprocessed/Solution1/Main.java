import java.util.*;
import java.io.*;
public class Main {
    public String getLastNonEmptyString(String input) {
        int[] frequency = new int[26];
        int highestFrequency = 0;

        for (int index = 0; index < input.length(); index++) {
            frequency[input.charAt(index) - 'a']++;
        }

        for (int index = 0; index < 26; index++) {
            highestFrequency = Math.max(highestFrequency, frequency[index]);
        }

        StringBuilder result = new StringBuilder();

        for (int index = input.length() - 1; index >= 0; index--) {
            if (frequency[input.charAt(index) - 'a'] == highestFrequency) {
                frequency[input.charAt(index) - 'a']--;
                result.insert(0, input.charAt(index));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(main.getLastNonEmptyString(input));
        scanner.close();
        System.exit(0);
    }
}