```java
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Solution {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        Arrays.fill(freq, 0);
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
                for (int j = 0; j < freq[i] - maxi; j++) {
                    ans.append((char) ('a' + i));
                }
            }
        }

        Comparator<Character> customComparator = (a, b) -> last[a - 'a'] - last[b - 'a];

        // Sort the ans string using the custom comparator
        ans.chars().mapToObj(c -> (char) c).sorted(customComparator).forEach(ans::append);
        return ans.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String result = solution.lastNonEmptyString(inputString);
        System.out.println(result);
        scanner.close();
    }
}
```