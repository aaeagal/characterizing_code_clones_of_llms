import java.util.Scanner;

public class SolutionClone {
    public String getLastNonEmptyString(String inputString) {
        int[] frequencyArray = new int[26];
        int maximum = 0;
        
        for (int index = 0; index < inputString.length(); index++) {
            frequencyArray[inputString.charAt(index) - 'a']++;
        }
        
        for (int index = 0; index < 26; index++) {
            maximum = Math.max(maximum, frequencyArray[index]);
        }
        
        String result = "";
        
        for (int index = inputString.length() - 1; index >= 0; index--) {
            if (frequencyArray[inputString.charAt(index) - 'a'] == maximum) {
                frequencyArray[inputString.charAt(index) - 'a']--;
                result = inputString.charAt(index) + result;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        SolutionClone solutionClone = new SolutionClone();
        Scanner inputScanner = new Scanner(System.in);
        String inputString = inputScanner.nextLine();
        System.out.println(solutionClone.getLastNonEmptyString(inputString));
        inputScanner.close();
        System.exit(0);
    }
}