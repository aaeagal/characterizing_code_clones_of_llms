import java.util.Scanner;

public class Main {
    public String getLastNonEmptyString(String inputStr) {
        int letterCounts[] = new int[26];
        int highestCount = 0;
        
        for (int j = 0; j < inputStr.length(); j++) {
            letterCounts[inputStr.charAt(j) - 'a']++;
        }
        
        for (int j = 0; j < 26; j++) {
            highestCount = Math.max(highestCount, letterCounts[j]);
        }
        
        String finalStr = "";
        
        for (int j = inputStr.length() - 1; j >= 0; j--) {
            if (letterCounts[inputStr.charAt(j) - 'a'] == highestCount) {
                letterCounts[inputStr.charAt(j) - 'a']--;
                finalStr = inputStr.charAt(j) + finalStr;
            }
        }
        
        return finalStr;
    }
    
    public static void main(String[] args) {
        Main mainObj = new Main();
        Scanner inputScanner = new Scanner(System.in);
        String inputStr = inputScanner.nextLine();
        System.out.println(mainObj.getLastNonEmptyString(inputStr));
        inputScanner.close();
        System.exit(0);
    }
}