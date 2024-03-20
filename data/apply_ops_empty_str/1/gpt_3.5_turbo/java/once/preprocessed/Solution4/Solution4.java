import java.util.*;
import java.io.*;
class Solution4 {
    public String findLastNonEmptyString(String input) {
        int[] charCount = new int[26];
        int maxCount = 0;
        
        for (int index = 0; index < input.length(); index++) {
            charCount[input.charAt(index) - 'a']++;
        }
        
        for (int index = 0; index < 26; index++) {
            maxCount = Math.max(maxCount, charCount[index]);
        }
        
        String result = "";
        
        for (int index = input.length() - 1; index >= 0; index--) {
            if (charCount[input.charAt(index) - 'a'] == maxCount) {
                charCount[input.charAt(index) - 'a']--;
                result = input.charAt(index) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(solution.findLastNonEmptyString(input));
        scanner.close();
        System.exit(0);
    }
}


