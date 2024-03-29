import java.util.Scanner;
class Solution {
    public String firstNonEmptyString(String s) {
        int arr[] = new int[26];
        int min = 0;
        
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            min = Math.min(min, arr[i]);
        }
        
        
        String ans = "";
        
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == min) {
                arr[s.charAt(i) - 'a'] ++;
                ans = s.charAt(i) + ans;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        // read string from stdin
        Scanner scanner = new Scanner(System.in);
        // read only one line from stdin
        String s = scanner.nextLine();
        // call the function and print the result
        System.out.println(sol.firstNonEmptyString(s));
        scanner.close();
        // end the program
        System.exit(0);
    }
}