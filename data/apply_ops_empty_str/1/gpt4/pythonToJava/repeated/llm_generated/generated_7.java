Below is the Java code which mimics the functionality of the provided Python script. Please note that in Java, exception handling and type declarations have to be done explicitly:

```Java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main Solution = new Main();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(Solution.lastNonEmptyString(s));
        sc.close();
        System.exit(0);
    }

    public String lastNonEmptyString(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        LinkedList<Map.Entry<Character, Integer>> list = new LinkedList<Map.Entry<Character, Integer>>(map.entrySet());
        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        int highest = list.get(0).getValue();
        Map<Character, Integer> d = new HashMap<Character, Integer>();
        String ans = "";

        for (Map.Entry<Character, Integer> me : list) {
            if (me.getValue() == highest) {
                d.put(me.getKey(), me.getValue());
            } else {
                break;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (d.containsKey(s.charAt(i))) {
                if (d.get(s.charAt(i)) == 1) {
                    ans += s.charAt(i);
                }
                d.put(s.charAt(i), d.get(s.charAt(i)) - 1);
            }
        }
        return ans;
    }
}
```