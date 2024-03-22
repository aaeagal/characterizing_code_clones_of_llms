import java.util.*;
import java.io.*;
import java.util.stream.*;




public class Solution13 {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        Arrays.fill(freq, 0);
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
                ans.append(String.valueOf((char) (i + 'a')).repeat(Math.max(0, freq[i] - maxi)));
            }
        }

        Comparator<Character> customComparator = (a, b) -> {
            return last[a - 'a'] - last[b - 'a];
        };

        // Sort the ans string using the custom comparator
        char[] ansArray = ans.toString().toCharArray();
        Arrays.sort(ansArray, 0, ans.length(), customComparator);
        return new String(ansArray);
    }

    public static void main(String[] args) {
        Solution13 solution = new Solution13();
        Scanner scanner = new Scanner(System.in);

        // read only one line from stdin
        String inputString = scanner.nextLine();

        // call the solution's function and get the result
        String result = solution.lastNonEmptyString(inputString);

        // output the result to stdout
        System.out.println(result);

        scanner.close();
    }
}
