import java.util.*;
import java.io.*;



public class Solution15 {
    public String lastNonEmptyString(String s) {
        HashMap<Character, Integer> d = new HashMap<>();
        for (char c : s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> dList = new ArrayList<>(d.entrySet());
        dList.sort((a, b) -> b.getValue() - a.getValue());

        int highest = dList.get(0).getValue();
        HashMap<Character, Integer> dNew = new HashMap<>();
        String ans = "";

        for (Map.Entry<Character, Integer> entry : dList) {
            if (entry.getValue() == highest) {
                dNew.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char i : s.toCharArray()) {
            if (dNew.containsKey(i)) {
                if (dNew.get(i) == 1) {
                    ans += i;
                }
                dNew.put(i, dNew.get(i) - 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution15 sol = new Solution15();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
