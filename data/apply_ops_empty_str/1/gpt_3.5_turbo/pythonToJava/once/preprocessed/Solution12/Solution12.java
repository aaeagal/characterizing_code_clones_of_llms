import java.util.*;
import java.io.*;
import java.util.stream.*;
class Solution12 {
    public String lastNonEmptyString(String s) {
        
        Map<Character, Integer> d = new TreeMap<>();
        List<Map.Entry<Character, Integer>> d_list = new ArrayList<>(new TreeMap<>(d).entrySet());
        
        int highest = d_list.get(0).getValue();
        Map<Character, Integer> d = new TreeMap<>();
        String ans = "";
        
        for (Map.Entry<Character, Integer> entry : d_list) {
            char key = entry.getKey();
            int val = entry.getValue();
            if (val == highest) {
                d.put(key, val);
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
        Solution12 sol = new Solution12();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
