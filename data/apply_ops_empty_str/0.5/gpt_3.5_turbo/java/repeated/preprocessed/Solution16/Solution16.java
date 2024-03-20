import java.util.*;
import java.io.*;

class Solution16 {
    public String findLongestSubstring(String s) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String result = "";
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (arr[s.charAt(i) - 'a'] == max) {
                arr[s.charAt(i) - 'a'] --;
                result = s.charAt(i) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution16 solution = new Solution16();
        // read string from stdin
        Scanner scanner = new Scanner(System.in);
        // read only one line from stdin
        String inputString = scanner.nextLine();
        // call the function and print the result
        System.out.println(solution.findLongestSubstring(inputString));
        scanner.close();
        // end the program
        System.exit(0);
    }
}