import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(freq, 0);
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
                ans.append(String.join("", Collections.nCopies(freq[i] - maxi, Character.toString((char) ('a' + i))));
            }
        }

        CustomComparator customComparator = new CustomComparator(last);
        char[] charArray = ans.toString().toCharArray();
        Arrays.sort(charArray, customComparator);

        return String.valueOf(charArray);
    }

    private static class CustomComparator implements Comparator<Character> {
        private int[] last;

        public CustomComparator(int[] last) {
            this.last = last;
        }

        @Override
        public int compare(Character a, Character b) {
            return last[a - 'a'] - last[b - 'a'];
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        String result = solution.lastNonEmptyString(inputString);

        System.out.println(result);
    }
}