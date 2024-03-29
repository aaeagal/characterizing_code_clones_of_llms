import java.util.Scanner;

class WordArray {
    public String lastNonEmpty(String myString) {
        int characterCount[] = new int[26];
        int maximum = 0;
        
        for (int index = 0; index < myString.length(); index++) {
            characterCount[myString.charAt(index) - 'a'] ++;
        }
        
        for (int index = 0; index < characterCount.length; index++) {
            maximum = Math.max(maximum, characterCount[index]);
        }
        
        StringBuilder result = new StringBuilder();
        
        for (int index = myString.length() - 1; index >= 0; index--) {
            if (characterCount[myString.charAt(index) - 'a'] == maximum) {
                characterCount[myString.charAt(index) - 'a']--;
                result.insert(0, myString.charAt(index));
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        WordArray wordArray = new WordArray();
        Scanner inputReader = new Scanner(System.in);
        String inputString = inputReader.nextLine();
        System.out.println(wordArray.lastNonEmpty(inputString));
        inputReader.close();
        System.exit(0);
    }
}