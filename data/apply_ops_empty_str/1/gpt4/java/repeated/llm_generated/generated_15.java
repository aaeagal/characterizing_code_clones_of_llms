import java.util.Scanner;
class Example {
    public String findLastNonEmptyString(String word) {
        int freqArr[] = new int[26];
        int maxFreq = 0;
        
        for (int index = 0; index < word.length(); index++) {
            freqArr[word.charAt(index) - 'a'] ++;
        }
        
        for (int index = 0; index < 26; index++) {
            maxFreq = Math.max(maxFreq, freqArr[index]);
        }
        
        
        String result = "";
        
        for (int index = word.length() - 1; index >= 0; index--) {
            if (freqArr[word.charAt(index) - 'a'] == maxFreq) {
                freqArr[word.charAt(index) - 'a'] --;
                result = word.charAt(index) + result;
            }
        }
        
        return result;
    }
    public static void main(String[] cmdArgs) {
        Example egInstance = new Example();
        Scanner inputScanner = new Scanner(System.in);
        String inputWord = inputScanner.nextLine();
        System.out.println(egInstance.findLastNonEmptyString(inputWord));
        inputScanner.close();
        System.exit(0);
    }
}