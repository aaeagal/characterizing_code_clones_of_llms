Below is the java equivalent of the python code you provided. 

```java
import java.util.*;

class Solution{

    public String lastNonEmptyString(String s) {
        HashMap<Character, Integer> d = new HashMap<>();
        
        for (char character: s.toCharArray()) {
            d.put(character, d.getOrDefault(character, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> entries = new ArrayList<>(d.entrySet());
        entries.sort(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()));
        
        int highest = entries.get(0).getValue();
        d = new HashMap<>();
        String ans = "";

        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() == highest) {
                d.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char i : s.toCharArray()) {
            if (d.containsKey(i)) {
                if (d.get(i) == 1) {
                    ans += i;
                }
                d.put(i, d.get(i) - 1);
            }
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        // read only one line
        String s = sc.nextLine().strip();
        System.out.println(sol.lastNonEmptyString(s));
        sc.close();
    }
}
```

In this java clone, the HashMap data structure is used as an analogue of Python's builtin dictionary object. The process of counting, sorting and filtering the characters in the string have also been translated into native Java operations as it can be seen in the code above.