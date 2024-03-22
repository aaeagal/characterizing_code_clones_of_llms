import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution6 {
    public String lastNonEmptyString(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c: s.toCharArray()){
            hm.put(c, hm.getOrDefault(c,0)+1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(hm.entrySet());
        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        int highest = list.get(0).getValue();
        HashMap<Character, Integer> d = new HashMap<>();
        String ans = "";

        for(Map.Entry<Character, Integer> entry: list){
            if(entry.getValue() == highest){
                d.put(entry.getKey(), entry.getValue());
            }else{
                break;
            }
        }

        for(char i : s.toCharArray()){
            if(d.containsKey(i)){
                if(d.get(i)==1){
                    ans += i;
                }
                d.put(i, d.get(i)-1);
            }
        }

        return ans;
    }

    public static void main(String[] args){
        Solution6 sol = new Solution6();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(sol.lastNonEmptyString(s));
        System.exit(0);
    }
}
