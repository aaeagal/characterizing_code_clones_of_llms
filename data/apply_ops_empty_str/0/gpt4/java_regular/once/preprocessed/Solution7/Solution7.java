import java.util.*;
import java.io.*;
class Solution7 {
    public String retrieveLastNonEmptyString(String userInput) {
        int[] charFrequency = new int[26];
        int maxFrequency = 0;
        
        for (int i = 0; i < userInput.length(); i++) {
            charFrequency[userInput.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxFrequency = Math.max(maxFrequency, charFrequency[i]);
        }
        
        String result = "";
        
        for (int i = userInput.length() - 1; i >= 0; i--) {
            if (charFrequency[userInput.charAt(i) - 'a'] == maxFrequency) {
                charFrequency[userInput.charAt(i) - 'a']--;
                result = userInput.charAt(i) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution7 solution = new Solution7();
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println(solution.retrieveLastNonEmptyString(userInput));
        scanner.close();
        System.exit(0);
    }
}





