import java.util.*;
import java.io.*;
class Solution9 {
    public String lastNonEmptyString(String userInput) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < userInput.length(); i++) {
            arr[userInput.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = userInput.length() - 1; i >= 0; i--) {
            if (arr[userInput.charAt(i) - 'a'] == max) {
                arr[userInput.charAt(i) - 'a'] --;
                ans = userInput.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution9  sol = new Solution9 ();
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(userInput));
        scanner.close();
        System.exit(0);
    }
}





