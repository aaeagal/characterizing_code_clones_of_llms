import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Solution sol = new Solution();
        // read only one line
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        scanner.close();
        System.out.println(sol.lastNonEmptyString(s));
        // end the program
        System.exit(0);
    }
}

class Solution {
    public String lastNonEmptyString(String s) {
        Map<Character, Integer> d = new HashMap<>();
        for (char c : s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }

        // Sorting the map
        String ans = "";
        int highest = 0;
        for (int val : d.values()) {
            highest = Math.max(highest, val);
        }

        for (Map.Entry<Character, Integer> entry : d.entrySet()) {
            if (entry.getValue() == highest) {
                ans += entry.getKey();
            } else {
                break;
            }
        }

        Map<Character, Integer> dCopy = new HashMap<>(d);
        for (char c : s.toCharArray()) {
            if (dCopy.containsKey(c)) {
                if (dCopy.get(c) == 1) {
                    ans += c;
                }
                dCopy.put(c, dCopy.get(c) - 1);
            }
        }

        return ans;
    }
}