import java.util.*;
import java.io.*;
import java.util.stream.*;
class Solution10 {
    public String lastNonEmptyString(String userText) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < userText.length(); i++) {
            arr[userText.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = userText.length() - 1; i >= 0; i--) {
            if (arr[userText.charAt(i) - 'a'] == max) {
                arr[userText.charAt(i) - 'a'] --;
                ans = userText.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution10 sol = new Solution10();
        Scanner scanner = new Scanner(System.in);
        String userText = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(userText));
        scanner.close();
        System.exit(0);
    }
}
