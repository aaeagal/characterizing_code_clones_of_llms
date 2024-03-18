import java.util.*;
import java.io.*;
class Solution1111 {
    public String findLastNonEmptySubsequence(String input) {
        int[] charCounts = new int[26];
        int maxCount = 0;
        
        for (int i = 0; i < input.length(); i++) {
            charCounts[input.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxCount = Math.max(maxCount, charCounts[i]);
        }
        
        String result = "";
        
        for (int i = input.length() - 1; i >= 0; i--) {
            if (charCounts[input.charAt(i) - 'a'] == maxCount) {
                charCounts[input.charAt(i) - 'a']--;
                result = input.charAt(i) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution1111 solution = new Solution1111();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(solution.findLastNonEmptySubsequence(input));
        scanner.close();
        System.exit(0);
    }
}





