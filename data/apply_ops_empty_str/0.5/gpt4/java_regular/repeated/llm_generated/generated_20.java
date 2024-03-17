import java.util.Scanner;

class Main {
    public String findLastNonEmptyString(String str) {
        int freqArr[] = new int[26];
        int maximum = 0;
        
        for (int index = 0; index < str.length(); index++) {
            freqArr[str.charAt(index) - 'a']++;
        }
        
        for (int index = 0; index < 26; index++) {
            maximum = Math.max(maximum, freqArr[index]);
        }
        
        String result = "";
        
        for (int index = str.length() - 1; index >= 0; index--) {
            if (freqArr[str.charAt(index) - 'a'] == maximum) {
                freqArr[str.charAt(index) - 'a']--;
                result = str.charAt(index) + result;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Main mainObj = new Main();
        // read string from stdin
        Scanner inputScanner = new Scanner(System.in);
        // read only one line from stdin
        String inputStr = inputScanner.nextLine();
        // call the function and print the result
        System.out.println(mainObj.findLastNonEmptyString(inputStr));
        inputScanner.close();
        // end the program
        System.exit(0);
    }
}