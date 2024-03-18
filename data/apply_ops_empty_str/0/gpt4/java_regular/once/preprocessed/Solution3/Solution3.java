import java.util.*;
import java.io.*;
class Solution33 {
    public String computeLastNonEmptyString(String sequence) {
        int[] freq = new int[26];
        int maxFreq = 0;
        
        for (int i = 0; i < sequence.length(); i++) {
            freq[sequence.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxFreq = Math.max(maxFreq, freq[i]);
        }
        
        String answer = "";
        
        for (int i = sequence.length() - 1; i >= 0; i--) {
            if (freq[sequence.charAt(i) - 'a'] == maxFreq) {
                freq[sequence.charAt(i) - 'a']--;
                answer = sequence.charAt(i) + answer;
            }
        }
        
        return answer;
    }
    public static void main(String[] args) {
        Solution33 solution = new Solution33();
        Scanner scanner = new Scanner(System.in);
        String sequence = scanner.nextLine();
        System.out.println(solution.computeLastNonEmptyString(sequence));
        scanner.close();
        System.exit(0);
    }
}





