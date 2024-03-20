import java.util.*;
import java.io.*;


class Solution10 {
    public String lastNonEmptyString(String st) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int j = 0; j < st.length(); j++) {
            arr[st.charAt(j) - 'a'] ++;
        }
        
        for (int j = 0; j < 26; j++) {
            max = Math.max(max, arr[j]);
        }
        
        String ans = "";
        
        for (int j = st.length() - 1; j >= 0; j--) {
            if (arr[st.charAt(j) - 'a'] == max) {
                arr[st.charAt(j) - 'a'] --;
                ans = st.charAt(j) + ans;
            }
        }
        
        return ans;
    }
    
    public static void main(String[] arguments) {
        Solution10 sol = new Solution10();
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(st));
        scanner.close();
        System.exit(0);
    }
}