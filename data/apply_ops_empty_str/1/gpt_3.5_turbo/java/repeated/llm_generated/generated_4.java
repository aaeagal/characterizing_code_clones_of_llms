import java.util.Scanner;
class Solution {
    public String getLongestSubstring(String str) {
        int countArr[] = new int[26];
        int maxCount = 0;
        
        for (int i = 0; i < str.length(); i++) {
            countArr[str.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxCount = Math.max(maxCount, countArr[i]);
        }
        
        String longestSubstring = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (countArr[str.charAt(i) - 'a'] == maxCount) {
                countArr[str.charAt(i) - 'a']--;
                longestSubstring = str.charAt(i) + longestSubstring;
            }
        }
        
        return longestSubstring;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(solution.getLongestSubstring(input));
        scanner.close();
        System.exit(0);
    }
}