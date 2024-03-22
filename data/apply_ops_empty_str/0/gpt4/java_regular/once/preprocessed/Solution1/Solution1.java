import java.util.*;
import java.io.*;
import java.util.stream.*;
class Solution1 {
    public String getLastNonEmptyString(String str) {
        int[] frequency = new int[26];
        int maximum = 0;
        
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maximum = Math.max(maximum, frequency[i]);
        }
        
        String result = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (frequency[str.charAt(i) - 'a'] == maximum) {
                frequency[str.charAt(i) - 'a']--;
                result = str.charAt(i) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution.getLastNonEmptyString(str));
        scanner.close();
        System.exit(0);
    }
}
