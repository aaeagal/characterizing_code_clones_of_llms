import java.util.*;
import java.io.*;
import java.util.stream.*;





class Solution14 {
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
                for(int j=0; j<freq[i]-maxi; j++){
                    ans.append((char)('a' + i));
                }
            }
        }
        List<Character> customComparator = new ArrayList<>();
        for(char c='a'; c<='z'; c++){
            customComparator.add(c);
        }

        Collections.sort(customComparator, (a, b) -> {
            return last[a - 'a'] - last[b - 'a];
        });

        // Sort the ans string using the custom comparator
        ans = new StringBuilder(ans.toString());
        Collections.sort(customComparator, (a, b) -> {
            return last[a - 'a'] - last[b - 'a];
        });

        return ans.toString();
    }
}

