import java.util.*;
import java.io.*;
import java.util.stream.*;



public class Solution6 {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);

        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            last[s.charAt(i) - 'a'] = i;
        }
        int max = Arrays.stream(freq).max().getAsInt();
        max--;
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < 26; i++)
            if(freq[i] - max > 0)
                ans.append(String.valueOf(Character.toChars(i + 97)).repeat(freq[i] - max));
        
        char[] ansChars = ans.toString().toCharArray();
        Character[] ansCharsObj = new Character[ansChars.length];
        for (int i = 0; i < ansChars.length; i++) 
            ansCharsObj[i] = ansChars[i];
            
        Arrays.sort(ansCharsObj, new Comparator<Character>() {
            @Override
            public int compare(Character a, Character b) {
                return Integer.compare(last[a - 'a'], last[b - 'a']);
            }
        });

        StringBuilder sortedAns = new StringBuilder(ansCharsObj.length);
        for (Character c : ansCharsObj) 
            sortedAns.append(c.charValue());

        return sortedAns.toString();
    }

    public static void main(String[] args){
        Solution6 solution = new Solution6();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        String result = solution.lastNonEmptyString(inputString);

        System.out.println(result);
        scanner.close();
    }
}
