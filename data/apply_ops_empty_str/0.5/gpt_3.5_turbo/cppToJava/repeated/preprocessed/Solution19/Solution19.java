import java.util.*;
import java.io.*;





class Solution19 {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(freq, 0);
        Arrays.fill(last, -1);
        
        for(int i=0; i< s.length() ; i++){
            freq[s.charAt(i)-'a']++;
            last[s.charAt(i)-'a']=i;
        }
        int maxi = Arrays.stream(freq).max().getAsInt();
        maxi--;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            if(freq[i]-maxi >0){
                ans.append(String.valueOf((char)('a' + i)).repeat(freq[i] - maxi));
            }
        }
        Comparator<Character> customComparator = (a, b) -> last[a - 'a'] - last[b - 'a'];

        // Sort the ans string using the custom comparator
        char[] ansArray = ans.toString().toCharArray();
        Arrays.sort(ansArray, customComparator);
        return new String(ansArray);
    }
}

