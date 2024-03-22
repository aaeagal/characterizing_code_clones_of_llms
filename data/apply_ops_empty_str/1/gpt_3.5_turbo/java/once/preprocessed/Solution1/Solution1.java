import java.util.*;
import java.io.*;
import java.util.stream.*;
class Solution1 {
    public String getLastNonEmptyString(String input) {
        int[] letterCount = new int[26];
        int maxCount = 0;
        
        for (int i = 0; i < input.length(); i++) {
            letterCount[input.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxCount = Math.max(maxCount, letterCount[i]);
        }
        
        
        String result = "";
        
        for (int i = input.length() - 1; i >= 0; i--) {
            if (letterCount[input.charAt(i) - 'a'] == maxCount) {
                letterCount[input.charAt(i) - 'a']--;
                result = input.charAt(i) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        Scanner scanner = new Scanner(System.in); 
        String input = scanner.nextLine();
        System.out.println(solution.getLastNonEmptyString(input));
        scanner.close();
        System.exit(0);
    }
}
