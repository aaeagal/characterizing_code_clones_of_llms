import java.util.*;
import java.io.*;
import java.util.stream.*;




public class Solution18 {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            last[s.charAt(i) - 'a'] = i;
        }
        int maxi = Arrays.stream(freq).max().getAsInt();
        maxi--;

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] - maxi > 0) {
                char[] chars = new char[freq[i] - maxi];
                Arrays.fill(chars, (char) ('a' + i));
                ans.append(new String(chars));
            }
        }
        
        Character[] ansArray = ans.chars().mapToObj(c -> (char)c).toArray(Character[]::new);

        Arrays.sort(ansArray, Comparator.comparingInt(a -> last[a - 'a']));

        StringBuilder sorted = new StringBuilder(ansArray.length);
        for (Character c : ansArray) {
            sorted.append(c.charValue());
        }
        
        return sorted.toString();
    }

    public static void main(String[] args) {
        Solution18 solution = new Solution18();
        Scanner scanner = new Scanner(System.in);

        // read only one line from stdin
        String inputString = scanner.nextLine();

        // call the solution's function and get the result
        String result = solution.lastNonEmptyString(inputString);

        // output the result to stdout
        System.out.println(result);
    }
}
