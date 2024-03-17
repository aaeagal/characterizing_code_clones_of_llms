import java.util.Scanner;
class Solution {
    public String findLastNonEmptyString(String str) {
        int[] charCount = new int[26];
        int maxFrequency = 0;
        
        for (int j = 0; j < str.length(); j++) {
            charCount[str.charAt(j) - 'a']++;
        }
        
        for (int j = 0; j < 26; j++) {
            maxFrequency = Math.max(maxFrequency, charCount[j]);
        }
        
        String result = "";
        
        for (int j = str.length() - 1; j >= 0; j--) {
            if (charCount[str.charAt(j) - 'a'] == maxFrequency) {
                charCount[str.charAt(j) - 'a']--;
                result = str.charAt(j) + result;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution.findLastNonEmptyString(str));
        scanner.close();
        System.exit(0);
    }
}