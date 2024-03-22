import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Solution2 {
    public static String getLastNonEmptyString(String str) {
        int[] frequencyCount = new int[26];
        int[] lastIndex = new int[26];
        Arrays.fill(lastIndex, -1);
        for(int i=0; i< str.length() ; i++){
            frequencyCount[str.charAt(i)-'a']++;
            lastIndex[str.charAt(i)-'a']=i;
        }
        int maximum = Arrays.stream(frequencyCount).max().getAsInt();
        maximum--;
        StringBuilder result = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            if(frequencyCount[i]-maximum >0){
                char[] chars = new char[frequencyCount[i] - maximum];
                Arrays.fill(chars, (char) ('a' + i));
                result.append(new String(chars));
            }
        }
        Character[] arr = new Character[result.length()];
        for(int i = 0; i< result.length(); i++) {
            arr[i] = result.charAt(i);
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> lastIndex[a - 'a']));
        StringBuilder sortedResult = new StringBuilder(arr.length);
        for (Character c : arr) {
            sortedResult.append(c.charValue());
        }
        return sortedResult.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = getLastNonEmptyString(input);
        System.out.println(output);
    }
}
