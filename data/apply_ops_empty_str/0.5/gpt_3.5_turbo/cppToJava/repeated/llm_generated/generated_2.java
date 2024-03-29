import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            last[s.charAt(i) - 'a'] = i;
        }
        int maxi = Arrays.stream(freq).max().getAsInt() - 1;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] - maxi > 0) {
                ans.append(String.join("", Collections.nCopies(freq[i] - maxi, String.valueOf((char) ('a' + i))));
            }
        }

        List<Character> chars = ans.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        chars.sort((a, b) -> last[a - 'a'] - last[b - 'a']);

        StringBuilder sortedAns = new StringBuilder();
        for (char c : chars) {
            sortedAns.append(c);
        }

        return sortedAns.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String inputString = System.console().readLine();

        String result = solution.lastNonEmptyString(inputString);

        System.out.println(result);
    }
}