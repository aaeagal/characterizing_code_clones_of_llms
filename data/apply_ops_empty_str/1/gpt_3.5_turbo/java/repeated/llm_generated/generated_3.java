import java.util.Scanner;
class Solution {
    public String lastNonEmptyString(String s) {
        int freq[] = new int[26];
        int maxCount = 0;
        
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxCount = Math.max(maxCount, freq[i]);
        }
        
        String result = "";
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (freq[s.charAt(i) - 'a'] == maxCount) {
                freq[s.charAt(i) - 'a'] --;
                result = s.charAt(i) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        // read input string
        Scanner scanner = new Scanner(System.in);
        // read a line of input
        String str = scanner.nextLine();
        // call the method and display the result
        System.out.println(solution.lastNonEmptyString(str));
        scanner.close();
        // end the program
        System.exit(0);
    }
}