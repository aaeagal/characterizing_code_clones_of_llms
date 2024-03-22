import java.util.*;
import java.io.*;
import java.util.stream.*;
class Solution17 {
    public String getLastNonEmptyString(String s) {
        int arr[] = new int[26];
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }

        String ans = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            if (arr[s.charAt(i) - 'a'] == max) {
                arr[s.charAt(i) - 'a']--;
                ans = s.charAt(i) + ans;
            }
        }

        return ans;
    }
    public