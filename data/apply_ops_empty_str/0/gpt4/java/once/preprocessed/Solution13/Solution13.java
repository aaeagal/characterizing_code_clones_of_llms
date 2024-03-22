import java.util.*;
import java.io.*;
import java.util.stream.*;
class Solution13 {
    public String lastNonEmptyString(String userWord) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < userWord.length(); i++) {
            arr[userWord.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = userWord.length() - 1; i >= 0; i--) {
            if (arr[userWord.charAt(i) - 'a'] == max) {
                arr[userWord.charAt(i) - 'a'] --;
                ans = userWord.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution13 sol = new Solution13();
        Scanner scanner = new Scanner(System.in);
        String userWord = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(userWord));
        scanner.close();
        System.exit(0);
    }
}
