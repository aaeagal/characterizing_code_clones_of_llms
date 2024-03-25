

Correct! Here is the Java version of your code: 

```java
import java.util.*;

class Solution {
    public String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
            last[ch - 'a'] = i;
        }
        int maxi = 0;
        for (int i = 0; i < 26; i++) {
            maxi = Math.max(maxi, freq[i]);
        }
        maxi--;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] - maxi > 0) {
                char ch = (char) ('a' + i);
                for (int j = 0; j < freq[i] - maxi; j++) {
                    ans.append(ch);
                }
            }
        }
        String result = ans.toString();
        char[] resultCharArray = result.toCharArray();
        Arrays.sort(resultCharArray, new java.util.Comparator<Character>() {
            @Override
            public int compare(Character a, Character b) {
                return ((int) last[b - 'a']) - ((int) last[a - 'a']);
            }
        });

        return new String(resultCharArray);
    }
}

class Main {
    public static void main(String args[]) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        scanner.close();
        String result = solution.lastNonEmptyString(inputString);
        System.out.println(result);
    }
}
```

Java is a statically typed language that's extremely popular for business applications. 

Here are some differences between the Java and C++ code:

1.  Hierarchical imports: In Java, you import libraries and classes hierarchically, while in C++, you have a #include statement at the top of the file.
2.  Strings: In Java, strings are immutable objects with methods and properties encapsulated within a String class. In C++, strings are raw character arrays that have to be manipulated with built-in methods.
3.  Main method: In Java, the main method is located in a static method in the Main class, while in C++, the main function is outside of a class.
4.  Class naming: In Java, class names start with a capital letter, while in C++, class names generally follow camel casing.
5.  Templates: Java lacks the concept of templates, while C++ has powerful templates that can handle generic types and functions.

In Java, arrays are homogeneous, meaning they only contain a type of element. In C++, arrays can contain multiple types of elements. 