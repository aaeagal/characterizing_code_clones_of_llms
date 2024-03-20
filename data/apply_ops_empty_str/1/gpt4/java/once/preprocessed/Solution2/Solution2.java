import java.util.*;
import java.io.*;
import java.util.stream.*;
class Solution2 {
    public String processString(String inputString) {
        int freqArr[] = new int[26];
        int maxCount = 0;

        for (int index = 0; index < inputString.length(); index++){
            freqArr[inputString.charAt(index) - 'a']++;
        }
        
        for (int index = 0; index < 26; index++){
            maxCount = Math.max(maxCount, freqArr[index]);
        }

        String response = "";

        for (int index = inputString.length() - 1; index >= 0; index--){
            if (freqArr[inputString.charAt(index) - 'a'] == maxCount) {
                freqArr[inputString.charAt(index) - 'a']--;
                response = inputString.charAt(index) + response;
            }
        }
        
        return response;
    }
    
    private static void main(String... parameters) {
        Solution2 solution2 = new Solution2();
        Scanner inputScanner = new Scanner(System.in);
        String inputString = inputScanner.nextLine();
        System.out.println(solution2.processString(inputString));
        inputScanner.close();
        System.exit(0);
    }
}
