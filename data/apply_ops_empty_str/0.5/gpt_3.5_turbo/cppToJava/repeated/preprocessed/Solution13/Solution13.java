import java.util.*;
import java.io.*;
import java.util.stream.*;





class Solution13 {
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
                ans.append(String.valueOf((char) ('a' + i)).repeat(freq[i] - maxi));
            }
        }

        Map<Character, Integer> lastMap = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            lastMap.put((char) ('a' + i), last[i]);
        }

        // Sort the ans string using the custom comparator
        ans.chars().mapToObj(c -> (char) c).sorted((a, b) -> lastMap.get(a) - lastMap.get(b))
                .forEach(ans::append);

        return ans.toString();
    }
}

