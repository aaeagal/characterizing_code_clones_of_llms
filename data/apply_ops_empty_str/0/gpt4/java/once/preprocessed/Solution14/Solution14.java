import java.util.*;
import java.io.*;
import java.util.stream.*;
class Solution14 {
    public String lastNonEmptyString(String userPhrase) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < userPhrase.length(); i++) {
            arr[userPhrase.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = userPhrase.length() - 1; i >= 0; i--) {
            if (arr[userPhrase.charAt(i) - 'a'] == max) {
                arr[userPhrase.charAt(i) - 'a'] --;
                ans = userPhrase.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution14 sol = new Solution14();
        Scanner scanner = new Scanner(System.in);
        String userPhrase = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(userPhrase));
        scanner.close();
        System.exit(0);
    }
}
