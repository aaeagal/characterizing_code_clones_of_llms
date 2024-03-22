import java.util.*;
import java.io.*;
import java.util.stream.*;


class Solution4 {
    public String findMostRepeatedCharacter(String str) {
        int[] charCount = new int[26];
        int maxCount = 0;
        
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxCount = Math.max(maxCount, charCount[i]);
        }
        
        String result = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (charCount[str.charAt(i) - 'a'] == maxCount) {
                charCount[str.charAt(i) - 'a']--;
                result = str.charAt(i) + result;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        System.out.println(solution.findMostRepeatedCharacter(input));
        
        scanner.close();
        System.exit(0);
    }
}