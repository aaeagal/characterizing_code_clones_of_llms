import java.util.*;
import java.io.*;
import java.util.stream.*;
class Solution11 {
    public String lastNonEmptyString(String userLine) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < userLine.length(); i++) {
            arr[userLine.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = userLine.length() - 1; i >= 0; i--) {
            if (arr[userLine.charAt(i) - 'a'] == max) {
                arr[userLine.charAt(i) - 'a'] --;
                ans = userLine.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution11 sol = new Solution11();
        Scanner scanner = new Scanner(System.in);
        String userLine = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(userLine));
        scanner.close();
        System.exit(0);
    }
}
