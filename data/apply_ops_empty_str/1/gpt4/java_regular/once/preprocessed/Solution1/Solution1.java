import java.util.*;
import java.io.*;
import java.util.stream.*;
class Solution1 {
    public String finalNonEmptyCharacter(String str) {
        int frequency[] = new int[26];
        int maximum = 0;

        for (int idx = 0; idx < str.length(); idx++) {
            frequency[str.charAt(idx) - 'a']++;
        }

        for (int idx = 0; idx < 26; idx++) {
            maximum = Math.max(maximum, frequency[idx]);
        }

        String highFrequencyString="";

        for (int idx=str.length()-1;idx>=0; idx--) {
            if (frequency[str.charAt(idx)-'a'] == maximum) {
                frequency[str.charAt(idx)-'a']--;
                highFrequencyString=str.charAt(idx)+highFrequencyString;
            }
        }

        return highFrequencyString;
    }

    public static void main(String[] params) {
        Solution1 sol1= new Solution1();
        Scanner sc=new Scanner(System.in);
        String input_str = sc.nextLine();
        System.out.println(sol1.finalNonEmptyCharacter(input_str));
        sc.close();
        System.exit(0);
    }
}
