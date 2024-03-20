import java.util.*;
import java.io.*;
import java.util.stream.*;


class MySolution18 {
    public String getlastNonEmptyStr(String str) {
        int freq[] = new int[26];
        int maxValue = 0;
        
        for (int index = 0; index < str.length(); index++) {
            freq[str.charAt(index) - 'a']++;
        }
        
        for (int index = 0; index < 26; index++) {
            maxValue = Math.max(maxValue, freq[index]);
        }
        
        String result = "";
        
        for (int index = str.length() - 1; index >= 0; index--) {
            if (freq[str.charAt(index) - 'a'] == maxValue) {
                freq[str.charAt(index) - 'a']--;
                result = str.charAt(index) + result;
            }
        }
        
        return result;
    }

    public static void main(String[] mainArgs) {
        MySolution18 mySol = new MySolution18();
        Scanner inputScanner = new Scanner(System.in);
        String strInput = inputScanner.nextLine();
        System.out.println(mySol.getlastNonEmptyStr(strInput));
        inputScanner.close();
        System.exit(0);
    }
}