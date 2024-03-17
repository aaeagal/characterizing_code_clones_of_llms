1.
```java
import java.util.*;

public class Main {
    public static String lastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);
        for(int i=0; i< s.length() ; i++){
            freq[s.charAt(i)-'a']++;
            last[s.charAt(i)-'a']=i;
        }
        int max = Arrays.stream(freq).max().getAsInt();
        max--;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            if(freq[i]-max >0){
                char[] chars = new char[freq[i] - max];
                Arrays.fill(chars, (char) ('a' + i));
                ans.append(new String(chars));
            }
        }
        Character[] arr = new Character[ans.length()];
        for(int i = 0; i< ans.length(); i++) {
            arr[i] = ans.charAt(i);
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> last[a - 'a']));
        StringBuilder sortedAns = new StringBuilder(arr.length);
        for (Character c : arr) {
            sortedAns.append(c.charValue());
        }
        return sortedAns.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String result = lastNonEmptyString(inputString);
        System.out.println(result);
    }
}
```
2.
```java
import java.util.*;

public class Main {
    public static String getLastNonEmptyString(String str) {
        int[] frequencyCount = new int[26];
        int[] lastIndex = new int[26];
        Arrays.fill(lastIndex, -1);
        for(int i=0; i< str.length() ; i++){
            frequencyCount[str.charAt(i)-'a']++;
            lastIndex[str.charAt(i)-'a']=i;
        }
        int maximum = Arrays.stream(frequencyCount).max().getAsInt();
        maximum--;
        StringBuilder result = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            if(frequencyCount[i]-maximum >0){
                char[] chars = new char[frequencyCount[i] - maximum];
                Arrays.fill(chars, (char) ('a' + i));
                result.append(new String(chars));
            }
        }
        Character[] arr = new Character[result.length()];
        for(int i = 0; i< result.length(); i++) {
            arr[i] = result.charAt(i);
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> lastIndex[a - 'a']));
        StringBuilder sortedResult = new StringBuilder(arr.length);
        for (Character c : arr) {
            sortedResult.append(c.charValue());
        }
        return sortedResult.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = getLastNonEmptyString(input);
        System.out.println(output);
    }
}
```
3.
```java
import java.util.*;

public class Main {
    public static String findLastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);
        for(int i=0; i< s.length() ; i++){
            freq[s.charAt(i)-'a']++;
            last[s.charAt(i)-'a']=i;
        }
        int max = Arrays.stream(freq).max().getAsInt();
        max--;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            if(freq[i]-max >0){
                char[] chars = new char[freq[i] - max];
                Arrays.fill(chars, (char) ('a' + i));
                ans.append(new String(chars));
            }
        }
        Character[] arr = new Character[ans.length()];
        for(int i = 0; i< ans.length(); i++) {
            arr[i] = ans.charAt(i);
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> last[a - 'a']));
        StringBuilder sortedAns = new StringBuilder(arr.length);
        for (Character c : arr) {
            sortedAns.append(c.charValue());
        }
        return sortedAns.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String result = findLastNonEmptyString(inputString);
        System.out.println(result);
    }
}
```
4.
```java
import java.util.*;

public class Main {
    public static String getLastNonEmptyString(String str) {
        int[] frequency = new int[26];
        int[] lastOccurrence = new int[26];
        Arrays.fill(lastOccurrence, -1);
        for(int i=0; i< str.length() ; i++){
            frequency[str.charAt(i)-'a']++;
            lastOccurrence[str.charAt(i)-'a']=i;
        }
        int maxFrequency = Arrays.stream(frequency).max().getAsInt();
        maxFrequency--;
        StringBuilder result = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            if(frequency[i]-maxFrequency >0){
                char[] chars = new char[frequency[i] - maxFrequency];
                Arrays.fill(chars, (char) ('a' + i));
                result.append(new String(chars));
            }
        }
        Character[] arr = new Character[result.length()];
        for(int i = 0; i< result.length(); i++) {
            arr[i] = result.charAt(i);
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> lastOccurrence[a - 'a']));
        StringBuilder sortedResult = new StringBuilder(arr.length);
        for (Character c : arr) {
            sortedResult.append(c.charValue());
        }
        return sortedResult.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = getLastNonEmptyString(input);
        System.out.println(output);
    }
}
```
5.
```java
import java.util.*;

public class Main {
    public static String findLastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);
        for(int i=0; i< s.length() ; i++){
            freq[s.charAt(i)-'a']++;
            last[s.charAt(i)-'a']=i;
        }
        int max = Arrays.stream(freq).max().getAsInt();
        max--;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            if(freq[i]-max >0){
                char[] chars = new char[freq[i] - max];
                Arrays.fill(chars, (char) ('a' + i));
                ans.append(new String(chars));
            }
        }
        Character[] arr = new Character[ans.length()];
        for(int i = 0; i< ans.length(); i++) {
            arr[i] = ans.charAt(i);
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> last[a - 'a']));
        StringBuilder sortedAns = new StringBuilder(arr.length);
        for (Character c : arr) {
            sortedAns.append(c.charValue());
        }
        return sortedAns.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String result = findLastNonEmptyString(inputString);
        System.out.println(result);
    }
}
```
6.
```java
import java.util.*;

public class Main {
    public static String getLastNonEmptyString(String str) {
        int[] frequency = new int[26];
        int[] lastOccurrence = new int[26];
        Arrays.fill(lastOccurrence, -1);
        for(int i=0; i< str.length() ; i++){
            frequency[str.charAt(i)-'a']++;
            lastOccurrence[str.charAt(i)-'a']=i;
        }
        int maxFrequency = Arrays.stream(frequency).max().getAsInt();
        maxFrequency--;
        StringBuilder result = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            if(frequency[i]-maxFrequency >0){
                char[] chars = new char[frequency[i] - maxFrequency];
                Arrays.fill(chars, (char) ('a' + i));
                result.append(new String(chars));
            }
        }
        Character[] arr = new Character[result.length()];
        for(int i = 0; i< result.length(); i++) {
            arr[i] = result.charAt(i);
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> lastOccurrence[a - 'a']));
        StringBuilder sortedResult = new StringBuilder(arr.length);
        for (Character c : arr) {
            sortedResult.append(c.charValue());
        }
        return sortedResult.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = getLastNonEmptyString(input);
        System.out.println(output);
    }
}
```
7.
```java
import java.util.*;

public class Main {
    public static String findLastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);
        for(int i=0; i< s.length() ; i++){
            freq[s.charAt(i)-'a']++;
            last[s.charAt(i)-'a']=i;
        }
        int max = Arrays.stream(freq).max().getAsInt();
        max--;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            if(freq[i]-max >0){
                char[] chars = new char[freq[i] - max];
                Arrays.fill(chars, (char) ('a' + i));
                ans.append(new String(chars));
            }
        }
        Character[] arr = new Character[ans.length()];
        for(int i = 0; i< ans.length(); i++) {
            arr[i] = ans.charAt(i);
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> last[a - 'a']));
        StringBuilder sortedAns = new StringBuilder(arr.length);
        for (Character c : arr) {
            sortedAns.append(c.charValue());
        }
        return sortedAns.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String result = findLastNonEmptyString(inputString);
        System.out.println(result);
    }
}
```
8.
```java
import java.util.*;

public class Main {
    public static String getLastNonEmptyString(String str) {
        int[] frequency = new int[26];
        int[] lastOccurrence = new int[26];
        Arrays.fill(lastOccurrence, -1);
        for(int i=0; i< str.length() ; i++){
            frequency[str.charAt(i)-'a']++;
            lastOccurrence[str.charAt(i)-'a']=i;
        }
        int maxFrequency = Arrays.stream(frequency).max().getAsInt();
        maxFrequency--;
        StringBuilder result = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            if(frequency[i]-maxFrequency >0){
                char[] chars = new char[frequency[i] - maxFrequency];
                Arrays.fill(chars, (char) ('a' + i));
                result.append(new String(chars));
            }
        }
        Character[] arr = new Character[result.length()];
        for(int i = 0; i< result.length(); i++) {
            arr[i] = result.charAt(i);
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> lastOccurrence[a - 'a']));
        StringBuilder sortedResult = new StringBuilder(arr.length);
        for (Character c : arr) {
            sortedResult.append(c.charValue());
        }
        return sortedResult.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = getLastNonEmptyString(input);
        System.out.println(output);
    }
}
```
9.
```java
import java.util.*;

public class Main {
    public static String findLastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);
        for(int i=0; i< s.length() ; i++){
            freq[s.charAt(i)-'a']++;
            last[s.charAt(i)-'a']=i;
        }
        int max = Arrays.stream(freq).max().getAsInt();
        max--;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            if(freq[i]-max >0){
                char[] chars = new char[freq[i] - max];
                Arrays.fill(chars, (char) ('a' + i));
                ans.append(new String(chars));
            }
        }
        Character[] arr = new Character[ans.length()];
        for(int i = 0; i< ans.length(); i++) {
            arr[i] = ans.charAt(i);
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> last[a - 'a']));
        StringBuilder sortedAns = new StringBuilder(arr.length);
        for (Character c : arr) {
            sortedAns.append(c.charValue());
        }
        return sortedAns.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String result = findLastNonEmptyString(inputString);
        System.out.println(result);
    }
}
```
10.
```java
import java.util.*;

public class Main {
    public static String getLastNonEmptyString(String str) {
        int[] frequency = new int[26];
        int[] lastOccurrence = new int[26];
        Arrays.fill(lastOccurrence, -1);
        for(int i=0; i< str.length() ; i++){
            frequency[str.charAt(i)-'a']++;
            lastOccurrence[str.charAt(i)-'a']=i;
        }
        int maxFrequency = Arrays.stream(frequency).max().getAsInt();
        maxFrequency--;
        StringBuilder result = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            if(frequency[i]-maxFrequency >0){
                char[] chars = new char[frequency[i] - maxFrequency];
                Arrays.fill(chars, (char) ('a' + i));
                result.append(new String(chars));
            }
        }
        Character[] arr = new Character[result.length()];
        for(int i = 0; i< result.length(); i++) {
            arr[i] = result.charAt(i);
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> lastOccurrence[a - 'a']));
        StringBuilder sortedResult = new StringBuilder(arr.length);
        for (Character c : arr) {
            sortedResult.append(c.charValue());
        }
        return sortedResult.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = getLastNonEmptyString(input);
        System.out.println(output);
    }
}
```
11.
```java
import java.util.*;

public class Main {
    public static String findLastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);
        for(int i=0; i< s.length() ; i++){
            freq[s.charAt(i)-'a']++;
            last[s.charAt(i)-'a']=i;
        }
        int max = Arrays.stream(freq).max().getAsInt();
        max--;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            if(freq[i]-max >0){
                char[] chars = new char[freq[i] - max];
                Arrays.fill(chars, (char) ('a' + i));
                ans.append(new String(chars));
            }
        }
        Character[] arr = new Character[ans.length()];
        for(int i = 0; i< ans.length(); i++) {
            arr[i] = ans.charAt(i);
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> last[a - 'a']));
        StringBuilder sortedAns = new StringBuilder(arr.length);
        for (Character c : arr) {
            sortedAns.append(c.charValue());
        }
        return sortedAns.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String result = findLastNonEmptyString(inputString);
        System.out.println(result);
    }
}
```
12.
```java
import java.util.*;

public class Main {
    public static String getLastNonEmptyString(String str) {
        int[] frequency = new int[26];
        int[] lastOccurrence = new int[26];
        Arrays.fill(lastOccurrence, -1);
        for(int i=0; i< str.length() ; i++){
            frequency[str.charAt(i)-'a']++;
            lastOccurrence[str.charAt(i)-'a']=i;
        }
        int maxFrequency = Arrays.stream(frequency).max().getAsInt();
        maxFrequency--;
        StringBuilder result = new StringBuilder();
        for(int i=0; i< 26 ; i++){
            if(frequency[i]-maxFrequency >0){
                char[] chars = new char[frequency[i] - maxFrequency];
                Arrays.fill(chars, (char) ('a' + i));
                result.append(new String(chars));
            }
        }
        Character[] arr = new Character[result.length()];
        for(int i = 0; i< result.length(); i++) {
            arr[i] = result.charAt(i);
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> lastOccurrence[a - 'a']));
        StringBuilder sortedResult = new StringBuilder(arr.length);
        for (Character c : arr) {
            sortedResult.append(c.charValue());
        }
        return sortedResult.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = getLastNonEmptyString(input);
        System.out.println(output);
    }
}
```
13.
```java
import java.util.*;

public class Main {
    public static String findLastNonEmptyString(String s) {
        int[] freq = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);
        for(int i=0; i< s.length() ; i++){
            freq[s.charAt(i)-'a']++;
            last[s.charAt(i)-'a']=i;
        }
        int max = Arrays.stream(freq).max().getAsInt();
        max--;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i< 26