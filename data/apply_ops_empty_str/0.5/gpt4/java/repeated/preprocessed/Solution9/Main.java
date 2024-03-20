import java.util.*;
import java.io.*;
class Main {
    public String findLastNonEmptyString(String input) {
        int[] frequency = new int[26];
        int maxFrequency = 0;
        
        for (int index = 0; index < input.length(); index++) {
            frequency[input.charAt(index) - 'a']++;
        }
        
        for (int index = 0; index < 26; index++) {
            maxFrequency = Math.max(maxFrequency, frequency[index]);
        }
        
        String result = "";
        
        for (int index = input.length() - 1; index >= 0; index--) {
            if (frequency[input.charAt(index) - 'a'] == maxFrequency) {
                frequency[input.charAt(index) - 'a']--;
                result = input.charAt(index) + result;
            }
        }
        
        return result;
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