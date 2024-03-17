import java.util.Scanner;
public class Main {
    public String getLastNonEmptyString(String input) {
        int numbers[] = new int[26];
        int largest = 0;

        for (int index = 0; index < input.length(); index++) {
            numbers[input.charAt(index) - 'a']++;
        }

        for (int index = 0; index < 26; index++) {
            largest = Math.max(largest, numbers[index]);
        }

        StringBuilder result = new StringBuilder();

        for (int index = input.length() - 1; index >= 0; index--) {
            if (numbers[input.charAt(index) - 'a'] == largest) {
                numbers[input.charAt(index) - 'a']--;
                result.insert(0, input.charAt(index));
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        Main mainInstance = new Main();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(mainInstance.getLastNonEmptyString(input));
        scanner.close();
        System.exit(0);
    }
}