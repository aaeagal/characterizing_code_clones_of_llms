import java.util.*;
import java.io.*;
import java.util.stream.*;
class Solution16 {
    public String lastNonEmptyString(String userTextString) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < userTextString.length(); i++) {
            arr[userTextString.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = userTextString.length() - 1; i >= 0; i--) {
            if (arr[userTextString.charAt(i) - 'a'] == max) {
                arr[userTextString.charAt(i) - 'a'] --;
                ans = userTextString.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution16 sol = new Solution16();
        Scanner scanner = new Scanner(System.in);
        String userTextString = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(userTextString));
        scanner.close();
        System.exit(0);
    }
}
