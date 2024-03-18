import java.util.*;
import java.io.*;
class Solution66 {
    public String extractLastNonEmptyString(String inputString) {
        int[] letterCount = new int[26];
        int maxLetterCount = 0;
        
        for (int i = 0; i < inputString.length(); i++) {
            letterCount[inputString.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxLetterCount = Math.max(maxLetterCount, letterCount[i]);
        }
        
        String outputString = "";
        
        for (int i = inputString.length() - 1; i >= 0; i--) {
            if (letterCount[inputString.charAt(i) - 'a'] == maxLetterCount) {
                letterCount[inputString.charAt(i) - 'a']--;
                outputString = inputString.charAt(i) + outputString;
            }
        }
        
        return outputString;
    }
    public static void main(String[] args) {
        Solution66 solution = new Solution66();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println(solution.extractLastNonEmptyString(inputString));
        scanner.close();
        System.exit(0);
    }
}





