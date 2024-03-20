import java.util.*;
import java.io.*;
import java.util.stream.*;
class Solution1 {
    private String getLastNonEmptySubString(String str) {
        int array[] = new int[26];
        int biggest = 0;

        for (int j = 0; j < str.length(); j++){
            array[str.charAt(j) - 'a']++;
        }
        
        for (int j = 0; j < 26; j ++){
            biggest = Math.max(biggest, array[j]);
        }
        
        String solution = "";
        
        for (int j = str.length() - 1; j >= 0; j--){
            if (array[str.charAt(j) - 'a'] == biggest) {
                array[str.charAt(j) - 'a']--;
                solution = str.charAt(j) + solution;
            }
        }
        
        return solution;
    }
    static public void main(String args[]) {
        Solution1 solution1 = new Solution1();
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(solution1.getLastNonEmptySubString(str));
        input.close();
        System.exit(0);
    }
}
