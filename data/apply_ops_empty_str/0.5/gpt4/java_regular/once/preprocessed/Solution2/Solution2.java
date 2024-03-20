import java.util.*;
import java.io.*;
class Solution2 {
    public String findLastNonEmptyString(String s) {
        int arr[] = new int[26];
        int maximum = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            maximum = Math.max(maximum, arr[i]);
        }

        String answer = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            if (arr[s.charAt(i) - 'a'] == maximum) {
                arr[s.charAt(i) - 'a']--;
                answer = s.charAt(i) + answer;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(sol.findLastNonEmptyString(s));
        sc.close();
        System.exit(0);
    }
}
