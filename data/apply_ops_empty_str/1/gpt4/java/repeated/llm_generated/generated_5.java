import java.util.Scanner;

class Main {
    public String getLastNonEmptyString(String input) {
        int[] frequencyArray = new int[26];
        int maxFrequency = 0;

        for (int index = 0; index < input.length(); index++) {
            frequencyArray[input.charAt(index) - 'a'] ++;
        }

        for (int index = 0; index < 26; index++) {
            maxFrequency = Math.max(maxFrequency, frequencyArray[index]);
        }

        String result = "";

        for (int index = input.length() - 1; index >= 0; index--) {
            if (frequencyArray[input.charAt(index) - 'a'] == maxFrequency) {
                frequencyArray[input.charAt(index) - 'a'] --;
                result = input.charAt(index) + result;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Main newObject = new Main();

        Scanner scannerInput = new Scanner(System.in);
        String inputString = scannerInput.nextLine();

        System.out.println(newObject.getLastNonEmptyString(inputString));
        scannerInput.close();

        Runtime.getRuntime().exit(0);
    }
}