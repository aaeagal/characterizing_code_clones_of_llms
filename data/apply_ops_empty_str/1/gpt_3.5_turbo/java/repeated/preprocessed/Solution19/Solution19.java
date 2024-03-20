import java.util.*;
import java.io.*;

class Solution19 {
    public String findHighestFrequencyChar(String input) {
        int[] freq = new int[26];
        int maxFreq = 0;
        
        for (int i = 0; i < input.length(); i++) {
            freq[input.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxFreq = Math.max(maxFreq, freq[i]);
        }
        
        String result = "";
        
        for (int i = input.length() - 1; i >= 0; i--) {
            if (freq[input.charAt(i) - 'a'] == maxFreq) {
                freq[input.charAt(i) - 'a']--;
                result = input.charAt(i) + result;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Solution19 solution = new Solution19();
        
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        System.out.println(solution.findHighestFrequencyChar(input));
        scanner.close();
    }
}