import java.util.*;
import java.io.*;
import java.util.stream.*;

class Solution3 {
    public String getLongestSubstring(String str) {
        int[] freq = new int[26];
        int maxFreq = 0;
        
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxFreq = Math.max(maxFreq, freq[i]);
        }
        
        String longestSub = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (freq[str.charAt(i) - 'a'] == maxFreq) {
                freq[str.charAt(i) - 'a']--;
                longestSub = str.charAt(i) + longestSub;
            }
        }
        
        return longestSub;
    }
    
    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        System.out.println(solution.getLongestSubstring(input));
        
        scanner.close();
        System.exit(0);
    }
}