import java.util.*;
import java.io.*;
class Solution9 {
    public String findLastNonEmptySubstring(String str) {
        int[] charCounts = new int[26];
        int maxCount = 0;
        
        for (int i = 0; i < str.length(); i++) {
            charCounts[str.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxCount = Math.max(maxCount, charCounts[i]);
        }
        
        String result = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (charCounts[str.charAt(i) - 'a'] == maxCount) {
                charCounts[str.charAt(i) - 'a']--;
                result = str.charAt(i) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution9 solution = new Solution9();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution.findLastNonEmptySubstring(str));
        scanner.close();
        System.exit(0);
    }
}





