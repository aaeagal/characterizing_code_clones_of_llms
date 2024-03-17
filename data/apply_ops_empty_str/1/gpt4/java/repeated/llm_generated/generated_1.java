import java.util.Scanner;
class Main {

    public String getFinalNonEmptyString(String inputStr) {
        int alphabetCount[] = new int[26];
        int highestCount = 0;
        
        for (int i = 0; i < inputStr.length(); i++) {
            alphabetCount[inputStr.charAt(i) - 'a'] ++;
        }

        for (int i = 0; i < 26; i++) {
            highestCount = Math.max(highestCount, alphabetCount[i]);
        }
        
        String finalStr = "";

        for (int i = inputStr.length() - 1; i >= 0; i--) {
            if (alphabetCount[inputStr.charAt(i) - 'a'] == highestCount) {
                alphabetCount[inputStr.charAt(i) - 'a'] --;
                finalStr = inputStr.charAt(i) + finalStr;
            }
        }
        
        return finalStr;
    }

    public static void main(String[] args) {
        Main mainObject = new Main();
        Scanner scanObj = new Scanner(System.in);
        String inputStr = scanObj.nextLine();
        System.out.println(mainObject.getFinalNonEmptyString(inputStr));
        scanObj.close();
        System.exit(0);
    }
}