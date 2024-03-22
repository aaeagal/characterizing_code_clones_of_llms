import java.util.*;
import java.io.*;
import java.util.stream.*;
class Solution8 {
    public String lastNonEmptyString(String inputString) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < inputString.length(); i++) {
            arr[inputString.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = inputString.length() - 1; i >= 0; i--) {
            if (arr[inputString.charAt(i) - 'a'] == max) {
                arr[inputString.charAt(i) - 'a'] --;
                ans = inputString.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution8 sol = new Solution8();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(inputString));
        scanner.close();
        System.exit(0);
    }
}
