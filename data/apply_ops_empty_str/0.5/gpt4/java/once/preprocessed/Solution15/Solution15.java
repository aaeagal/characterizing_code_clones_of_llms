import java.util.*;
import java.io.*;
import java.util.stream.*;
class Solution15 {
    public String calculateLastNonEmptyString(String str) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (arr[str.charAt(i) - 'a'] == max) {
                arr[str.charAt(i) - 'a'] --;
                ans = str.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution15 sol = new Solution15();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(sol.calculateLastNonEmptyString(str));
        scanner.close();
        System.exit(0);
    }
}
