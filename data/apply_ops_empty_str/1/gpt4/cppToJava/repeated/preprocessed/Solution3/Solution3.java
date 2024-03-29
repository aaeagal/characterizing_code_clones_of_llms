import java.util.*;
import java.io.*;
import java.util.stream.*;



class Solution3 {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last,-1);

        for(int i=0; i< s.length() ; i++){
            freq[s.charAt(i)-'a']++;
            last[s.charAt(i)-'a']=i;
        }
        int maxi = Arrays.stream(freq).max().getAsInt();
        maxi--;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            if(freq[i]-maxi >0){
                char[] arr = new char[freq[i]-maxi];
                Arrays.fill(arr, (char) ('a' + i));
                ans.append(new String(arr));
            }
        }
        Character[] ansArr = new Character[ans.length()];
        for (int i = 0; i < ans.length(); i++) {
            ansArr[i] = ans.charAt(i);
        }
        Arrays.sort(ansArr, (a, b) -> last[a - 'a'] - last[b - 'a']);
        StringBuilder sortedAns = new StringBuilder(ansArr.length);
        for (Character c : ansArr) {
            sortedAns.append(c.charValue());
        }
        return sortedAns.toString();
    }
}

