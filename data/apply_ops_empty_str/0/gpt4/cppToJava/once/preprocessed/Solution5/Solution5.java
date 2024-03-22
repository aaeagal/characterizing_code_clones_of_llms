import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Solution5 {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);

        for(int i=0; i< s.length() ; i++){
            freq[s.charAt(i)-'a']++;
            last[s.charAt(i)-'a']=i;
        }
        int maxFreq = Arrays.stream(freq).max().getAsInt();
        maxFreq--;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            if(freq[i]-maxFreq >0){
                char[] chars = new char[freq[i] - maxFreq];
                Arrays.fill(chars, (char)('a' + i));
                ans.append(new String(chars));
            }
        }
        Character[] ansArray = ans.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        Arrays.sort(ansArray, Comparator.comparingInt(a -> last[a - 'a']));
        return Arrays.toString(ansArray).replaceAll(", ", "").replace("[", "").replace("]", "");
    }

    public static void main(String[] args) {
        Solution5 solution = new Solution5();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String result = solution.lastNonEmptyString(inputString);
        System.out.println(result);
    }
}
