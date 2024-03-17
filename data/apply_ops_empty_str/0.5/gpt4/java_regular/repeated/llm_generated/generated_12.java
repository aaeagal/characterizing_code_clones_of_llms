import java.util.Scanner;

class CodeClone {
    public String finalNonEmptyStr(String str) {
        int frequencyArray[] = new int[26];
        int maximum = 0;

        for (int i = 0; i < str.length(); i++) {
            frequencyArray[str.charAt(i) - 'a'] ++;
        }

        for (int i = 0; i < 26; i++) {
            maximum = Math.max(maximum, frequencyArray[i]);
        }

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            if (frequencyArray[str.charAt(i) - 'a'] == maximum) {
                frequencyArray[str.charAt(i) - 'a'] --;
                result = str.charAt(i) + result;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        CodeClone cc = new CodeClone();
        // read string from stdin
        Scanner scan = new Scanner(System.in);
        // read only one line from stdin
        String str = scan.nextLine();
        // call the function and print the result
        System.out.println(cc.finalNonEmptyStr(str));
        scan.close();
        // end the program
        System.exit(0);
    }
}