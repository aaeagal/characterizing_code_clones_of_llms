import java.util.Scanner;

public class Solution {
    private String getLastNonEmptyWord(String str) {
        int count[] = new int[26];
        int maxCount = 0;
        
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < count.length; i++) {
            maxCount = Math.max(maxCount, count[i]);
        }
        
        
        StringBuilder lastNonEmptyWord = new StringBuilder();
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (count[str.charAt(i) - 'a'] == maxCount) {
                count[str.charAt(i) - 'a']--;
                lastNonEmptyWord.insert(0, str.charAt(i));
            }
        }
        
        return lastNonEmptyWord.toString();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        Scanner scan = new Scanner(System.in);
        String inputStr = scan.nextLine();
        
        System.out.println(solution.getLastNonEmptyWord(inputStr));
        
        scan.close();
        System.exit(0);
    }
}
