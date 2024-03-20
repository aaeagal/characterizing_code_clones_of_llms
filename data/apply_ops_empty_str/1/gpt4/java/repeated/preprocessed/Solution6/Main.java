import java.util.*;
import java.io.*;
import java.util.stream.*;
class Main {
    public String getLastNonEmptyElement(String input) {
        int frequencyArray[] = new int[26];
        int largest = 0;

        for (int positionCount = 0; positionCount < input.length(); positionCount++) {
            frequencyArray[input.charAt(positionCount) - 'a'] += 1;
        }

        for (int count = 0; count < 26; count++) {
            largest = Math.max(largest, frequencyArray[count]);
        }


        String answer = "";

        for (int count = input.length() - 1; count >= 0; count--) {
            if (frequencyArray[input.charAt(count) - 'a'] == largest) {
                frequencyArray[input.charAt(count) - 'a']--;
                answer = input.charAt(count) + answer;
            }
        }

        return answer;
    }
    public static void main(String[] arguments) {
        Main mainCls = new Main();
        // create a scanner object
        Scanner scannerObj = new Scanner(System.in);
        // read a line from the console
        String userInput = scannerObj.nextLine();
        // print the result of the function call
        System.out.println(mainCls.getLastNonEmptyElement(userInput));
        // close the scanner resource
        scannerObj.close();
        // quit the program
        System.exit(0);
    }
}