import java.util.*;
import java.io.*;
import java.util.stream.*;
class Solution12 {
    public String lastNonEmptyString(String userSentence) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < userSentence.length(); i++) {
            arr[userSentence.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = userSentence.length() - 1; i >= 0; i--) {
            if (arr[userSentence.charAt(i) - 'a'] == max) {
                arr[userSentence.charAt(i) - 'a'] --;
                ans = userSentence.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution12 sol = new Solution12();
        Scanner scanner = new Scanner(System.in);
        String userSentence = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(userSentence));
        scanner.close();
        System.exit(0);
    }
}
