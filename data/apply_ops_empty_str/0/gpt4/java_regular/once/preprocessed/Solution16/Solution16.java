import java.util.*;
import java.io.*;
import java.util.stream.*;
class Solution16 {
    public String getLastNonEmptySubstr(String str) {
        int[] charFreq = new int[26];
        int maxFreq = 0;
        
        for (int i = 0; i < str.length(); i++) {
            charFreq[str.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maxFreq = Math.max(maxFreq, charFreq[i]);
        }
        
        String resultStr = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (charFreq[str.charAt(i) - 'a'] == maxFreq) {
                charFreq