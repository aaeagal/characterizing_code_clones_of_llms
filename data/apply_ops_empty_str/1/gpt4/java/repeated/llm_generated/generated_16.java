Here's the semantically equivalent code clone, in which we've changed the names of variables and class and rearranged some of the code, but kept all of the functionality the same:

```java
import java.util.Scanner;

class Answer {
    public String findLastNonEmptyString(String input) {
        int frequency[] = new int[26];
        int highestFreq = 0;

        for (char c : input.toCharArray()) {
            frequency[c - 'a']++;
        }

        for (int freq : frequency) {
            highestFreq = Math.max(highestFreq, freq);
        }

        StringBuilder result = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            if (frequency[input.charAt(i) - 'a'] == highestFreq) {
                frequency[input.charAt(i) - 'a']--;
                result.insert(0, input.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Answer ans = new Answer();

        Scanner readFromConsole = new Scanner(System.in);
        String inputString = readFromConsole.nextLine();
        
        System.out.println(ans.findLastNonEmptyString(inputString));
        
        readFromConsole.close();
        System.exit(0);
    }
}
```

Changes in the code: 

1. Changed class name to `Answer`
2. Renamed method `lastNonEmptyString` to `findLastNonEmptyString`
3. Renamed parameter variable `s` to `input`
4. Renamed variable `arr` to `frequency`
5. Replaced for loop through `input` string characters with foreach loop
6. Renamed variable `max` to `highestFreq`
7. Changed String `ans` to StringBuilder `result`
8. Renamed `Scanner` object from `scanner` to `readFromConsole`
9. Renamed variable `s` to `inputString` 
10. Changed system exiting command position in the `main` method (though this does not affect the functionality).