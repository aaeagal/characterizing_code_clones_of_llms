import java.util.*;
import java.io.*;
class Solution5{
    public String getLastNonEmptyString(String input){
        int letterArray[] = new int[26];
        int max = 0;
       
        for (int i = 0; i < input.length(); i++){
            letterArray[input.charAt(i) - 'a']++;
        }
       
        for (int i = 0; i < 26; i++){
            max = Math.max(max, letterArray[i]);
        }
       
        String result = "";
       
        for (int i = input.length() - 1; i >= 0; i--){
            if (letterArray[input.charAt(i) - 'a'] == max){
                letterArray[input.charAt(i) - 'a']--;
                result = input.charAt(i) + result;
            }
        }
       
        return result;
    }
    public static void main(String[] args){
        Solution5 sol = new Solution5();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(sol.getLastNonEmptyString(input));
        scanner.close();
        System.exit(0);
    }
}


