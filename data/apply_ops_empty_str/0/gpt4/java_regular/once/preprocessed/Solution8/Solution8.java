import java.util.*;
import java.io.*;
import java.util.stream.*;
class Solution8 {
    public String getLastNonEmptySubstring(String inputStr) {
        int[] charFreq = new int[26];
        int maxFreq = 0;
        
        for (int i = 0; i < inputStr.length(); i++) {
            charFreq[inputStr.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxFreq = Math.max(maxFreq, charFreq[i]);
        }
        
        String resultStr = "";
        
        for (int i = inputStr.length() - 1; i >= 0; i--) {
            if (charFreq[inputStr.charAt(i) - 'a'] == maxFreq) {
                charFreq[inputStr.charAt(i) - 'a']--;
                resultStr = inputStr.charAt(i) + resultStr;
            }
        }
        
        return resultStr;
    }
    public static void main(String[] args) {
        Solution8 solution = new Solution8();
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        System.out.println(solution.getLastNonEmptySubstring(inputStr));
        scanner.close();
        System.exit(0);
    }
}
