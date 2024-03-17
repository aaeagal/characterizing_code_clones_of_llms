import java.util.Scanner;
public class Program {
    public String getLastNonEmptyString(String input) {
        int frequencyArray[] = new int[26];
        int highFrequency = 0;

        for (int index = 0; index < input.length(); index++) {
            frequencyArray[input.charAt(index) - 'a'] ++;
        }

        for (int index = 0; index < 26; index++) {
            highFrequency = Math.max(highFrequency, frequencyArray[index]);
        }

        String result = "";

        for (int index = input.length() - 1; index >= 0; index--) {
            if (frequencyArray[input.charAt(index) - 'a'] == highFrequency) {
                frequencyArray[input.charAt(index) - 'a'] --;
                result = input.charAt(index) + result;
            }
        }

        return result;
    }
    public static void main(String[] parameters) {
        Program programInstance = new Program();
        // read string from stdin
        Scanner scannerInstance = new Scanner(System.in);
        // read only one line from stdin
        String inputString = scannerInstance.nextLine();
        // call the function and print the result
        System.out.println(programInstance.getLastNonEmptyString(inputString));
        scannerInstance.close();
        // end the program
        System.exit(0);
    }
}