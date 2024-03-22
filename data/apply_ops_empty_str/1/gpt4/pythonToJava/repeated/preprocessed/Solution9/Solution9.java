import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Solution9 {

    public String lastNonEmptyString(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        int highest = list.get(0).getValue();
        String ans = "";
        for(Map.Entry<Character, Integer> entry : list){
            if(entry.getValue() == highest){
                if(entry.getValue() == 1)
                    ans += entry.getKey();
                entry.setValue(entry.getValue() - 1);
            } else {
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        Solution9 sol = new Solution9();
        System.out.println(sol.lastNonEmptyString(s));
        sc.close();
    }
}
