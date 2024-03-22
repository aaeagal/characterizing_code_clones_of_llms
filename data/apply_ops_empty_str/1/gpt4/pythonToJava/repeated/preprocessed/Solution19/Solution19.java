import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution19 {
    public String lastNonEmptyString(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        Map.Entry<Character, Integer> maxEntry = null;

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0){
                maxEntry = entry;
            }
        }

        int highest = maxEntry.getValue();
        HashMap<Character, Integer> filteredMap = new HashMap<>();
        StringBuilder ans = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() == highest){
                filteredMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()){
            if (filteredMap.containsKey(c)){
                if (filteredMap.get(c) == 1){
                    ans.append(c);
                }
                filteredMap.put(c, filteredMap.get(c) - 1);
            }
        }

        return ans.toString();
    }

    public static void main(String[] args){
        Solution19 sol = new Solution19();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
    }
}
