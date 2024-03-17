import java.util.Scanner;

class UniqueLetters {
    public String findLastNonEmptyString(String str) {
        int[] count = new int[26];
        int maxCount = 0;

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            maxCount = Math.max(maxCount, count[i]);
        }

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            if (count[str.charAt(i) - 'a'] == maxCount) {
                count[str.charAt(i) - 'a']--;
                result = str.charAt(i) + result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        UniqueLetters uniqueLetters = new UniqueLetters();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(uniqueLetters.findLastNonEmptyString(input));
        scanner.close();
        System.exit(0);
    }
}