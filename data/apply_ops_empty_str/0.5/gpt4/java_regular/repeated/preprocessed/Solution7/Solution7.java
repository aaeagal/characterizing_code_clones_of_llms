import java.util.*;
import java.io.*;


class Solution7 {
    public String findLastNonEmptyString(String str) {
        int countArr[] = new int[26];
        int maximum = 0;

        for (int i = 0; i < str.length(); i++) {
            countArr[str.charAt(i) - 'a'] ++;
        }

        for (int i = 0; i < 26; i++) {
            maximum = Math.max(maximum, countArr[i]);
        }

        String answer = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            if (countArr[str.charAt(i) - 'a'] == maximum) {
                countArr[str.charAt(i) - 'a'] --;
                answer = str.charAt(i) + answer;
            }
        }

        return answer;
    }
    
    public static void main(String[] args) {
        Solution7 cloneSol = new Solution7();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(cloneSol.findLastNonEmptyString(str));
        scan.close();
        System.exit(0);
    }
}