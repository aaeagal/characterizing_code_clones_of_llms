import java.util.*;
class Solution {
    public int maxPalindromesAfterOperations(String[] words) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int[] freq = new int[26];
        for(String word: words) {
            pq.add(word.length());
            for(char ch: word.toCharArray()) {
                freq[ch - 'a']++;
            }
        }
        
        int cnt = 0;
        while(!pq.isEmpty()) {
            int n = pq.poll();
            
            if(n%2 != 0) {
                for(int i=0; i<26; i++) {
                    if(freq[i]%2 != 0) {
                        n -= 1;
                        freq[i]-=1;
                        if(n == 0) cnt++;
                        break;
                    }
                }
            }
            
            if(n != 0) {
                for(int i=0; i<26; i++) {
                    if(freq[i]>=n) {
                        cnt++;
                        freq[i] -= n;
                        break;
                    } else {
                        int nc = freq[i]/2;
                        n -= 2*nc;
                        freq[i] -= 2*nc;
                    }
                }
            }
        }
        
        return cnt;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // Read the input string
        
        // Trim the input to remove the first and last brackets
        input = input.substring(1, input.length() - 1);
        
        // Split the input into an array of strings
        String[] wordsArray = input.split(",");
        
        for (int i = 0; i < wordsArray.length; i++) {
            // Trim spaces and remove quotes
            wordsArray[i] = wordsArray[i].trim().replace("\"", "");
        }
        
        Solution solution = new Solution();
        int result = solution.maxPalindromesAfterOperations(wordsArray);
        
        System.out.println(result);
    }
}