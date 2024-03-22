import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution12 {

    public String lastNonEmptyString(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        int highest = list.get(0).getValue();

        map = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        int i = 0;
  
        for (Map.Entry<Character, Integer> entry : list) {
            if (entry.getValue() == highest) {
                map.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
            i++;
        }

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (map.get(c)==1){
                    ans.append(c);
                }
                map.put(c,map.get(c)-1);
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        Solution12 sol = new Solution12();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
