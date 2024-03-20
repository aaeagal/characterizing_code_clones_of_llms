import java.util.*;
import java.io.*;
import java.util.stream.*;
class Solution1 {
    public String process(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);
        for(int i=0; i< s.length() ; i++){
            freq[s.charAt(i)-'a']++;
            last[s.charAt(i)-'a']=i;
        }
        int maxi = Arrays.stream(freq).max().getAsInt();
        maxi--;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            if(freq[i]-maxi > 0){
                ans.append(String.valueOf((char)('a' + i)).repeat(Math.max(0, freq[i] - maxi)));
            }
        }
        ans.sort(Comparator.comparingInt(a -> last[a - 'a']));
        return ans.toString();
    }
}

public static void main(String[] args) {
    Solution1 solution = new Solution1();
    Scanner scanner = new Scanner(System.in);

    // read only one line from stdin
    String inputString = scanner.nextLine();

    // call the solution's function and get the result
    String result = solution.process(inputString);

    // output the result to stdout
    System.out.println(result);

}
