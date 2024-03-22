import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution1 {
    String lastNonEmptyString(String s){
        int n = s.length();
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);
        
        for(int i=0; i<n ; i++){
            freq[s.charAt(i) - 'a']++;
            last[s.charAt(i) - 'a']=i;
        }
        
        int maxi = Arrays.stream(freq).max().getAsInt();
        maxi--;
        
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<26; i++){
            if(freq[i] - maxi > 0){
                char[] arr = new char[freq[i] - maxi];
                Arrays.fill(arr, (char)('a' + i));
                ans.append(new String(arr));
            }
        }
        
        Character[] ansArr = new Character[ans.length()];
        for (int i = 0; i < ans.length(); i++) {
            ansArr[i] = ans.charAt(i);
        }
        
        Arrays.sort(ansArr, Comparator.comparingInt(a -> last[a - 'a']));
        StringBuilder sortedAns = new StringBuilder(ans.length());
        for (Character c : ansArr) {
            sortedAns.append(c.charValue());
        }

        return sortedAns.toString();
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        Scanner scanner = new Scanner(System.in);
        
        // read only one line from stdin
        String inputString = scanner.nextLine();
        
        // call the solution's function and get the result
        String result = solution.lastNonEmptyString(inputString);

        // output the result to stdout
        System.out.println(result);
    }
}
