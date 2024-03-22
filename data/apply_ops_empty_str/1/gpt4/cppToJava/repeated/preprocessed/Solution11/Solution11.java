import java.util.*;
import java.io.*;
import java.util.stream.*;



public class Solution11 {
   
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(freq, 0);
        Arrays.fill(last, -1);

        for(int i = 0; i < s.length() ; i++) {
            freq[s.charAt(i) - 'a']++;
            last[s.charAt(i) - 'a'] = i;
        }
        int maxi = Arrays.stream(freq).max().getAsInt();
        maxi--;
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < 26 ; i++){
            if(freq[i] - maxi >0){
                char[] arr = new char[freq[i] - maxi];
                Arrays.fill(arr, (char)('a' + i));
                ans.append(arr);
            }
        }
        Character[] chars = ans.toString().chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        Arrays.sort(chars, (a, b) -> last[a - 'a'] - last[b - 'a']);
        StringBuilder sortedAns = new StringBuilder();
        for (char c : chars) {
            sortedAns.append(c);
        }
        return sortedAns.toString();
    }

    public static void main(String[] args) {
        Solution11 solution = new Solution11();
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        String result = solution.lastNonEmptyString(inputString);

        System.out.println(result);

        scanner.close();
    }
}
