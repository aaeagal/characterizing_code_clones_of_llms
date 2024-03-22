import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution15 {
    
    public static String lastNonEmptyString(String s) {
        HashMap<Character, Integer> counter = new HashMap<>();
        for(char c: s.toCharArray())
            counter.put(c, counter.getOrDefault(c, 0)+1);
            
        List<Map.Entry<Character, Integer>> list = new LinkedList<>(counter.entrySet());
        //sort the list based on values in descending order
        Collections.sort(list, (a, b) -> b.getValue().compareTo(a.getValue()) );

        int highest = list.get(0).getValue();
        
        Map<Character, Integer> d = new HashMap<>();
        String ans = "";
        
        for(Map.Entry<Character,Integer> item : list) {
            char key = item.getKey();
            int val = item.getValue();
            if(val == highest) {
                d.put(key,val);
            } else {
                break;
            }
        } 

        for(char i: s.toCharArray()) {
            if(d.containsKey(i)) {
                if(d.get(i)==1)
                    ans += i;
                d.put(i, d.get(i)-1);
            }
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lastNonEmptyString(s));
    }
}
