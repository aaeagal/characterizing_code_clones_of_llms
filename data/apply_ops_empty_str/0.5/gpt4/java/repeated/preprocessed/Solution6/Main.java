import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Main {
    public String getLastNonEmptyString(String input) {
        int[] frequency = new int[26];
        int highestFrequency = 0;

        for (char c : input.toCharArray()) {
            frequency[c - 'a']++;
        }

        for (int freq : frequency) {
            highestFrequency = Math.max(highestFrequency, freq);
        }

        StringBuilder result = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            if (frequency[input.charAt(i) - 'a'] == highestFrequency) {
                frequency[input.charAt(i) - 'a']--;
                result.insert(0, input.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Main mainClass = new Main();
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String result = mainClass.getLastNonEmptyString(inputLine);
        System.out.println(result);
        scanner.close();
        System.exit(0);
    }
}