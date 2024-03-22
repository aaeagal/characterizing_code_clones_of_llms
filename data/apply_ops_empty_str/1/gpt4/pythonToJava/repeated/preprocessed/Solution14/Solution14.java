import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution14 {
    public String lastNonEmptyString(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(map.entrySet());

        Map.Entry<Character, Integer> entry = pq.peek();
        int highest = entry.getValue();
        map = new HashMap<>();
        String ans = "";
        for (Map.Entry<Character, Integer> e : pq) {
            if (e.getValue() == highest) {
                map.put(e.getKey(), e.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (map.get(c) == 1) {
                    ans += c;
                }
                map.put(c, map.get(c) - 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution14 sol = new Solution14();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(sol.lastNonEmptyString(s));
    }
}
