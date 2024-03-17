import java.util.Scanner;
class Example {
    public String lastNonEmptyStr(String str) {
        int alpha[] = new int[26];
        int maximum = 0;
        
        for (int i = 0; i < str.length(); i++) {
            alpha[str.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            maximum = Math.max(maximum, alpha[i]);
        }
        
        
        String result = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (alpha[str.charAt(i) - 'a'] == maximum) {
                alpha[str.charAt(i) - 'a'] --;
                result = str.charAt(i) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Example ex = new Example();
        // read string from stdin
        Scanner scan = new Scanner(System.in);
        // read only one line from stdin
        String str = scan.nextLine();
        // call the function and print the result
        System.out.println(ex.lastNonEmptyStr(str));
        scan.close();
        // end the program
        System.exit(0);
    }
}