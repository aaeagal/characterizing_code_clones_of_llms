import java.util.*;
import java.io.*;
import java.util.stream.*;
class Main {
    public String getLastNonEmptyString(String str) {
        int alphaArr[] = new int[26];
        int largest = 0;
        
        for (int idx = 0; idx < str.length(); idx++) {
            alphaArr[str.charAt(idx) - 'a']++;
        }
        
        for (int idx = 0; idx < 26; idx++) {
            largest = Math.max(largest, alphaArr[idx]);
        }
        
        
        String result = "";
        
        for (int idx = str.length() - 1; idx >= 0; idx--) {
            if (alphaArr[str.charAt(idx) - 'a'] == largest) {
                alphaArr[str.charAt(idx) - 'a']--;
                result = str.charAt(idx) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Main mainObj = new Main();
        Scanner scannerObj = new Scanner(System.in);
        String str = scannerObj.nextLine();
        System.out.println(mainObj.getLastNonEmptyString(str));
        scannerObj.close();
        System.exit(0);
    }
}