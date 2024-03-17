import java.util.Scanner;

class Main {
    public String getLastNonEmptyString(String str) {
        int frequency[] = new int[26];
        int maximum = 0;
        
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < 26; i++) {
            maximum = Math.max(maximum, frequency[i]);
        }
        
        
        String result = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (frequency[str.charAt(i) - 'a'] == maximum) {
                frequency[str.charAt(i) - 'a'] --;
                result = str.charAt(i) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Main main = new Main();
        // read string from stdin
        Scanner scanner = new Scanner(System.in);
        // read only one line from stdin
        String str = scanner.nextLine();
        // call the function and print the result
        System.out.println(main.getLastNonEmptyString(str));
        scanner.close();
        // end the program
        System.exit(0);
    }
}