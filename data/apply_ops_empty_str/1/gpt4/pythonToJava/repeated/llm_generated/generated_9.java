Below is a Java equivalent code for the provided Python code.

```java
import java.util.*;

public class Solution {

    public String lastNonEmptyString(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        int highest = list.get(0).getValue();
        String ans = "";
        for(Map.Entry<Character, Integer> entry : list){
            if(entry.getValue() == highest){
                if(entry.getValue() == 1)
                    ans += entry.getKey();
                entry.setValue(entry.getValue() - 1);
            } else {
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        Solution sol = new Solution();
        System.out.println(sol.lastNonEmptyString(s));
        sc.close();
    }
}
```

Some important remarks:
- Python's `Counter` and `defaultdict` translate into Java's `HashMap`.
- Java uses `Map.Entry` to work with a map's entries.
- Lambda function that was used in Python for sorting is replaced with `Map.Entry.comparingByValue(Comparator.reverseOrder())` in Java to sort the map in descending order by value.
- In Java, `for` loop can iterate through all entries of a map using `for(Map.Entry<K,V> entry : map.entrySet())`.
- Strings are immutable in Java so when a character is appended to a string, a new string object is created. If there are many such operations, consider using `StringBuilder` instead for performance improvement.
- Java does not have a direct equivalent of Python's `if var in dict`. Instead, you can use `map.containsKey(var)` to achieve the same effect.
- Java doesn't have Python-style list comprehension so you need to use loops instead.