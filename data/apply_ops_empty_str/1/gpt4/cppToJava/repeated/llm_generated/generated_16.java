import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);

        for(int i = 0; i < s.length() ; i++){
            freq[s.charAt(i) - 'a']++;
            last[s.charAt(i) - 'a'] = i;
        }

        int maxi = Arrays.stream(freq).max().getAsInt();
        maxi--;
        
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i< 26 ; i++){
            if(freq[i] - maxi >0){
                char[] chars = new char[freq[i] - maxi];
                Arrays.fill(chars, (char) ('a' + i));
                ans.append(new String(chars));
            }
        }

        Character[] ansChars = new Character[ans.length()];
        for(int i = 0; i < ans.length(); i++)
            ansChars[i] = ans.charAt(i);
            
        Arrays.sort(ansChars, (Character a, Character b) -> last[a - 'a'] - last[b - 'a']);

        StringBuilder sortedAns = new StringBuilder(ansChars.length);
        for (Character c : ansChars) {
            sortedAns.append(c.charValue());
        }
        
        return sortedAns.toString();
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        String result = solution.lastNonEmptyString(inputString);

        System.out.println(result);
    }
}