import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution18 {
    public String finalNonEmptyString(String str) {
        int[] frequency = new int[26];
        int maximum = 0;
        
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maximum = Math.max(maximum, frequency[i]);
        }
        
        String result = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (frequency[str.charAt(i) - 'a'] == maximum) {
                frequency[str.charAt(i) - 'a']--;
                result = str.charAt(i) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution18 sample = new Solution18();
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(sample.finalNonEmptyString(str));
        input.close();
        System.exit(0);
    }
}