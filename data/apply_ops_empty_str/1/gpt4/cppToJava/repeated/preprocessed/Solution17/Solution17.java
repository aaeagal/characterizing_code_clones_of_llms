import java.util.*;
import java.io.*;
import java.util.stream.*;


class Solution17 {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);
        
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            last[s.charAt(i) - 'a'] = i;
        }
        
        int maxi = Arrays.stream(freq).max().getAsInt();
        maxi--;
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < 26 ; i++){
            if(freq[i] - maxi >0){
                char[] chars = new char[freq[i] - maxi];
                Arrays.fill(chars, (char)('a' + i));
                ans.append(new String(chars));
            }
        }
        Character[] result = ans.toString().chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        
        Comparator<Character> customComparator = (Character a, Character b) -> Integer.compare(last[a - 'a'], last[b - 'a']);
        Arrays.sort(result, customComparator);

        StringBuilder sortedString = new StringBuilder(result.length);
        for (Character c : result) {
            sortedString.append(c.charValue());
        }
        return sortedString.toString();
    }

    public static void main(String[] args) {
        Solution17 solution = new Solution17();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        String result = solution.lastNonEmptyString(inputString);

        System.out.println(result);
        scanner.close();
    }
}
