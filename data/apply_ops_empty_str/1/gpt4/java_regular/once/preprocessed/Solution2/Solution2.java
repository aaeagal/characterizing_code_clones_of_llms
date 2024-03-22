import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Solution2 {
    public String latestNonEmptyItem(String phrase) {
        int[] arr = new int[26];
        int upperBoundary = 0;

        for (int i = 0; i < phrase.length(); i++) {
            arr[phrase.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            upperBoundary = Math.max(upperBoundary, arr[i]);
        }

        String answer = "";

        for (int i = phrase.length() - 1; i >= 0; i--) {
            if (arr[phrase.charAt(i) - 'a'] == upperBoundary) {
                arr[phrase.charAt(i) - 'a']--;
                answer = phrase.charAt(i) + answer;
            }
        }

        return answer;
    }

    public static void main(String[] arguments) {
        Solution2 solution2 = new Solution2();
        Scanner scan = new Scanner(System.in);
        String phrase = scan.nextLine();
        System.out.println(solution2.latestNonEmptyItem(phrase));
        scan.close();
        System.exit(0);
    }
}
