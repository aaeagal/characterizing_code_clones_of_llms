import java.util.*;
import java.io.*;
class Solution44 {
    public String determineLastNonEmptyString(String text) {
        int[] alphabetCount = new int[26];
        int maxCount = 0;
        
        for (int i = 0; i < text.length(); i++) {
            alphabetCount[text.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxCount = Math.max(maxCount, alphabetCount[i]);
        }
        
        String resultString = "";
        
        for (int i = text.length() - 1; i >= 0; i--) {
            if (alphabetCount[text.charAt(i) - 'a'] == maxCount) {
                alphabetCount[text.charAt(i) - 'a']--;
                resultString = text.charAt(i) + resultString;
            }
        }
        
        return resultString;
    }
    public static void main(String[] args) {
        Solution44 solution = new Solution44();
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(solution.determineLastNonEmptyString(text));
        scanner.close();
        System.exit(0);
    }
}





