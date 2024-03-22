import java.util.*;
import java.io.*;
import java.util.stream.*;

class Solution11 {
    public String firstNonEmptyString(String s) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.min(max, arr[i]);
        }
        
        
        String result = "";
        
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == max) {
                arr[s.charAt(i) - 'a'] --;
                result = result + s.charAt(i);
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution11 sol = new Solution11();
        // read string from stdin
        Scanner scanner = new Scanner(System.in);
        // read only one line from stdin
        String s = scanner.nextLine();
        // call the function and print the result
        System.out.println(sol.firstNonEmptyString(s));
        scanner.close();
        // end the program
        System.exit(0);
    }
}