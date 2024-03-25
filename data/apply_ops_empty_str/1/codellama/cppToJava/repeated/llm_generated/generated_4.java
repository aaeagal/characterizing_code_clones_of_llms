
```java
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class JavaSolution {

    public static String lastNonEmptyString(String s) {
        HashMap<Character, Integer> characterFrequency = new HashMap<>();
        HashMap<Character, Integer> lastIndexOfCharacters = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            characterFrequency.put(currentChar, characterFrequency.getOrDefault(currentChar, 0) + 1);
            lastIndexOfCharacters.put(currentChar, i);
        }

        LinkedHashMap<Character, Integer> sortedCharacters = new LinkedHashMap<>();
        characterFrequency.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEachOrdered(e -> sortedCharacters.put(e.getKey(), e.getValue()));

        StringBuilder result = new StringBuilder();
        for (int j = 0; j < sortedCharacters.size(); j++) {
            int largestNumber = sortedCharacters.get(sortedCharacters.keySet().toArray()[j]);
            for (int k = 0; k < largestNumber; k++) {
                result.append((sortedCharacters.keySet().toArray()[j]));
            }
        }
        return result.toString();
    }

}
``` 