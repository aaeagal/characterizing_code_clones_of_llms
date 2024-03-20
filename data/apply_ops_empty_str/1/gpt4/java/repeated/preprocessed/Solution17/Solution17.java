import java.util.*;
import java.io.*;
import java.util.stream.*;


public class ClonedSolution17 {
    public String getFinalNonEmptyString(String inputString) {
        int characterFrequency[] = new int[26];
        int maximumFrequency = 0;

        for (int index = 0; index < inputString.length(); index++) {
            characterFrequency[inputString.charAt(index) - 'a']++;
        }
        
        for (int index = 0; index < 26; index++) {
            maximumFrequency = Math.max(maximumFrequency, characterFrequency[index]);
        }
        
        StringBuilder resultString = new StringBuilder();

        for (int index = inputString.length() - 1; index >= 0; index--) {
            if (characterFrequency[inputString.charAt(index) - 'a'] == maximumFrequency) {
                characterFrequency[inputString.charAt(index) - 'a']--;
                resultString.insert(0, inputString.charAt(index));
            }
        }
        
        return resultString.toString();
    }

    public static void main(String[] commandLineArgs) {
        ClonedSolution17 clonedSol = new ClonedSolution17();
        Scanner inputScanner = new Scanner(System.in);
        String inputString = inputScanner.nextLine();
        System.out.println(clonedSol.getFinalNonEmptyString(inputString));
        inputScanner.close();
        System.exit(0);
    }
}