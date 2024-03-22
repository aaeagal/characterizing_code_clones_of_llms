import java.util.*;
import java.io.*;
import java.util.stream.*;
class Solution12 {
    public String findLastNonEmptyString(String s) {
        int[] count = new int[26];
        int max = 0;
        
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, count[i]);
        }
        
        
        String result = "";
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (count[s.charAt(i) - 'a'] == max) {
                count[s.charAt(i) - 'a'] --;
                result = s.charAt(i) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution12 sol = new Solution12();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(sol.findLastNonEmptyString(s));
        scanner.close();
        System.exit(0);
    }
}
