import java.util.*;
import java.io.*;

class AlternativeSolution16 {
    public String getLastNonEmptyString(String inputString) {
        int frequencyArray[] = new int[26];
        int maximumFrequency = 0;
        
        for (int index = 0; index < inputString.length(); index++) {
            frequencyArray[inputString.charAt(index) - 'a']++;
        }
        
        for (int index = 0; index < 26; index++) {
            maximumFrequency = Math.max(maximumFrequency, frequencyArray[index]);
        }
        
        
        String resultString = "";
        
        for (int index = inputString.length() - 1; index >= 0; index--) {
            if (frequencyArray[inputString.charAt(index) - 'a'] == maximumFrequency) {
                frequencyArray[inputString.charAt(index) - 'a']--;
                resultString = inputString.charAt(index) + resultString;
            }
        }
        
        return resultString;
    }
    public static void main(String[] args) {
        AlternativeSolution16 alternativeSolution16 = new AlternativeSolution16();
        // create scanner object to read input
        Scanner inputScanner = new Scanner(System.in);
        // read a line from user input
        String input = inputScanner.nextLine();
        // print the result of the function
        System.out.println(alternativeSolution16.getLastNonEmptyString(input));
        // close the scanner
        inputScanner.close();
        // terminate the program
        System.exit(0);
    }
}