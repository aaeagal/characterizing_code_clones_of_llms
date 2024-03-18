import java.util.*;
import java.io.*;
class Solution7 {
    public String lastNonEmptyString(String phrase) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < phrase.length(); i++) {
            arr[phrase.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = phrase.length() - 1; i >= 0; i--) {
            if (arr[phrase.charAt(i) - 'a'] == max) {
                arr[phrase.charAt(i) - 'a'] --;
                ans = phrase.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution7  sol = new Solution7 ();
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(phrase));
        scanner.close();
        System.exit(0);
    }
}





