import java.util.*;
import java.io.*;
import java.util.stream.*;


class Solution5 {
    public String getLastNonEmptyString(String input) {
        int array[] = new int[26];
        int maxCount = 0;

        // count the frequency of the characters
        for (int i = 0; i < input.length(); i++) {
           array[input.charAt(i) - 'a'] ++;
        }
        
        // find the max frequency count
        for (int i = 0; i < 26; i++) {
            maxCount = Math.max(maxCount, array[i]);
        }

        // generate the answer string 
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            if (array[input.charAt(i) - 'a'] == maxCount) {
                array[input.charAt(i) - 'a'] --;
                output = input.charAt(i) + output;
            }
        }
        
        return output;
    }

    public static void main(String[] args) {
        Solution5 myClass = new Solution5();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(myClass.getLastNonEmptyString(input));
        scanner.close();
        System.exit(0);
    }
}
