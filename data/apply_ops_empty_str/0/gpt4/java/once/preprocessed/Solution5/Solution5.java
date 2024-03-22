import java.util.*;
import java.io.*;
import java.util.stream.*;
class Solution5 {
    public String lastNonEmptyString(String sentence) {
        int arr[] = new int[26];
        int max = 0;
        
        for (int i = 0; i < sentence.length(); i++) {
            arr[sentence.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = sentence.length() - 1; i >= 0; i--) {
            if (arr[sentence.charAt(i) - 'a'] == max) {
                arr[sentence.charAt(i) - 'a'] --;
                ans = sentence.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(sentence));
        scanner.close();
        System.exit(0);
    }
}
