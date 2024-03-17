import java.util.Scanner;
class Example {
    public String getLastNonEmptyString(String str) {
        int frequency[] = new int[26];
        int maximum = 0;
        
        for (int index = 0; index < str.length(); index++) {
            frequency[str.charAt(index) - 'a'] ++;
        }
        
        for (int index = 0; index < 26; index++) {
            maximum = Math.max(maximum, frequency[index]);
        }
        
        
        String result = "";
        
        for (int index = str.length() - 1; index >= 0; index--) {
            if (frequency[str.charAt(index) - 'a'] == maximum) {
                frequency[str.charAt(index) - 'a'] --;
                result = str.charAt(index) + result;
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
        System.out.println(ex.getLastNonEmptyString(str));
        scan.close();
        // end the program
        System.exit(0);
    }
}