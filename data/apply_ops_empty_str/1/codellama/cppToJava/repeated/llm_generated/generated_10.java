

Here's a Java version of your code:

```java
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/*
  Create a Solution class that has a method lastNonEmptyString()
  which takes the input string as an argument and returns the 
  anagram of the first non-maly represented character ordered alphabetically
*/

class Solution {
    public String lastNonEmptyString(String s) {
        // HashMap to store the occurrences of each character
        HashMap<Character, Integer> freq = new HashMap<>();
        // HashMap to store the last occurrence of each character
        HashMap<Character, Integer> last = new HashMap<>();
        
        // Iterate over the input string and populate the HashMaps
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            last.put(ch, i);
        }
        
        // Find the character with the maximum occurrences
        int maxOccurrence = 0;
        for(Map.Entry<Character, Integer> entry : freq.entrySet()) {
            char ch = entry.getKey();
            int occurence = entry.getValue();
            maxOccurrence = Math.max(maxOccurrence, occurence);
        }
        
        // Remove the character(s) with the maximum occurrences from the input string
        StringBuilder solutionBuilder = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(freq.get(ch) < maxOccurrence) {
                solutionBuilder.append(ch);
            }
        }
        String solution = solutionBuilder.toString();
        
        // Sort the remaining characters according to their last occurence in the input string
        TreeSet<Character> sortedRemainingChars = new TreeSet<>(
            (c1, c2) -> (last.get(c2) - last.get(c1))    // Reverse order
        );
        for(char ch : solution.toCharArray()) {
            sortedRemainingChars.add(ch);
        }
        
        // Build the final solution by adding the characters of the sorted set
        solutionBuilder = new StringBuilder();
        for(char ch : sortedRemainingChars) {
            solutionBuilder.append(ch);
        }
        solution = solutionBuilder.toString();

        return solution;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    // Create a scanner to read input from stdin
        Solution solution = new Solution();    // Create an instance of the solution class
    
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();      // Read input string

        String result = solution.lastNonEmptyString(inputString);    // Call the solution method and get the result
        System.out.println("First non-empty string: " + result);    // Output the result
    }
}
```

This should be a `Java` code that adequately reflects the same logic as the `C++` code you provided. 