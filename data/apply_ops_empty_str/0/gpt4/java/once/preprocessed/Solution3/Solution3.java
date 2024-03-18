import java.util.*;
import java.io.*;
class Solution3 {
    public String lastNonEmptyString(String text) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < text.length(); i++) {
            arr[text.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = text.length() - 1; i >= 0; i--) {
            if (arr[text.charAt(i) - 'a'] == max) {
                arr[text.charAt(i) - 'a'] --;
                ans = text.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution3  sol = new Solution3 ();
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(text));
        scanner.close();
        System.exit(0);
    }
}





