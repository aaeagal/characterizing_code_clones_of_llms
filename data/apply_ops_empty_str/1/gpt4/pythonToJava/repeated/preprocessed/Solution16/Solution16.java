import java.util.*;
import java.io.*;
import java.util.stream.*;


class Solution16 {
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
        Solution16 solution = new Solution16();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(solution.lastNonEmptyString(s));
        System.exit(0);
    }
}
