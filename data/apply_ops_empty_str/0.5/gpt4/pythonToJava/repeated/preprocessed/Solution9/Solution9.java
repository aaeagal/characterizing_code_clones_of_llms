import java.util.*;
import java.io.*;
import java.util.stream.*;


class Solution9 {
    String lastNonEmptyString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        int highest = list.get(0).getValue();
        HashMap<Character, Integer> highestMap = new HashMap<>();
        StringBuilder ans = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : list) {
            if (entry.getValue() == highest) {
                highestMap.put(entry.getKey(), entry.getValue());
            } else {
                break;
            }
        }

        for (char c : s.toCharArray()) {
            if (highestMap.containsKey(c)) {
                if (highestMap.get(c) == 1) {
                    ans.append(c);
                }
                highestMap.put(c, highestMap.get(c) - 1);
            }
        }

        return ans.toString();
    }
}

