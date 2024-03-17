The below code is the Java version of the Python code you provided:

```java
import java.util.*;

class Solution {
    public String lastNonEmptyString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        ArrayList<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int highest = list.get(0).getValue();
        HashMap<Character, Integer> newMap = new HashMap<>();
        String ans = "";

        for(Map.Entry<Character, Integer> entry: list) {
            if(entry.getValue() == highest) {
                newMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for(char i: s.toCharArray()) {
            if(newMap.containsKey(i)) {
                if(newMap.get(i) == 1) {
                    ans += i;
                }
                newMap.put(i, newMap.get(i) - 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(solution.lastNonEmptyString(s));
        System.exit(0);
    }
}
```
The program reads an input string, counts the frequency of each character, and prints the characters with the highest frequency. It uses a couple of Maps to keep track of character counts and sorting.