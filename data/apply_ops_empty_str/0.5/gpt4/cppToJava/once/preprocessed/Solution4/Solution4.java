import java.util.*;
import java.io.*;
class Solution4 {
    public static String getLastNonEmptyString(String str) {
        int[] frequency = new int[26];
        int[] lastOccurrence = new int[26];
        Arrays.fill(lastOccurrence, -1);
        for(int i=0; i< str.length() ; i++){
            frequency[str.charAt(i)-'a']++;
            lastOccurrence[str.charAt(i)-'a']=i;
        }
        int maxFrequency = Arrays.stream(frequency).max().getAsInt();
        maxFrequency--;
        StringBuilder result = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            if(frequency[i]-maxFrequency >0){
                char[] chars = new char[frequency[i] - maxFrequency];
                Arrays.fill(chars, (char) ('a' + i));
                result.append(new String(chars));
            }
        }
        Character[] arr = new Character[result.length()];
        for(int i = 0; i< result.length(); i++) {
            arr[i] = result.charAt(i);
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> lastOccurrence[a - 'a']));
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





