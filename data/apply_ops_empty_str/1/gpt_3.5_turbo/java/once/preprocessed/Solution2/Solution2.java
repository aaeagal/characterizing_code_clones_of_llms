import java.util.*;
import java.io.*;
class Solution2 {
    public String findLastNonEmptyString(String str) {
        int[] charCount = new int[26];
        int maxCount = 0;
        
        for (int index = 0; index < str.length(); index++) {
            charCount[str.charAt(index) - 'a']++;
        }
        
        for (int index = 0; index < 26; index++) {
            maxCount = Math.max(maxCount, charCount[index]);
        }
        
        String result = "";
        
        for (int index = str.length() - 1; index >= 0; index--) {
            if (charCount[str.charAt(index) - 'a'] == maxCount) {
                charCount[str.charAt(index) - 'a']--;
                result = str.charAt(index) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(sol.findLastNonEmptyString(str));
        scanner.close();
        System.exit(0);
    }
}


