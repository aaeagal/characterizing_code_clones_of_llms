import java.util.*;
import java.io.*;
class Solution5 {
    public String calculateLastNonEmptyString(String line) {
        int[] charCount = new int[26];
        int maxCharCount = 0;
        
        for (int i = 0; i < line.length(); i++) {
            charCount[line.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxCharCount = Math.max(maxCharCount, charCount[i]);
        }
        
        String finalString = "";
        
        for (int i = line.length() - 1; i >= 0; i--) {
            if (charCount[line.charAt(i) - 'a'] == maxCharCount) {
                charCount[line.charAt(i) - 'a']--;
                finalString = line.charAt(i) + finalString;
            }
        }
        
        return finalString;
    }
    public static void main(String[] args) {
        Solution5 solution = new Solution5();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(solution.calculateLastNonEmptyString(line));
        scanner.close();
        System.exit(0);
    }
}





