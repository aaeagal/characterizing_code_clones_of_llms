import java.util.*;
import java.io.*;
public class Main {
    public String getLastNonEmptyString(String input) {
        int[] frequency = new int[26];
        int maximum = 0;

        for (char c : input.toCharArray()) {
            frequency[c - 'a']++;
        }

        for (int freq : frequency) {
            maximum = Math.max(maximum, freq);
        }

        StringBuilder result = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            if (frequency[input.charAt(i) - 'a'] == maximum) {
                frequency[input.charAt(i) - 'a']--;
                result.insert(0, input.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Main main = new Main();
        // read string from stdin
        Scanner scanner = new Scanner(System.in);
        // read only one line from stdin
        String input = scanner.nextLine();
        // call the function and print the result
        System.out.println(main.getLastNonEmptyString(input));
        scanner.close();
        // end the program
        System.exit(0);
    }
}