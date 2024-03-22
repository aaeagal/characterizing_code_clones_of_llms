import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Solution1 {
    public static String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);
        for(int i=0; i< s.length() ; i++){
            freq[s.charAt(i)-'a']++;
            last[s.charAt(i)-'a']=i;
        }
        int max = Arrays.stream(freq).max().getAsInt();
        max--;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            if(freq[i]-max >0){
                char[] chars = new char[freq[i] - max];
                Arrays.fill(chars, (char) ('a' + i));
                ans.append(new String(chars));
            }
        }
        Character[] arr = new Character[ans.length()];
        for(int i = 0; i< ans.length(); i++) {
            arr[i] = ans.charAt(i);
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> last[a - 'a']));
        StringBuilder sortedAns = new StringBuilder(arr.length);
        for (Character c : arr) {
            sortedAns.append(c.charValue());
        }
        return sortedAns.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String result = lastNonEmptyString(inputString);
        System.out.println(result);
    }
}
