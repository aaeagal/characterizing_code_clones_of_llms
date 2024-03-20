import java.util.*;
import java.io.*;
import java.util.stream.*;




public class Solution7 {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            last[s.charAt(i) - 'a'] = i;
        }

        int max = Arrays.stream(freq).max().getAsInt() - 1;
        
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] - max > 0) {
                ans.append(String.join("", Collections.nCopies(freq[i] - max, Character.toString((char) ('a' + i)))));
            }
        }

        Character[] ansArray = ans.toString().chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        
        // Sort the ans string using the custom comparator
        Arrays.sort(ansArray, Comparator.comparingInt(a -> last[a - 'a']));

        return Arrays.toString(ansArray).replaceAll("\\[|\\]|,| ", "");
    }

    public static void main(String[] args) {
        Solution7 solution = new Solution7();
        Scanner scanner = new Scanner(System.in);

        // read only one line from stdin
        String inputString = scanner.nextLine();

        // call the solution's function and get the result
        String result = solution.lastNonEmptyString(inputString);

        // output the result to stdout
        System.out.println(result);
    }
}
