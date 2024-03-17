import java.util.Scanner;
public class TextProcessor {
    public String fetchLastNonEmptyString(String input) {
        int alphabetCount[] = new int[26];
        int highestFrequency = 0;
        
        for (int index = 0; index < input.length(); index++) {
            alphabetCount[input.charAt(index) - 'a'] ++;
        }
        
        for (int index = 0; index < 26; index++) {
            highestFrequency = Math.max(highestFrequency, alphabetCount[index]);
        }
        
        String answer = "";
        
        for (int index = input.length() - 1; index >= 0; index--) {
            if (alphabetCount[input.charAt(index) - 'a'] == highestFrequency) {
                alphabetCount[input.charAt(index) - 'a'] --;
                answer = input.charAt(index) + answer;
            }
        }
        
        return answer;
    }
    public static void main(String[] arguments) {
        TextProcessor textProcessor = new TextProcessor();
        Scanner inputScanner = new Scanner(System.in);
        String lineOfText = inputScanner.nextLine();
        System.out.println(textProcessor.fetchLastNonEmptyString(lineOfText));
        inputScanner.close();
        System.exit(0);
    }
}