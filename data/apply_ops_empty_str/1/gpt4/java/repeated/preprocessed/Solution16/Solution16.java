import java.util.*;
import java.io.*;
import java.util.stream.*;


class Solution16 {
    public String findLastNonEmptyString(String input) {
        int frequency[] = new int[26];
        int highestFreq = 0;

        for (char c : input.toCharArray()) {
            frequency[c - 'a']++;
        }

        for (int freq : frequency) {
            highestFreq = Math.max(highestFreq, freq);
        }

        StringBuilder result = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            if (frequency[input.charAt(i) - 'a'] == highestFreq) {
                frequency[input.charAt(i) - 'a']--;
                result.insert(0, input.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution16 ans = new Solution16();

        Scanner readFromConsole = new Scanner(System.in);
        String inputString = readFromConsole.nextLine();
        
        System.out.println(ans.findLastNonEmptyString(inputString));
        
        readFromConsole.close();
        System.exit(0);
    }
}
