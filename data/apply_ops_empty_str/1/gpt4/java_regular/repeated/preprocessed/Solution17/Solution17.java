import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution17 {
   public String lastRepeatedChar(String str) {
        int[] char_counters = new int[26];
        int highest_count = 0;

        for (char c : str.toCharArray()) {
            char_counters[c - 'a']++;
        }

        for (int counter : char_counters) {
            highest_count = Math.max(highest_count, counter);
        }

        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            char current_char = str.charAt(i);
            if (char_counters[current_char - 'a'] == highest_count) {
                char_counters[current_char - 'a']--;
                result.insert(0, current_char);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution17 anycls=new Solution17();
        
        Scanner myScanner = new Scanner(System.in);
       
        String str = myScanner.nextLine();
      
        System.out.println(anycls.lastRepeatedChar(str));
        myScanner.close();
        
        System.exit(0);
    }
}
