import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution2 {
    public String lastNonEmptyString(String s) {

        Map<Character, Integer> counter = new HashMap<>();
        for (char c : s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        
        List<Map.Entry<Character, Integer>> counterList = new ArrayList<>(counter.entrySet());
        counterList.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        int highest = counterList.get(0).getValue();
        Map<Character, Integer> equalsHighest = new HashMap<>();
        String ans = "";
        
        for (Map.Entry<Character, Integer> entry : counterList) {
            if (entry.getValue() == highest) {
                equalsHighest.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }
        
        for (char c : s.toCharArray()) {
            if (equalsHighest.containsKey(c)) {
                if (equalsHighest.get(c) == 1) {
                    ans += c;
                }
                equalsHighest.put(c, equalsHighest.get(c) - 1);
            }
        }
            
        return ans;
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
    }
}
