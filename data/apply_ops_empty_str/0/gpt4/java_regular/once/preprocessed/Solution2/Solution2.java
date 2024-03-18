import java.util.*;
import java.io.*;
class Solution22 {
    public String findLastNonEmptyString(String input) {
        int[] count = new int[26];
        int maxCount = 0;
        
        for (int i = 0; i < input.length(); i++) {
            count[input.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxCount = Math.max(maxCount, count[i]);
        }
        
        String output = "";
        
        for (int i = input.length() - 1; i >= 0; i--) {
            if (count[input.charAt(i) - 'a'] == maxCount) {
                count[input.charAt(i) - 'a']--;
                output = input.charAt(i) + output;
            }
        }
        
        return output;
    }
    public static void main(String[] args) {
        Solution22 solution = new Solution22();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(solution.findLastNonEmptyString(input));
        scanner.close();
        System.exit(0);
    }
}





