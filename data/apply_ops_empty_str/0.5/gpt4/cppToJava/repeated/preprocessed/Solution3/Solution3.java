import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution3 {
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
        Character[] ansArray = ans.toString().chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        Arrays.sort(ansArray, Comparator.comparingInt(a -> last[a - 'a']));
        StringBuilder sortedAns = new StringBuilder(ansArray.length);
        for (Character c : ansArray) {
            sortedAns.append(c.charValue());
        }
        return sortedAns.toString();
    }

    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String result = solution.lastNonEmptyString(inputString);
        System.out.println(result);
    }
}
