import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution4 {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);

        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            last[s.charAt(i) - 'a'] = i;
        }
        
        int maxi = Arrays.stream(freq).max().getAsInt();
        maxi--;
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < 26; i++){
            if(freq[i] - maxi > 0){
                char[] chars = new char[freq[i] - maxi];
                Arrays.fill(chars, (char)('a' + i));
                ans.append(new String(chars));
            }
        }
                
        Character[] sortedChars = new Character[ans.length()];
        for(int i = 0; i < sortedChars.length; i++) {
            sortedChars[i] = ans.charAt(i);
        }
        
        Arrays.sort(sortedChars, (a, b) -> last[a - 'a'] - last[b - 'a']);
        
        StringBuilder sortedAns = new StringBuilder(sortedChars.length);
        for(Character c: sortedChars) {
            sortedAns.append(c.charValue());
        }
        
        return sortedAns.toString();
    }

    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        Scanner scanner = new Scanner(System.in);
        
        String inputString = scanner.nextLine();
        String result = solution.lastNonEmptyString(inputString);

        System.out.println(result);
    }
}
