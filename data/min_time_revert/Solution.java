import java.util.*;
class Solution {
    public int minimumTimeToInitialState(String word, int k) {
        int result = 1;
        for (int i = k; i < word.length(); i = i + k) {
            if (word.startsWith(word.substring(i))) {
                break;
            }
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        // read input
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int k = scanner.nextInt();

        // call function and print result
        System.out.println(new Solution().minimumTimeToInitialState(word, k));

    }
}