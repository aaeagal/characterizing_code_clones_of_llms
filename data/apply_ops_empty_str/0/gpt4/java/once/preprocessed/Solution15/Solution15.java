import java.util.*;
import java.io.*;
import java.util.stream.*;
class Solution15 {
    public String lastNonEmptyString(String userInputString) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < userInputString.length(); i++) {
            arr[userInputString.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = userInputString.length() - 1; i >= 0; i--) {
            if (arr[userInputString.charAt(i) - 'a'] == max) {
                arr[userInputString.charAt(i) - 'a'] --;
                ans = userInputString.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution15 sol = new Solution15();
        Scanner scanner = new Scanner(System.in);
        String userInputString = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(userInputString));
        scanner.close();
        System.exit(0);
    }
}
