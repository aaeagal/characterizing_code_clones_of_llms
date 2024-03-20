import java.util.*;
import java.io.*;
class Solution3 {
    public String retrieveLastNonEmptyString(String inputString) {
        int[] characterCounts = new int[26];
        int maxCount = 0;
        
        for (int index = 0; index < inputString.length(); index++) {
            characterCounts[inputString.charAt(index) - 'a']++;
        }
        
        for (int index = 0; index < 26; index++) {
            maxCount = Math.max(maxCount, characterCounts[index]);
        }
        
        String result = "";
        
        for (int index = inputString.length() - 1; index >= 0; index--) {
            if (characterCounts[inputString.charAt(index) - 'a'] == maxCount) {
                characterCounts[inputString.charAt(index) - 'a']--;
                result = inputString.charAt(index) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        Scanner scanner = new Scanner(System.in); 
        String inputString = scanner.nextLine();
        System.out.println(solution.retrieveLastNonEmptyString(inputString));
        scanner.close();
        System.exit(0);
    }
}


