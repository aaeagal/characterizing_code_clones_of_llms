import java.util.*;
import java.io.*;

class NewSolution9 {
    public String firstNonEmptyString(String s) {
        int arr[] = new int[26];
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            min = Math.min(min, arr[i]);
        }
        
        String ans = "";
        
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == min) {
                arr[s.charAt(i) - 'a'] ++;
                ans = ans + s.charAt(i);
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        NewSolution9 newSol = new NewSolution9();
        
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.nextLine();
        
        System.out.println(newSol.firstNonEmptyString(s));
        
        scanner.close();
        
        System.exit(0);
    }
}