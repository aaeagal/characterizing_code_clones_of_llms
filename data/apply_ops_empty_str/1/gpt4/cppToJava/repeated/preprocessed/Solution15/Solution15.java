import java.util.*;
import java.io.*;
import java.util.stream.*;



public class Solution15 {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26]; 
        Arrays.fill(last, -1);
        
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
            last[s.charAt(i)-'a']=i;
        }
        
        int maxFreq = Arrays.stream(freq).max().getAsInt();
        maxFreq--;

        StringBuilder ans = new StringBuilder();
        for(int i=0; i<26; i++){
            if(freq[i]-maxFreq > 0){
                for (int j = 0; j < freq[i] - maxFreq; ++j) {
                    ans.append((char)('a' + i));
                }
            }
        }

        Comparator<Character> customComparator = (a, b) -> last[a - 'a'] < last[b - 'a'] ? -1 : 1;
        Character[] ansArray = ans.chars().mapToObj(e->(char)e).toArray(Character[]::new);
        
        // Sort the ans string using the custom comparator
        Arrays.sort(ansArray, customComparator);
        StringBuilder sortedAns = new StringBuilder(ansArray.length);
        for (Character c : ansArray) {
            sortedAns.append(c.charValue());
        }
        
        return sortedAns.toString();
    }

    public static void main(String[] args) {
        Solution15 solution = new Solution15();
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