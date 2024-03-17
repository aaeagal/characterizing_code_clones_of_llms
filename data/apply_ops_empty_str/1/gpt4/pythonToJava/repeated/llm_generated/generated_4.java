Below is a Java semantic code clone for the above Python code -

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Solution sol = new Solution();
        System.out.println(sol.lastNonEmptyString(s));
        in.close();
    }
}

class Solution {
    public String lastNonEmptyString(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, (i1, i2) -> i2.getValue().compareTo(i1.getValue()));
        
        int highest = list.get(0).getValue();
        map = new HashMap<>();
        String ans = "";
        
        for(Map.Entry<Character, Integer> entry : list) {
            if(entry.getValue() == highest) {
                map.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }
        
        for(char c : s.toCharArray()) {
            if(map.containsKey(c)) {
                if(map.get(c) == 1) {
                    ans += c;
                }
                map.put(c, map.get(c) - 1);
            }
        }
        
        return ans;
    }
}
'''
This Java code does the same thing as the Python code. It takes a string, counts the frequency of each character, extracts the characters with the highest frequency and constructs a new string with these characters while maintaining the order as in the original string.