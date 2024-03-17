import java.util.Scanner;
class CodeClone {
    public String getLastNonEmptyString(String str) {
        int stringTracker[] = new int[26];
        int largest = 0;

        for (int index = 0; index < str.length(); index++) {
            stringTracker[str.charAt(index) - 'a'] ++;
        }

        for (int index = 0; index < 26; index++) {
            largest = Math.max(largest, stringTracker[index]);
        }


        String result = "";

        for (int index = str.length() - 1; index >= 0; index--) {
            if (stringTracker[str.charAt(index) - 'a'] == largest) {
                stringTracker[str.charAt(index) - 'a'] --;
                result = str.charAt(index) + result;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        CodeClone codeClone = new CodeClone();
        // create scanner object for reading input
        Scanner inputScanner = new Scanner(System.in);
        // read only one line from stdin
        String inputStr = inputScanner.nextLine();
        // call the function and print the result
        System.out.println(codeClone.getLastNonEmptyString(inputStr));
        inputScanner.close();
        // close the program
        System.exit(0);
    }
}