import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution10 {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);
        
        for(int i=0; i< s.length() ; i++){
            freq[s.charAt(i) - 'a']++;
            last[s.charAt(i) - 'a']=i;
        }

        int maxi = Arrays.stream(freq).max().getAsInt();
        maxi--;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            if(freq[i] - maxi > 0){
                ans.append(String.valueOf((char) ('a' + i)).repeat(Math.max(0, freq[i] - maxi)));
            }
        }

        Character[] ansArray = ans.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        Arrays.sort(ansArray, Comparator.comparingInt((Character c) -> last[c - 'a']));
        StringBuilder sortedString = new StringBuilder(ans.length());
        for (Character c : ansArray) {
            sortedString.append(c.charValue());
        }

        return sortedString.toString();
    }

    public static void main(String[] args) {
        Solution10 solution = new Solution10();
        Scanner sc = new Scanner(System.in);

        // read only one line from stdin
        String inputString = sc.nextLine();

        // call the solution's function and get the result
        String result = solution.lastNonEmptyString(inputString);
       
        // output the result to stdout
        System.out.println(result); 

        sc.close();
    }
}
