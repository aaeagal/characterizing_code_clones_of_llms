import java.util.*;
import java.io.*;





public class Solution15 {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        
        for(int i=0; i< s.length() ; i++){
            freq[s.charAt(i)-'a']++;
            last[s.charAt(i)-'a']=i;
        }
        
        int maxi = 0;
        for(int i=0; i< 26 ; i++){
            maxi = Math.max(maxi, freq[i]);
        }
        maxi--;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            if(freq[i]-maxi > 0){
                ans.append(String.join("", Collections.nCopies(freq[i] - maxi, String.valueOf((char)('a' + i))));
            }
        }
        
        java.util.Comparator<Character> customComparator = (a, b) -> last[a - 'a'] - last[b - 'a']; 

        // Sort the ans string using the custom comparator
        List<Character> ansList = new ArrayList<>();
        for(char c : ans.toString().toCharArray()) {
            ansList.add(c);
        }
        ansList.sort(customComparator);
        
        StringBuilder sortedAns = new StringBuilder();
        for(char c : ansList) {
            sortedAns.append(c);
        }
        
        return sortedAns.toString();
    }

    public static void main(String[] args) {
        Solution15 solution = new Solution15();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        // call the solution's function and get the result
        String result = solution.lastNonEmptyString(inputString);

        // output the result to stdout
        System.out.println(result);

        scanner.close();
    }
}