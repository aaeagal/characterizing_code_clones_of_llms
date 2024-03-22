

Here is a syntactically different semantic Java code clone of the code:

import java.util.Scanner;

class Solution {
    public String lastNonEmptyString(String s) {
        int[] count = new int[26];
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        for (int