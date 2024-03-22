import java.util.*;
import java.io.*;
import java.util.stream.*;


class Solution19 {
    public String findLastNonEmptyStr(String inputString) {
        int freq[] = new int[26];
        int highest = 0;
        
        for (int count = 0; count < inputString.length(); count++) {
            freq[inputString.charAt(count) - 'a']++;
        }
        
        for (int count = 0; count < 26; count++) {
            highest = Math.max(highest, freq[count]);
        }
        
        String result = "";
        
        for (int count = inputString.length() - 1; count >= 0; count--) {
            if (freq[inputString.charAt(count) - 'a'] == highest) {
                freq[inputString.charAt(count) - 'a']--;
                result = inputString.charAt(count) + result;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution19 ex = new Solution19();
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();
        System.out.println(ex.findLastNonEmptyStr(inputStr));
        in.close();
        System.exit(0);
    }
}
