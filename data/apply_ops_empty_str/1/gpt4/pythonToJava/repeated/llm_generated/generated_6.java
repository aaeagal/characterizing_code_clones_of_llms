Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Solution {
    public String lastNonEmptyString(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c: s.toCharArray()){
            hm.put(c, hm.getOrDefault(c,0)+1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(hm.entrySet());
        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        int highest = list.get(0).getValue();
        HashMap<Character, Integer> d = new HashMap<>();
        String ans = "";

        for(Map.Entry<Character, Integer> entry: list){
            if(entry.getValue() == highest){
                d.put(entry.getKey(), entry.getValue());
            }else{
                break;
            }
        }

        for(char i : s.toCharArray()){
            if(d.containsKey(i)){
                if(d.get(i)==1){
                    ans += i;
                }
                d.put(i, d.get(i)-1);
            }
        }

        return ans;
    }

    public static void main(String[] args){
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
```

Java collections framework provides analogs to all of the Pythonic data structures used in the original program. It allows us to sort a `HashMap` by value in descending order, generate counts of unique characters in a string, etc. Please note that string concatenation using `+=` in a loop is not recommended in Java but I've used it here to closely mimic the original Python code. If performance is a concern in this case, consider using a `StringBuilder` object instead.