import java.util.*;
import java.io.*;
class Solution13 {
    public String findLastNonEmptySubstr(String inputStr) {
        int[] charCounts = new int[26];
        int maxCount = 0;
        
        for (int i = 0; i < inputStr.length(); i++) {
            charCounts[inputStr.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxCount = Math.max(maxCount, charCounts[i]);
        }
        
        String resultStr = "";
        
        for (int i = inputStr.length() - 1; i >= 0; i--) {
            if (charCounts[inputStr.charAt(i) - 'a'] == maxCount) {
                charCounts[inputStr.charAt(i) - 'a']--;
                resultStr = inputStr.charAt(i) + resultStr;
            }
        }
        
        return resultStr;
    }
    public static void main(String[] args) {
        Solution13 solution = new Solution13();
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        System.out.println(solution.findLastNonEmptySubstr(inputStr));
        scanner.close();
        System.exit(0);
    }
}





