import java.util.*;
import java.io.*;
class Main {
    public String findLastNonEmptyString(String str) {
        int[] frequency = new int[26];
        int maximum = 0;
        
        for (int index = 0; index < str.length(); index++) {
            frequency[str.charAt(index) - 'a']++;
        }
        
        for (int index = 0; index < 26; index++) {
            maximum = Math.max(maximum, frequency[index]);
        }
        
        
        String result = "";
        
        for (int index = str.length() - 1; index >= 0; index--) {
            if (frequency[str.charAt(index) - 'a'] == maximum) {
                frequency[str.charAt(index) - 'a']--;
                result = str.charAt(index) + result;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(main.findLastNonEmptyString(str));
        scanner.close();
        System.exit(0);
    }
}