import java.util.*;
import java.io.*;
import java.util.stream.*;




public class Solution6 {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];

        Arrays.fill(freq, 0);
        Arrays.fill(last, -1);

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            last[s.charAt(i) - 'a'] = i;
        }
        
        int maxi = Arrays.stream(freq).max().getAsInt() - 1;
        StringBuilder ans = new StringBuilder();
        
        for (int i = 0; i < 26; i++) {
            if (freq[i] - maxi > 0) {
                ans.append(String.valueOf((char) ('a' + i)).repeat(Math.max(0, freq[i] - maxi)));
            }
        }

        Comparator<Character> customComparator = (a, b) -> last[a - 'a'] - last[b - 'a];

        // Sort the ans string using the custom comparator
        ans.chars().sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        
        return ans.toString();
    }

    public static void main(String[] args) {
        Solution6 solution = new Solution6();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String result = solution.lastNonEmptyString(inputString);
        System.out.println(result);
    }
}
