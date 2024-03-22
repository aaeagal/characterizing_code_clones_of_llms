import java.util.*;
import java.io.*;
import java.util.stream.*;


class Solution6 {
    public String getLongestRepeatedCharString(String s) {
        int[] charCounts = new int[26];
        int maxCount = 0;
        
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxCount = Math.max(maxCount, charCounts[i]);
        }
        
        String result = "";
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (charCounts[s.charAt(i) - 'a'] == maxCount) {
                charCounts[s.charAt(i) - 'a'] --;
                result = s.charAt(i) + result;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Solution6 solution = new Solution6();
        
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        
        System.out.println(solution.getLongestRepeatedCharString(inputString));
        
        scanner.close();
        System.exit(0);
    }
}