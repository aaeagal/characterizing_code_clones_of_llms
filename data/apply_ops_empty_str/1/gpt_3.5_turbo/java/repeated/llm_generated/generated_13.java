import java.util.Scanner;

class Solution {
    public String getMostFrequentCharacter(String input) {
        int[] array = new int[26];
        int maxFrequency = 0;

        for (int i = 0; i < input.length(); i++) {
            array[input.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            maxFrequency = Math.max(maxFrequency, array[i]);
        }

        String result = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            if (array[input.charAt(i) - 'a'] == maxFrequency) {
                array[input.charAt(i) - 'a']--;
                result = input.charAt(i) + result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(solution.getMostFrequentCharacter(input));
        scanner.close();
        System.exit(0);
    }
}