import java.util.*;
import java.io.*;
import java.util.stream.*;


class Solution12 {
    public String firstNonEmptyString(String s) {
        int count[] = new int[26];
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            min = Math.min(min, count[i]);
        }
        
        String ans = "";
        
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == min) {
                count[s.charAt(i) - 'a'] --;
                ans = ans + s.charAt(i);
            }
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        Solution12 sol = new Solution12();
        
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.nextLine();
        
        System.out.println(sol.firstNonEmptyString(s));
        scanner.close();
        
        System.exit(0);
    }
}