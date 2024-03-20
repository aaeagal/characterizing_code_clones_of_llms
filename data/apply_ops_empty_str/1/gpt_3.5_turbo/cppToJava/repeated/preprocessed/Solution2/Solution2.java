import java.util.*;
import java.io.*;




class Solution2 {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];

        Arrays.fill(freq, 0);
        Arrays.fill(last, -1);

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            last[s.charAt(i) - 'a'] = i;
        }
        int max = Arrays.stream(freq).max().getAsInt() - 1;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] - max > 0) {
                ans.append(String.valueOf((char) ('a' + i)).repeat(Math.max(0, freq[i] - max)));
            }
        }

        Comparator<Character> customComparator = (a, b) -> last[a - 'a'] - last[b - 'a];

        char[] ansCharArray = ans.toString().toCharArray();
        Arrays.sort(ansCharArray, customComparator);

        return new String(ansCharArray);
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        String result = solution.lastNonEmptyString(inputString);

        System.out.println(result);
    }
}