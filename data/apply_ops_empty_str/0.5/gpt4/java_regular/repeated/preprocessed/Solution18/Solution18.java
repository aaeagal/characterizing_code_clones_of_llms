import java.util.*;
import java.io.*;
import java.util.stream.*;


class Solution18 {
    public String findLastNonEmptyString(String input) {
        int[] array = new int[26];
        int maximum = 0;
        
        for (int index = 0; index < input.length(); index++) {
            array[input.charAt(index) - 'a']++;
        }
        
        for (int index = 0; index < 26; index++) {
            maximum = Math.max(maximum, array[index]);
        }
        
        String result = "";
        
        for (int index = input.length() - 1; index >= 0; index--) {
            if (array[input.charAt(index) - 'a'] == maximum) {
                array[input.charAt(index) - 'a']--;
                result = input.charAt(index) + result;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution18 example = new Solution18();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(example.findLastNonEmptyString(input));
        scanner.close();
        System.exit(0);
    }
}
