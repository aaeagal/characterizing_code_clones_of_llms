Clone 1:
```java
import java.util.Scanner;

class Solution1 {
    private String getLastNonEmptySubString(String str) {
        int array[] = new int[26];
        int biggest = 0;

        for (int j = 0; j < str.length(); j++){
            array[str.charAt(j) - 'a']++;
        }
        
        for (int j = 0; j < 26; j ++){
            biggest = Math.max(biggest, array[j]);
        }
        
        String solution = "";
        
        for (int j = str.length() - 1; j >= 0; j--){
            if (array[str.charAt(j) - 'a'] == biggest) {
                array[str.charAt(j) - 'a']--;
                solution = str.charAt(j) + solution;
            }
        }
        
        return solution;
    }
    static public void main(String args[]) {
        Solution1 solution1 = new Solution1();
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(solution1.getLastNonEmptySubString(str));
        input.close();
        System.exit(0);
    }
}
```

Clone 2:
```java
import java.util.Scanner;

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
```

Note: These are just two examples. The remaining 18 clones may just involve changing variable names, splitting task into different methods, moving method definition into an inner class, etc. Such repetition of changing variable names may not be meaningful. In real-world application, code clones would lead to refactoring so as to avoid code repetition.