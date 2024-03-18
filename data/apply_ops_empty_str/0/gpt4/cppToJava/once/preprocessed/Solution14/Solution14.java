import java.util.*;
import java.io.*;
class Solution14 {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);

        for(int i=0; i< s.length() ; i++){
            freq[s.charAt(i)-'a']++;
            last[s.charAt(i)-'a']=i;
        }
        int maxFreq = Arrays.stream(freq).max().getAsInt();
        maxFreq--;
        StringBuilder ans = new StringBuilder();
       