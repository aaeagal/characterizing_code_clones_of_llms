import java.util.*;
import java.io.*;
class Solution14 {
    public String getLastNonEmptySubsequence(String sequence) {
        int[] charFrequencies = new int[26];
        int maxFrequency = 0;
        
        for (int i = 0; i < sequence.length(); i++) {
            charFrequencies[sequence.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxFrequency = Math.max(maxFrequency, charFrequencies[i]);
        }
        
        String resultSequence = "";
        
        for (int i = sequence.length() - 1; i >= 0; i--) {
            if (charFrequencies[sequence.charAt(i) - 'a'] == maxFrequency) {
                charFrequencies[sequence.charAt(i) - 'a']--;
                resultSequence = sequence.charAt(i) + resultSequence;
            }
        }
        
        return resultSequence;
    }
    public static void main(String[] args) {
        Solution14 solution = new Solution14();
        Scanner scanner = new Scanner(System.in);
        String sequence = scanner.nextLine();
        System.out.println(solution.getLastNonEmptySubsequence(sequence));
        scanner.close();
        System.exit(0);
    }
}





