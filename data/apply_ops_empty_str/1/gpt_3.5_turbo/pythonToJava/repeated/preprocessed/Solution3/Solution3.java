import java.util.*;
import java.io.*;



class Solution3 {
    public String lastNonEmptyString(String s) {
        HashMap<Character, Integer> d = new HashMap<>();
        for (char c : s.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }
        
        List<Map.Entry<Character, Integer>> d_list = new ArrayList<>(d.entrySet());
        Collections.sort(d_list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> entry1, Map.Entry<Character, Integer> entry2) {
                return entry2.getValue().compareTo(entry1.getValue());
            }
        });
        
        int highest = d_list.get(0).getValue();
        HashMap<Character, Integer> ans = new HashMap<>();
        
        for (Map.Entry<Character, Integer> entry : d_list) {
            if (entry.getValue() == highest) {
                ans.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (ans.containsKey(c)) {
                if (ans.get(c) == 1) {
                    sb.append(c);
                }
                ans.put(c, ans.get(c) - 1);
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}