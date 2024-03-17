import java.util.Scanner;

public class Main {
    public String getLastNonEmptyString(String input) {
        int[] frequency = new int[26];
        int maxFrequency = 0;

        for (char c : input.toCharArray()) {
            frequency[c - 'a']++;
        }

        for (int freq : frequency) {
            maxFrequency = Math.max(maxFrequency, freq);
        }

        StringBuilder result = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            if (frequency[input.charAt(i) - 'a'] == maxFrequency) {
                frequency[input.charAt(i) - 'a']--;
                result.insert(0, input.charAt(i));
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