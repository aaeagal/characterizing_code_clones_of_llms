import java.util.*;
import java.io.*;
import java.util.stream.*;


class Solution17 {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];

        for(int i=0; i< s.length() ; i++){
            freq[s.charAt(i) - 'a']++;
            last[s.charAt(i) - 'a'] = i;
        }
        int maxi = Arrays.stream(freq).max().getAsInt();
        maxi--;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            if(freq[i] - maxi > 0){
                ans.append(String.valueOf((char)('a' + i)).repeat(freq[i] - maxi));
            }
        }
        Comparator<Character> customComparator = (a, b) -> last[a - 'a'] - last[b - 'a];

        // Sort the ans string using the custom comparator
        ans.chars().sorted().mapToObj(c -> (char) c).sorted(customComparator).forEach(ans::append);
        return ans.toString();
    }

    public static void main(String[] args) {
        Solution17 solution = new Solution17();
        Scanner scanner = new Scanner(System.in);

        // read only one line from stdin
        String inputString = scanner.nextLine();

        // call the solution's function and get the result
        String result = solution.lastNonEmptyString(inputString);

        // output the result to stdout
        System.out.println(result);

        scanner.close();
    }
}