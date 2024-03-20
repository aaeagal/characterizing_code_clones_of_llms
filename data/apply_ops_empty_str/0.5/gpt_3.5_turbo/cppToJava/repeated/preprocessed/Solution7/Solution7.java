import java.util.*;
import java.io.*;





class Solution7 {
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
                ans.append(String.join("", Collections.nCopies(freq[i] - maxi, String.valueOf((char) ('a' + i))));
            }
        }

        List<Character> chars = ans.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        chars.sort((a, b) -> last[a - 'a'] - last[b - 'a']);

        return chars.stream().map(String::valueOf).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        Solution7 solution = new Solution7();
        String inputString = "";

        // read only one line from stdin
        inputString = new Scanner(System.in).nextLine();

        // call the solution's function and get the result
        String result = solution.lastNonEmptyString(inputString);

        // output the result to stdout
        System.out.println(result);
    }
}