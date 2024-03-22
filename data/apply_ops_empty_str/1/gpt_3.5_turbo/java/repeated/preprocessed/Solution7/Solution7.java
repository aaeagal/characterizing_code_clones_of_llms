import java.util.*;
import java.io.*;
import java.util.stream.*;


class Solution7 {
    public String reverseLastMaxFrequency(String str) {
        int frequency[] = new int[26];
        int maximum = 0;
        
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            maximum = Math.max(maximum, frequency[i]);
        }
        
        String result = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (frequency[str.charAt(i) - 'a'] == maximum) {
                frequency[str.charAt(i) - 'a']--;
                result = str.charAt(i) + result;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution7 solution = new Solution7();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(solution.reverseLastMaxFrequency(input));
        scanner.close();
        System.exit(0);
    }
}