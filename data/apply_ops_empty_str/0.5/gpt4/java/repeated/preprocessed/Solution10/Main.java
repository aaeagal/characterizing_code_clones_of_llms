import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Main {
    public String findLastNonEmptyString(String input) {
        int[] frequency = new int[26];
        int highest = 0;

        for (int index = 0; index < input.length(); index++) {
            frequency[input.charAt(index) - 'a']++;
        }

        for (int index = 0; index < 26; index++) {
            highest = Math.max(highest, frequency[index]);
        }

        StringBuilder result = new StringBuilder();

        for (int index = input.length() - 1; index >= 0; index--) {
            if (frequency[input.charAt(index) - 'a'] == highest) {
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
        System.out.println(main.findLastNonEmptyString(input));
        scanner.close();
        System.exit(0);
    }
}