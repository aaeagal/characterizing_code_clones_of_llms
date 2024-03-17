import java.util.Scanner;

class Example {
    public String getLastNonEmptyString(String str) {
        int frequency[] = new int[26];
        int highest = 0;

        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            highest = Math.max(highest, frequency[i]);
        }


        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            if (frequency[str.charAt(i) - 'a'] == highest) {
                frequency[str.charAt(i) - 'a']--;
                result = str.charAt(i) + result;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Example exampleObj = new Example();
        // read string from stdin
        Scanner scannerObj = new Scanner(System.in);
        // read only one line from stdin
        String inputStr = scannerObj.nextLine();
        // call the function and print the result
        System.out.println(exampleObj.getLastNonEmptyString(inputStr));
        scannerObj.close();
        // end the program
        System.exit(0);
    }
}