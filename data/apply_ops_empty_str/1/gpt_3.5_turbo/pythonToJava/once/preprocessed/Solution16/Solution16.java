import java.util.*;
import java.io.*;
import java.util.stream.*;
class Solution16 {
    public String lastNonEmptyString(String s) {
        
        Map<Character, Integer> d = new TreeMap<>();
        List<Map.Entry<Character, Integer>> d_list = new ArrayList<>(d.entrySet());
        
        int highest = d_list.get