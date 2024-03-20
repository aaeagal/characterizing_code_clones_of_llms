import java.util.*;
import java.io.*;
class Main {
    public String getMaxRepeatingChar(String s) {
        int[] arr = new int[26];
        int max = 0;
        
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i]);
        }
        
        String result = "";
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (arr[s.charAt(i) - 'a'] == max) {
                arr[s.charAt(i) - 'a']--;
                result = s.charAt(i) + result;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        System.out.println(main.getMaxRepeatingChar(input));
        
        scanner.close();
        System.exit(0);
    }
}