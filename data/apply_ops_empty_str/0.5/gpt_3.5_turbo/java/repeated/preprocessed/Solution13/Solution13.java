import java.util.*;
import java.io.*;
import java.util.stream.*;


class Solution13 {
    public String firstNonEmptyString(String s) {
        int arr[] = new int[26];
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            min = Math.min(min, arr[i]);
        }
        
        String ans = "";
        
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == min) {
                arr[s.charAt(i) - 'a'] --;
                ans += s.charAt(i);
            }
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        Solution13 sol = new Solution13();
        
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.nextLine();
        
        System.out.println(sol.firstNonEmptyString(s));
        
        scanner.close();
        System.exit(0);
    }
}