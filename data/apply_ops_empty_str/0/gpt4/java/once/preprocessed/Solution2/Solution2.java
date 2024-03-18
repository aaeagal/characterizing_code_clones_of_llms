import java.util.*;
import java.io.*;
class Solution2 {
    public String lastNonEmptyString(String input) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < input.length(); i++) {
            arr[input.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = input.length() - 1; i >= 0; i--) {
            if (arr[input.charAt(i) - 'a'] == max) {
                arr[input.charAt(i) - 'a'] --;
                ans = input.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution2  sol = new Solution2 ();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(input));
        scanner.close();
        System.exit(0);
    }
}





