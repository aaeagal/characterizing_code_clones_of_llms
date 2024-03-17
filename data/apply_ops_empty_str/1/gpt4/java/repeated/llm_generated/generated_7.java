import java.util.Scanner;
class Main {
    public String getLastNonEmptyString(String str) {
        int[] asciiCount = new int[26];
        int maxValue = 0;

        for (int i = 0; i < str.length(); i++) {
            asciiCount[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            maxValue = Math.max(maxValue, asciiCount[i]);
        }

        StringBuilder resultStr = new StringBuilder();

        for (int j = str.length() - 1; j >= 0; j--) {
            if (asciiCount[str.charAt(j) - 'a'] == maxValue) {
                asciiCount[str.charAt(j) - 'a']--;
                resultStr.insert(0, str.charAt(j));
            }
        }

        return resultStr.toString();
    }

    public static void main(String... args) {
        Main main = new Main();
        Scanner inScanner = new Scanner(System.in);
        System.out.println(main.getLastNonEmptyString(inScanner.nextLine()));
        inScanner.close();
        System.exit(0);
    }
}