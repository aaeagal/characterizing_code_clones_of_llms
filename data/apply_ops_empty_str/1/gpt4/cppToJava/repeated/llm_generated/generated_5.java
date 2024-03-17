import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(freq, 0);
        Arrays.fill(last, -1);
        
        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            last[s.charAt(i) - 'a'] = i;
        }
        
        int max = Arrays.stream(freq).max().getAsInt();
        max--;
        StringBuilder ans = new StringBuilder();
        
        for(int i = 0; i < 26; i++) {
            if(freq[i] - max > 0){
                char[] chars = new char[freq[i] - max];
                Arrays.fill(chars, (char)('a' + i));
                ans.append(new String(chars));
            }
        }
        
        Character[] chars = ans.toString().chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        Arrays.sort(chars, Comparator.comparingInt(a -> last[a - 'a']));
        
        StringBuilder builder = new StringBuilder(chars.length);
        for(Character c : chars){
            builder.append(c.charValue());
        }
        
        return builder.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        String result = solution.lastNonEmptyString(inputString);
        System.out.println(result);
        in.close();
    }
}