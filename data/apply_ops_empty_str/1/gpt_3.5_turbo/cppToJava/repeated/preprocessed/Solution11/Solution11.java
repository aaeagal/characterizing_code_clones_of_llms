import java.util.*;
import java.io.*;



class Solution11 {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
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
                ans.append(String.valueOf((char)('a' + i)).repeat(Math.max(0, freq[i] - maxi)));
            }
        }

        CustomComparator customComparator = new CustomComparator(last);
        char[] ansArray = ans.toString().toCharArray();
        Arrays.sort(ansArray, customComparator);
        return new String(ansArray);
    }

    static class CustomComparator implements java.util.Comparator<Character> {
        private final int[] last;

        CustomComparator(int[] last) {
            this.last = last;
}

        @Override
        public int compare(Character a, Character b) {
            return Integer.compare(last[a - 'a'], last[b - 'a']);
        }
    }
}

