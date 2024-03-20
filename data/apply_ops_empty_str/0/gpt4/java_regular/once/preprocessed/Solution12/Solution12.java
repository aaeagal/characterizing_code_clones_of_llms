import java.util.*;
import java.io.*;
class Solution12 {
    public String getLastNonEmptySubstr(String str) {
        int[] charFreq = new int[26];
        int maxFreq = 0;
        
        for (int i = 0; i < str.length(); i++) {
            charFreq[str.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxFreq = Math.max(maxFreq, charFreq[i]);
        }
        
        String resultStr = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (charFreq[str.charAt(i) - 'a'] == maxFreq) {
                charFreq[str.charAt(i) - 'a']--;
                resultStr = str.charAt(i) + resultStr;
            }
        }
        
        return resultStr;
    }
    public static void main(String[] args) {
        Solution12 solution = new Solution12();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution.getLastNonEmptySubstr(str));
        scanner.close();
        System.exit(0);
    }
}





