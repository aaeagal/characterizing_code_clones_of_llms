import java.util.Scanner;

class Answer {
    public String findLastNonEmptyString(String str) {
        int freq[] = new int[26];
        int maximum = 0;

        for (int index = 0; index < str.length(); index++) {
            freq[str.charAt(index) - 'a'] ++;
        }

        for (int index = 0; index < 26; index++) {
            maximum = Math.max(maximum, freq[index]);
        }

        String result = "";

        for (int index = str.length() - 1; index >= 0; index--) {
            if (freq[str.charAt(index) - 'a'] == maximum) {
                freq[str.charAt(index) - 'a'] --;
                result = str.charAt(index) + result;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Answer ans = new Answer();
        // read string from stdin
        Scanner scanner = new Scanner(System.in);
        // read only one line from stdin
        String str = scanner.nextLine();
        // call the function and print the result
        System.out.println(ans.findLastNonEmptyString(str));
        scanner.close();
        // end the program
        System.exit(0);
    }
}