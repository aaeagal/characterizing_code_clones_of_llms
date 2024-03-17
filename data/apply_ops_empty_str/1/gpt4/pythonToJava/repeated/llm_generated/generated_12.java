Below is the semantic equivalent of your provided Python code in Java. I used HashMaps in Java in correspondance with Python's defaultdict and Counter, and I used the Collections method to sort the map according to values.

```java
import java.util.*;

public class Solution {

    public String lastNonEmptyString(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        int highest = list.get(0).getValue();

        map = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        int i = 0;
  
        for (Map.Entry<Character, Integer> entry : list) {
            if (entry.getValue() == highest) {
                map.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
            i++;
        }

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (map.get(c)==1){
                    ans.append(c);
                }
                map.put(c,map.get(c)-1);
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
``` 

For this Java code to perform the exact same functionality as Python code, you may want to handle edge cases like an empty string or a null string. The above Java code works for non-null, non-empty strings.