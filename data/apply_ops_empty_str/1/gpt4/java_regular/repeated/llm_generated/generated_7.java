import java.util.Scanner;
public class Main {
    public String findLastNonEmptyStr(String input) {
        int[] freq = new int[26];
        int greatest = 0;
        
        for (int j = 0; j < input.length(); j++) {
            freq[input.charAt(j) - 'a'] ++;
        }
        
        for (int j = 0; j < 26; j++) {
            greatest = Math.max(greatest, freq[j]);
        }
        
        
        String result = "";
        
        for (int j = input.length() - 1; j >= 0; j--) {
            if (freq[input.charAt(j) - 'a'] == greatest) {
                freq[input.charAt(j) - 'a'] --;
                result = input.charAt(j) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Main mainObj = new Main();
        // read string from stdin
        Scanner scan = new Scanner(System.in);
        // read only one line from stdin
        String input = scan.nextLine();
        // call the function and print the result
        System.out.println(mainObj.findLastNonEmptyStr(input));
        scan.close();
        // end the program
        System.exit(0);
    }
}