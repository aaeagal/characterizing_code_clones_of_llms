import java.util.Scanner;

class Solution {
    public String getLongestNonRepeatingSubstring(String str) {
        int[] charCount = new int[26];
        int maxCount = 0;
        
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxCount = Math.max(maxCount, charCount[i]);
        }
        
        String result = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (charCount[str.charAt(i) - 'a'] == maxCount) {
                charCount[str.charAt(i) - 'a'] --;
                result = str.charAt(i) + result;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println(solution.getLongestNonRepeatingSubstring(inputString));
        scanner.close();
        System.exit(0);
    }
}