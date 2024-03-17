Here is the semantically equivalent code in Java:

```java
import java.util.*;

public class Solution {

    public static String lastNonEmptyString(String s) {

        Map<Character, Integer> m = new HashMap<>();  

        for (Character c: s.toCharArray()) { 
            m.put(c, m.getOrDefault(c, 0) + 1);
        }
        
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(m.entrySet());
        list.sort(Map.Entry.comparingByValue(Collections.reverseOrder()));        
        int highest = list.get(0).getValue();
        
        m = new HashMap<>();

        String ans = "";

        for (Map.Entry<Character, Integer> entry : list) {
            if (entry.getValue() == highest) {
                m.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }


        for (char c : s.toCharArray()) {
            if (m.containsKey(c)) {
                if (m.get(c) == 1)
                    ans += c;
                m.put(c, m.get(c) - 1);
            }
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(lastNonEmptyString(s));
    }
}
```

This Java version code does the following, similarly to the original:
- It counts character occurrences in the string `s` and put it in a map.
- Then, it sorts the map by values in decreasing order and retrieve the highest value.
- The map is cleared and it stores the key-value pairs where the value equals the highest value.
- For every character in the string `s`, if it exists in the map it appends to `ans` and decrease its count in the map.
- Finally it returns the filtered string.