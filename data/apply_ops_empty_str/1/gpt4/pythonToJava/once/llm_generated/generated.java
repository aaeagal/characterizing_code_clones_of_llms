Apologies for the confusion but Java is a statically-typed language which means certain features like dynamic typing and first-class functions do not exist in Java. Also, the Java collections framework does not have Counter or defaultdict like classes. 

Python is a dynamic, high-level, and interpreted language. It is indeed versatile and allows us to write elegant scripts in fewer lines of code. However, Java and Python aren't directly comparable in this way since cloning Python idioms like dictionary comprehension into Java would lead to overly-complicated and verbose code, which is contradictory to best coding practices.

Nevertheless, here is a simplified Java code that serves a similar function to your Python script.

```java
import java.util.*;

public class Solution {
    
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
```
Note: This code has no exact clones because each Java code is unique in terms of variable naming and structure, especially considering Java's strict syntax. But the logic remains intact in all versions.