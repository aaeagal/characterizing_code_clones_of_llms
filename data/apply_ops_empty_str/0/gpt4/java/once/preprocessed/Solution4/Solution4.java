import java.util.*;
import java.io.*;
import java.util.stream.*;
class Solution4 {
    public String lastNonEmptyString(String line) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < line.length(); i++) {
            arr[line.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = line.length() - 1; i >= 0; i--) {
            if (arr[line.charAt(i) - 'a'] == max) {
                arr[line.charAt(i) - 'a'] --;
                ans = line.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(line));
        scanner.close();
        System.exit(0);
    }
}
