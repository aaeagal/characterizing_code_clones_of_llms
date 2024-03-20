import java.util.*;
import java.io.*;


class Solution19 {
    public String findLongestSubstring(String str) {
        int[] freq = new int[26];
        int maxFreq = 0;
        
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxFreq = Math.max(maxFreq, freq[i]);
        }
        
        String result = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (freq[str.charAt(i) - 'a'] == maxFreq) {
                freq[str.charAt(i) - 'a']--;
                result = str.charAt(i) + result;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Solution19 solution = new Solution19();
        
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        System.out.println(solution.findLongestSubstring(input));
        
        scanner.close();
        System.exit(0);
    }
}