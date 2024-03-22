import java.util.*;
import java.io.*;
import java.util.stream.*;

class Solution12 {
    public String lastValidString(String str) {
        int countArray[] = new int[26];
        int maximum = 0;
        
        for (int index = 0; index < str.length(); index++) {
            countArray[str.charAt(index) - 'a'] ++;
        }
        
        for (int index = 0; index < 26; index++) {
            maximum = Math.max(maximum, countArray[index]);
        }
        
        
        String result = "";
        
        for (int index = str.length() - 1; index >= 0; index--) {
            if (countArray[str.charAt(index) - 'a'] == maximum) {
                countArray[str.charAt(index) - 'a'] --;
                result = str.charAt(index) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution12 example = new Solution12();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(example.lastValidString(str));
        scan.close();
        System.exit(0);
    }
}