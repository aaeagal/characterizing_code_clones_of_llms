import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Main {
    public String findLastNonEmptyString(String str) {
        int[] frequency = new int[26];
        int maximumFrequency = 0;

        for (char c : str.toCharArray()) {
            frequency[c - 'a'] += 1;
        }

        for (int freq : frequency) {
            maximumFrequency = Math.max(maximumFrequency, freq);
        }

        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            if (frequency[str.charAt(i) - 'a'] == maximumFrequency) {
                frequency[str.charAt(i) - 'a']--;
                result.insert(0, str.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner inputScanner = new Scanner(System.in);
        String inputString = inputScanner.nextLine();
        System.out.println(main.findLastNonEmptyString(inputString));
        inputScanner.close();
        System.exit(0);
    }
}