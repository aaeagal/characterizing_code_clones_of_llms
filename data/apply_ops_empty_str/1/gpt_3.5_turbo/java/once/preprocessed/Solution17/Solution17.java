import java.util.*;
import java.io.*;
class Solution17 {
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
        Solution17 sol = new Solution17();
        Scanner scanner =