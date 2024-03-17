Below is the semantic equivalent code of your provided Python code in Java programming language:

```java
import java.util.*;

class Solution {
    public String lastNonEmptyString(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> d_list = new ArrayList<>(map.entrySet());
        d_list.sort((a, b) -> b.getValue() - a.getValue());

        int highest = d_list.get(0).getValue();
        map.clear();

        for (Map.Entry<Character, Integer> entry : d_list) {
            if (entry.getValue().equals(highest)) {
                map.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        StringBuilder ans = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (map.get(c) == 1) {
                    ans.append(c);
                }
                map.put(c, map.get(c) - 1);
            }
        }
        return ans.toString();
    }
        
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        sc.close();
    }
}
```

This Java code performs the exact same functionalities as your Python code. It counts each character's occurrence in the string. Then, it sorts the list of map entries in descending order based on the values (counts). The code then continues to iterate over the sorted list and considers those characters for concatenation whose count is equal to the highest count. If the count reaches to 1, then that character is appended to the answer string. Finally, the count for that character is decremented until it reaches to zero. Then we move on to the next one. The resulting string is returned as answer.