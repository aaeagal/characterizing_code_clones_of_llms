import java.util.*;
import java.io.*;
class Solution6 {
    public String lastNonEmptyString(String word) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < word.length(); i++) {
            arr[word.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = word.length() - 1; i >= 0; i--) {
            if (arr[word.charAt(i) - 'a'] == max) {
                arr[word.charAt(i) - 'a'] --;
                ans = word.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution6  sol = new Solution6 ();
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(word));
        scanner.close();
        System.exit(0);
    }
}





