import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Solution1 {
    
    public static String lastNonEmptyString(String s){
        
        Map<Character, Integer> counter = new HashMap<>();
        String ans = "";
        
        for(char c : s.toCharArray()){
            counter.put(c, counter.getOrDefault(c, 0)+1);
        }
        
        int highest = Collections.max(counter.values());

        Map<Character, Integer> topFrequencies = new HashMap<>();
        for(Map.Entry<Character, Integer> entry : counter.entrySet()){
            if(entry.getValue() == highest){
                topFrequencies.put(entry.getKey(), entry.getValue());
            }
        }
        
        for(char c : s.toCharArray()){
            if(topFrequencies.containsKey(c)){
                if(topFrequencies.get(c) == 1){
                    ans += c;
                }
                topFrequencies.put(c, topFrequencies.get(c)-1);
            }
        }

        return ans;
    }
        
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().strip();
        System.out.println(lastNonEmptyString(s));
        sc.close();
    }
}
