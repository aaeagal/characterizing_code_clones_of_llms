import java.util.Scanner;

class Main {
    public String findLastNonEmptyString(String input) {
        int freq[] = new int[26];
        int maximum = 0;

        for (int index = 0; index < input.length(); index++) {
            freq[input.charAt(index) - 'a'] ++;
        }

        for (int index = 0; index < 26; index++) {
            maximum = Math.max(maximum, freq[index]);
        }

        String result = "";

        for (int index = input.length() - 1; index >= 0; index--) {
            if (freq[input.charAt(index) - 'a'] == maximum) {
                freq[input.charAt(index) - 'a'] --;
                result = input.charAt(index) + result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Main solution = new Main();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(solution.findLastNonEmptyString(input));
        scanner.close();
        System.exit(0);
    }
}